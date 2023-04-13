package donghyun.test5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OopProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean onGoing = true;
        while (onGoing) {
            try {
                System.out.print("전자도서관을 이용하려면 'Y', 또는 'N'을 입력해주세요. >> ");
                String yn = scanner.next();
                if (yn.equals("Y")) {
                    System.out.print("회원 관련 업무는 '1', 도서 관련 업무는 '2'를 입력해주세요. >> ");
                    int number = scanner.nextInt();
                    switch (number) {
                        case 1:
                            System.out.print("회원가입은 '1', 회원탈퇴는 '2', 회원정보확인은 '3'을 입력해주세요.");
                            int number2 = scanner.nextInt();
                            switch (number2) {
                                case 1:
                                    System.out.print("[ 회원가입 ] 이름을 입력해주세요. >> ");
                                    String newName = scanner.next();
                                    System.out.print("[ 회원가입 ] 사용하실 아이디를 입력해주세요. >> ");
                                    String newId = scanner.next();
                                    System.out.print("[ 회원가입 ] 사용하실 비밀번호를 입력해주세요. >> ");
                                    String newPw = scanner.next();

                                    User user = new User(newName, newId, newPw, LocalDateTime.now());

                                    if(library.join(user)){
                                        System.out.println("회원가입을 성공했습니다.");
                                    } else {

                                    }

                                    break;

                                case 2:
                                    System.out.print("[ 회원탈퇴 ] 탈퇴할 아이디를 입력해주세요. >> ");
                                    String deleteId = scanner.next();
                                    System.out.print("[ 회원탈퇴 ] 비밀번호를 입력해주세요. >> ");
                                    String deletePw = scanner.next();

                                    if(library.removeUser(deleteId, deletePw)){
                                        System.out.println("회원탈퇴가 완료됐습니다.");
                                    }

                                    break;

                                case 3:
                                    System.out.print("[ 회원정보확인 ] 아이디를 입력해주세요. >> ");
                                    String infoUserId = scanner.next();
                                    System.out.print("[ 회원정보확인 ] 비밀번호를 입력해주세요. >> ");
                                    String infoUserPw = scanner.next();



                                    break;
                            }
                            break;

                        case 2:

                            break;
                    }
                } else if (yn.equals("N")) {
                    System.out.println("프로그램을 종료합니다.");
                    onGoing = false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("다시 입력해주세요.");
            }
        }
    }
}
