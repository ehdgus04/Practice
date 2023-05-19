package donghyun;

import java.util.Scanner;

public class UpDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int count = 1;
        while (true) {
            System.out.print("1 ~ 100 사이의 정수를 입력하세요.\n>> ");
            try {
                int input = scanner.nextInt();
                    if (input == answer) {
                        System.out.println("정답입니다! 답: " + answer + " / 시도한 횟수: " + count);
                        break;
                    } else if (input > answer) {
                        System.out.println("Down!");
                        count++;
                        continue;
                    } else if (input < answer) {
                        System.out.println("Up");
                        count++;
                        continue;
                    }
            } catch (Exception e){
                scanner = new Scanner(System.in);
                System.out.println("[ERROR] 숫자를 입력해주세요.");
            }
        }
    }
}