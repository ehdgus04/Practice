package donghyun.test6;

import java.util.ArrayList;

public class UserList {
    private ArrayList<UserInfo> userList = new ArrayList<>();

    public boolean newUser(UserInfo userInfo){
        try {
            userList.add(userInfo);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public boolean removeUser(String userId, String userPw){
        try {
            for(int i=0; i<userList.size(); i++){
                if(userList.get(i).getId().equals(userId) && userList.get(i).getPw().equals(userPw)) {
                    userList.remove(i);
                    return true;
                }
            } return false;
        } catch (Exception e){
            return false;
        }
    }
    public boolean checkId(String checkId, String checkUserPw){
        try {
            for(int i=0; i<userList.size(); i++){
                if(userList.get(i).getId().equals(checkId) && userList.get(i).getPw().equals(checkUserPw)){
                    return true;
                }
            } return false;
        } catch (Exception e){
            return false;
        }
    }
}
