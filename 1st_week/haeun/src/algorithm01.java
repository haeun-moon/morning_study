import java.util.Scanner;

public class algorithm01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A-B==1) {
            System.out.println("A");
        } else if (A-B==2) {
            System.out.println("B");
        } else if (A-B==-1) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

//        System.out.println();


    }
}
