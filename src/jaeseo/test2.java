package jaeseo;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("알고 싶은 구구단을 입력하세요:");
        int dan = scanner.nextInt();

        for(int i=1; i<=10; i++) {
                System.out.println(dan+"x"+i+"="+dan*i);
        }
    }
}
