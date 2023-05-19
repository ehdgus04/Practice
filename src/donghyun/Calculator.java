package donghyun;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 계산기 ===");
        while(true){
            System.out.print("사칙연산 기호를 입력하세요. ( +, -, *, / )\n>> ");
            String symbol = scanner.next();
            char ch = symbol.charAt(0);
            System.out.print("첫번째 숫자를 입력해주세요.\n>> ");
            long first = scanner.nextInt();
            System.out.print("두번째 숫자를 입력해주세요.\n>> ");
            long second = scanner.nextInt();
            switch(ch){
                case '+':
                    long answer = first + second;
                    System.out.println("답: "+answer);
                    System.out.println("식: "+first+" + "+second+" = "+answer);
                    break;
                case '-':
                    answer = first - second;
                    System.out.println("답: "+answer);
                    System.out.println("식: "+first+" - "+second+" = "+answer);
                    break;
                case '*':
                    answer = first * second;
                    System.out.println("답: "+answer);
                    System.out.println("식: "+first+" * "+second+" = "+answer);
                    break;
                case '/':
                    float answer2 = (float)first / second;
                    System.out.println("답: "+answer2);
                    System.out.println("식: "+first+" / "+second+" = "+answer2);
                    break;
            }
        }
    }
}