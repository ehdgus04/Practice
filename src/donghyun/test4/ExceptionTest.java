package donghyun.test4;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Y or N");
                String yn = scanner.next();

                if (yn.equals("Y")) {
                    System.out.println("Yes");
                } else if (yn.equals("N")) {
                    System.out.println("No");
                } else {
                    throw new Exception("다시 입력");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
