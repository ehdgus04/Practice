package donghyun.test6;

import java.util.Scanner;

public class jaeseo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean onGoing = true;

        while(onGoing){
            try {
                System.out.print("김재서는 븅진이다. 'Yes' or 'No' >> ");
                String jaeseo = scanner.next();
                if(jaeseo.equals("Yes")){
                    System.out.println("사실");
                    onGoing = false;
                } else if(jaeseo.equals("No")){
                    System.out.println("거짓");
                } else {
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
