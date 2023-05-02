package donghyun.test7;

import java.util.Scanner;

import static donghyun.test7.BankType.*;

public class OopProject2 {
    static Sh sh = new Sh();
    static Nh nh = new Nh();
    static Kb kb = new Kb();
    static Ibk ibk = new Ibk();
    static Scanner scanner = new Scanner(System.in);
    static int i = 1000;
    public static void main(String[] args) {
        boolean onGoing = true;
        while (onGoing) {
            try {
                System.out.println("[ SH ] [ NH ] [ KB ] [ IBK ]\n업무를 이용할 은행을 입력해주세요.");
                BankType bankType = BankType.valueOf(scanner.next());

                switch (bankType) {
                    case SH:
                        service(sh, SH);
                        break;

                    case NH:
                        service(nh, NH);
                        break;

                    case KB:
                        service(kb, KB);
                        break;

                    case IBK:
                        service(ibk, IBK);
                        break;

                    default:
                        throw new Exception();
                }
            } catch (Exception e){
                System.out.println("[ 시스템 ] 잘못 입력하셨습니다.");
            }
        }
    }
    public static void inner(Bank bank, BankType bankType){
        System.out.println("[ "+bankType+" ] 계좌개설 서비스를 선택하셨습니다.");
        System.out.println("[ 계좌개설 ] 고객 고유번호를 입력해주세요.");
        int id = scanner.nextInt();
        System.out.println("[ 계좌개설 ] 고객 비밀번호를 입력해주세요.");
        String pw = scanner.next();


    }

    public static void service(Bank bank, BankType bankType){
        try {
            System.out.println("[ " + bankType + " ] 기존 회원이시면 '1', 아니시면 '2' 를 눌러주세요.");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    int repeatAnswer = 0;
                    while (repeatAnswer == 0) {
                        System.out.println("[ "+bankType+" ] 필요하신 업무를 선택해주세요.\n계좌 개설은 '1', 계좌 조회는 '2', 계좌 입금은 '3', 계좌 인출은 '4', 계좌 이체는 '5', 다시듣기는 '0'");
                        repeatAnswer = scanner.nextInt();
                        switch (repeatAnswer) {
                            case 1:
                                inner(bank, bankType);
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 0:
                                break;
                            default:
                                throw new Exception();
                        }
                    }
                    break;
                case 2:
                    System.out.println("[ "+bankType+" ] 가입을 원하시면 '1', 이전으로 돌아가시려면 '2' 를 입력해주세요.");
                    int answer2 = scanner.nextInt();
                    switch(answer2){
                        case 1:
                            System.out.println("[ 고객가입 ] 성함을 입력해주세요.");
                            String name = scanner.next();
                            System.out.println("[ 고객가입 ] 주민등록번호 6자리를 입력해주세요.");
                            int birthDate = scanner.nextInt();
                            System.out.println("[ 고객가입 ] 사용하실 비밀번호를 입력해주세요.");
                            String pw = scanner.next();

                            Customer customer = new Customer(++i, birthDate, name, pw);

                            break;
                        case 2:
                            break;
                        default:
                            throw new Exception();
                    }
                    break;
                default:
                    throw new Exception();
            }
        } catch(Exception e){
            System.out.println("[ 시스템 ] 잘못 입력하셨습니다.");
        }
    }
}
