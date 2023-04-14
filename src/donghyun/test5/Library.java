package donghyun.test5;

import java.util.ArrayList;

public class Library {
    private ArrayList<User> userList = new ArrayList<>();

    public boolean join(User user){
        try {
            userList.add(user);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public boolean removeUser(String userId, String userPw){
        try {
            for(int i=0; i<userList.size(); i++){
                if(userList.get(i).getId().equals(userId) && userList.get(i).getPw().equals(userPw)){
                    userList.remove(i);
                    return true;
                }
            } return false;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
//    public User myInfo(String id, String pw){
//        for(int i=0; i<userList.size(); i++){
//        }
//    }
}
