package InterviewQuestions;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            int res = n/0;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Programme Completed");
    }
}
