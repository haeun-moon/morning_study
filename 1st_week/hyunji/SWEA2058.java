import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int sum = 0; 
        for (int i = 0; i < n.length(); i++) {
            char chrn = n.charAt(i);
            int intn = Character.getNumericValue(chrn);
            sum += intn;
        }

        System.out.println(sum);
    }
}