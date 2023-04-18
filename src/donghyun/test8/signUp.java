package donghyun.test8;

import java.util.Scanner;

public class signUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean onGoing = true;
        while(onGoing){
            try {
               System.out.print("[ 1. 회원가입 ] [ 2. 회원정보조회 ] [ 3. 회원탈퇴 ]\n이용할 서비스를 선택하세요. >> ");
               int service = scanner.nextInt();
               switch (service){
                   case 1:
                       System.out.println("회원가입 서비스를 선택했습니다.");
                       System.out.print("[ 회원가입 ] 이름을 입력하세요. >> ");
                       String name = scanner.next();
                       System.out.print("[ 회원가입 ] 생년월일을 입력하세요. (예: 20230101) >> ");
                       int birthDate = scanner.nextInt();
                       System.out.print("[ 회원가입 ] 학교를 입력하세요. (예: 동서울대학교)  >> ");
                       String school = scanner.next();
                       System.out.print("[ 회원가입 ] 학과명을 입력하세요. >> ");
                       String department = scanner.next();
                       System.out.print("[ 회원가입 ] 사용할 아이디를 입력하세요. >> ");
                       String id = scanner.next();
                       System.out.print("[ 회원가입 ] 사용할 비밀번호를 입력하세요. >> ");
                       String password = scanner.next();

                       User user = new User(name, birthDate, school, department, id, password);

                       System.out.println("[ 회원가입 ] 회원가입이 성공적으로 완료되었습니다.");
                       break;
                   case 2:
                       System.out.println("회원정보조히 서비스를 선택했습니다.");
                       break;
                   case 3:

                       break;
                   default :
                       throw new Exception("입력값 오류");
               }
            } catch (Exception e){

            }
        }
    }
}
