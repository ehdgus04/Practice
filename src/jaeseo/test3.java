package jaeseo;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100)+1;
        System.out.println("정답을 미리 보려면 0을 입력하세요");
        int input_number;
        int repeat_count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100사이의 숫자중 무작위 숫자를 맞추시오");
        do {
            System.out.print("정답:");
            input_number = scanner.nextInt();
            repeat_count++;
            if (input_number > answer) {
                System.out.println("Down!");
            }
            if(input_number < answer) {
                System.out.println("Up!");
            }
            if(input_number<=0){
                System.out.println(answer);
            }
        }
        while (input_number != answer);
        System.out.printf("정답입니다. 총 시도횟수는 %d회 입니다\n", repeat_count);
    }
}
