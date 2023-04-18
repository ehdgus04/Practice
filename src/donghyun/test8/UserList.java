package donghyun.test8;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> userList = new ArrayList<>();

    public boolean join(User user){
        try {
            for (int i = 0; i < userList.size(); i++) {
                User value = userList.get(i);
                if (value.getId().equals(user.getId())) {
                    System.out.println("이미 있는 ID 정보입니다.");
                    return false;
                }
            }
            userList.add(user);
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
