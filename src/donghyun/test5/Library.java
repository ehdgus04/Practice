package donghyun.test5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<User> userList = new ArrayList<>();
    private ArrayList<Book> bookList = new ArrayList<>();

    public boolean join(User user){
        try {
            for(int i=0; i<userList.size(); i++){
                User value = userList.get(i);
                if(value.getId().equals(user.getId())){
                    System.out.println("[ 회원가입 ] 중복된 아이디가 있습니다."+" ( ID: "+user.getId()+" )");
                    return false;
                }
            }
            userList.add(user);
            return true;
        } catch (Exception e){
            System.out.println("[ 시스템 ] 알 수 없는 오류가 발생했습니다.");
            return false;
        }
    }
    public boolean removeUser(String userId, int userNumber, String userPw){
        try {
            for(int i=0; i<userList.size(); i++){
                User value = userList.get(i);
                if(value.getId().equals(userId) && value.getUserNumber()==(userNumber) && value.getPw().equals(userPw)){
                    userList.remove(i);
                    return true;
                }
            }
            return false;
        } catch (Exception e){
            System.out.println("[ 시스템 ] 알 수 없는 오류가 발생했습니다.");
            return false;
        }
    }
    public User myInfo(String infoUserId, String infoUserPw){
        for(int i=0; i<userList.size(); i++){
            User value = userList.get(i);
            if(value.getId().equals(infoUserId) && value.getPw().equals(infoUserPw)){
                return value;
            }
        }
        return null;
    }
    public boolean join(Book book){
        try {
            for(int i=0; i<bookList.size(); i++){
                Book value = bookList.get(i);
                if(value.getAuthor().equals(book.getAuthor())&&value.getTitle().equals(book.getTitle())){
                    System.out.println("[ 도서등록 ] 중복된 도서명과 저자명입니다.");
                    return false;
                }
            }
            bookList.add(book);
            return true;
        } catch (Exception e){
            System.out.println("[ 시스템 ] 알 수 없는 오류가 발생했습니다.");
            return false;
        }
    }
    public boolean removeBook(String title, String Author){
        try {
            for(int i=0; i<bookList.size(); i++){
                Book value = bookList.get(i);
                if(value.getTitle().equals(title) && value.getAuthor().equals(Author)){
                    bookList.remove(i);
                    return true;
                }
            } return false;
        } catch (Exception e){
            System.out.println("[ 시스템 ] 알 수 없는 오류가 발생했습니다.");
            return false;
        }
    }
    public ArrayList<String> lookUpBookList(){
        ArrayList<String> bookList2 = new ArrayList<>();
        for(Book book : bookList){
            bookList2.add(book.getTitle());
        }
        return bookList2;
    }
    public boolean borrowBook(User user, String title, String author){
        for(int i=0; i<userList.size(); i++){
            User value = userList.get(i);
            if(value.getId().equals(user.getId()) && value.getPw().equals(user.getPw())){
                if(removeBook(title, author)){
                    System.out.println(user.getId()+" 님이 "+title+" ("+author+") 을 대여했습니다.");
                    return true;
                } else {
                    System.out.println("[ 시스템 ] 책 정보가 없습니다.");
                }
            } else {
                System.out.println("[ 시스템 ] 회원 정보가 없습니다.");
            }
        } return false;
    }
}
