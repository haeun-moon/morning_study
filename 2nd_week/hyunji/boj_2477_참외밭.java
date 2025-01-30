import java.util.*;

public class Main {
    public static void main(String[] args) {
        //(큰 사각형 넓이 - 작은 사각형 넓이) * 제곱미터당 참외 개수
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int[][] fieldLen = new int[6][2]; 
        for (int i = 0; i < 6; i++) {
            fieldLen[i][0] = sc.nextInt();
            fieldLen[i][1] = sc.nextInt();
        }

        int maxWidth = 0, maxHeight = 0; //큰 사각형 가로 세로
        
        for (int i = 0; i < 6; i++) {
            if (fieldLen[i][0] == 1 || fieldLen[i][0] == 2) { //1, 2 => 가로
                maxWidth = Math.max(maxWidth, fieldLen[i][1]);
            }
            if (fieldLen[i][0] == 3 || fieldLen[i][0] == 4) { //3, 4 => 세로
                maxHeight = Math.max(maxHeight, fieldLen[i][1]);
            }
        } 

        int needWidth = 0, needHeight = 0; //큰 사각형 길이 - 필요한 길이 => 작은 사각형 길이

        for (int i = 0; i < 6; i++) { //max변 기준 인덱스 전후 탐색하면서 need변 구하기
            int prev = (i - 1 < 0) ? 5 : i - 1;
            int next = (i + 1 > 5) ? 0 : i + 1;

            if ((fieldLen[i][0] == 1 || fieldLen[i][0] == 2) && fieldLen[i][1] == maxWidth) { //해당 변이 가로이면서 max가로 변이고
                needHeight = (fieldLen[prev][1] == maxHeight) ? fieldLen[next][1] : fieldLen[prev][1]; //이전 인덱스가 max세로 변? need변은 다음 인덱스
            }

            if ((fieldLen[i][0] == 3 || fieldLen[i][0] == 4) && fieldLen[i][1] == maxHeight) {
                needWidth = (fieldLen[prev][1] == maxWidth) ? fieldLen[next][1] : fieldLen[prev][1];
            }
        }

        int bigField = maxWidth * maxHeight; 
        int smallField = (maxWidth-needWidth) * (maxHeight-needHeight); 
        int realField = bigField - smallField; 

        System.out.println(realField * k);
    }
}
