package donghyun.test6;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserList userList = new UserList();
        boolean onGoing = true;
        while(onGoing){
            try {
                System.out.print("회원가입하려면 '1', 회원탈퇴하려면 '2', 회원정보를 조회하려면 '3'을 입력해주세요. >> ");
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("[ 회원가입 ] 이름을 입력해주세요. >> ");
                        String newName = scanner.next();
                        System.out.print("[ 회원가입 ] 생년월일 8자리를 입력해주세요. (예: 20230414 ) >> ");
                        int newBirthDate = scanner.nextInt();
                        System.out.print("[ 회원가입 ] 사용하실 아이디를 입력해주세요. >> ");
                        String newId = scanner.next();
                        System.out.print("[ 회원가입 ] 사용하실 비밀번호를 입력해주세요. >> ");
                        String newPw = scanner.next();

                        UserInfo userInfo = new UserInfo(newName, newBirthDate, newId, newPw);

                        if(userList.newUser(userInfo)){
                            System.out.println("[ 회원가입 ] 회원가입에 성공했습니다 !");
                        } else {
                            System.out.println("[ 회원가입 ] 회원가입에 실패했습니다.");
                        }

                        break;
                    case 2:
                        System.out.print("[ 회원탈퇴 ] 탈퇴하실 아이디를 입력해주세요. >> ");
                        String secessionId = scanner.next();
                        System.out.print("[ 회원탈퇴 ] 비밀번호를 입력해주세요. >> ");
                        String secessionPw = scanner.next();

                        if(userList.removeUser(secessionId, secessionPw)){
                            System.out.println("회원탈퇴가 성공적으로 완료되었습니다.");
                        } else {
                            System.out.println("회원탈퇴에 실패하였습니다.");
                        }

                        break;
                    case 3:
                        System.out.print("[ 회원정보 ] 조회할 아이디를 입력해주세요. >> ");
                        String checkUser = scanner.next();
                        System.out.print("[ 회원정보 ] 비밀번호를 입력해주세요. >> ");
                        String checkUserPw = scanner.next();


                        break;
                }
            } catch (Exception e) {

            }
        }
    }
}
