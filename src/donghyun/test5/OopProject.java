package donghyun.test5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OopProject {
    static int i = 1000;
    static int j = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean onGoing = true;
        while (onGoing) {
            try {
                System.out.print("전자도서관을 이용하려면 'Y', 또는 'N'을 입력해주세요. >> ");
                String answer = scanner.next();
                if (answer.equals("Y")) {
                    System.out.print("회원 관련 업무는 '1'\n도서 관련 업무는 '2'를 입력해주세요. >> ");
                    int number = scanner.nextInt();
                    switch (number) {
                        case 1:
                            System.out.print("회원가입은 '1'\n회원탈퇴는 '2'\n회원정보확인은 '3'을 입력해주세요. >> ");
                            int number2 = scanner.nextInt();
                            switch (number2) {
                                case 1:
                                    System.out.print("[ 회원가입 ] 이름을 입력해주세요. >> ");
                                    String newName = scanner.next();
                                    System.out.print("[ 회원가입 ] 나이를 입력해주세요. >> ");
                                    int newAge = scanner.nextInt();
                                    System.out.print("[ 회원가입 ] 사용하실 아이디를 입력해주세요. >> ");
                                    String newId = scanner.next();
                                    System.out.print("[ 회원가입 ] 사용하실 비밀번호를 입력해주세요. >> ");
                                    String newPw = scanner.next();

                                    User user = new User(newName, newAge, newId, newPw, ++i, LocalDateTime.now());

                                    if(library.join(user)){
                                        System.out.println("[ 시스텝 ] 회원가입을 성공했습니다. 회원고유번호: "+i+" / 가입날짜: "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd")));
                                    } else {
                                        System.out.println("[ 시스템 ] 회원가입을 실패했습니다.");
                                    }
                                    break;

                                case 2:
                                    System.out.print("[ 회원탈퇴 ] 탈퇴할 아이디를 입력해주세요. >> ");
                                    String deleteId = scanner.next();
                                    System.out.print("[ 회원탈퇴 ] 회원고유번호를 입력해주세요. >> ");
                                    int deleteUserNumber = scanner.nextInt();
                                    System.out.print("[ 회원탈퇴 ] 비밀번호를 입력해주세요. >> ");
                                    String deletePw = scanner.next();

                                    if(library.removeUser(deleteId/*deleteUserNumber*/, deletePw)){
                                        System.out.println("[ 시스템 ] 회원탈퇴를 성공됐습니다.");
                                    } else {
                                        System.out.println("[ 시스템 ] 회원탈퇴를 실패했습니다.");
                                    }
                                    break;

                                case 3:
                                    System.out.print("[ 회원정보확인 ] 아이디를 입력해주세요. >> ");
                                    String infoUserId = scanner.next();
                                    System.out.print("[ 회원정보확인 ] 비밀번호를 입력해주세요. >> ");
                                    String infoUserPw = scanner.next();

                                    break;

                                default:
                                    throw new Exception();
                            }
                            break;

                        case 2:
                            System.out.print("도서 등록은 '1'\n도서 대출은 '2'\n전체 도서목록 조회는 '3'을 입력해주세요. >> ");
                            int number3 = scanner.nextInt();
                            switch(number3){
                                case 1:
                                    System.out.print("[ 도서등록 ] 제목을 입력해주세요. >> ");
                                    String title = scanner.next();
                                    System.out.print("[ 도서등록 ] 저자를 입력해주세요. >> ");
                                    String author = scanner.next();
                                    System.out.print("[ 도서등록 ] 출판사를 입력해주세요 >> ");
                                    String publisher = scanner.next();
                                    System.out.print("[ 도서등록 ] 내용을 입력해주세요. >> ");
                                    String content = scanner.next();

                                    Book book = new Book(title, author, publisher, content, ++j, LocalDateTime.now());

                                    if(library.join(book)){
                                        System.out.println("[ 시스템 ] 도서등록을 성공했습니다. 도서고유번호: "+j+" / 등록날짜: "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd")));
                                    } else {
                                        System.out.println("[ 시스템 ] 도서등록을 실패했습니다.");
                                    }

                                    break;

                                case 2:
                                    break;

                                case 3:
                                    break;

                                default:
                                    throw new Exception();
                            }
                            break;
                        default:
                            throw new Exception();
                    }
                } else if (answer.equals("N")) {
                    System.out.println("프로그램을 종료합니다.");
                    onGoing = false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("[ 시스템 ] 다시 입력해주세요.");
            }
        }
    }
}
