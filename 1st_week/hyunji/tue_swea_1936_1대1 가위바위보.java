import java.util.*;

class Solution {
    public static void main(String[] args) {
        //1<2, 2<3 / 1>3
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == 1 && B == 3) {
            System.out.println("A");
        }
        else if (A == 3 && B == 1) {
            System.out.println("B");
        }
        else if (A > B) {
            System.out.println("A");
        }
        else System.out.println("B");
    }
}