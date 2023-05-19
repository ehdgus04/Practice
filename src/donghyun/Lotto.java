package donghyun;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lottoNumber = new int[6];
        for(int i=0; i<lottoNumber.length; i++){
            lottoNumber[i] = (int)(Math.random()*48)+1;
        }
        int count = 0;
        Arrays.sort(lottoNumber);
        System.out.print("첫번째 숫자 >> ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자 >> ");
        int num2 = scanner.nextInt();
        System.out.print("세번째 숫자 >> ");
        int num3 = scanner.nextInt();
        System.out.print("네번째 숫자 >> ");
        int num4 = scanner.nextInt();
        System.out.print("다섯번째 숫자 >> ");
        int num5 = scanner.nextInt();
        System.out.print("보너스 숫자 >> ");
        int num6 = scanner.nextInt();

        if(num1==lottoNumber[0]){
            count++;
        }
        if(num2==lottoNumber[1]){
            count++;
        }
        if(num3==lottoNumber[2]){
            count++;
        }
        if(num4==lottoNumber[3]){
            count++;
        }
        if(num5==lottoNumber[4]){
            count++;
        }
        if(num6==lottoNumber[5]){
            count++;
        }
        switch(count){
            case 0:
                System.out.println("낙첨");
                break;
            case 1:
                System.out.println("6등");
                break;
            case 2:
                System.out.println("5등");
                break;
            case 3:
                System.out.println("4등");
                break;
            case 4:
                System.out.println("3등");
                break;
            case 5:
                System.out.println("2등");
                break;
            case 6:
                System.out.println("1등");
        }
        System.out.println("당첨번호: "+Arrays.toString(lottoNumber));

    }
}
