import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = 1;
        for(int i=0; i<num2; i++){
            result *= num1;
        }
        System.out.println(result);
    }
}
