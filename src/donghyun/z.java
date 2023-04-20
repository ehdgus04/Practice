package donghyun;

import java.util.ArrayList;
import java.util.Arrays;

public class z {
    public static void main(String[] args) {
        String[] names1 = {"test","test","test"};
        String[] names2 = {"gd","gd","gd"};
        String[] names3 = {"qd","qd","qd"};
        String[] names4 = {"1","2","3"};
        ArrayList<String[]> nameList = new ArrayList<>();
        nameList.add(names1);
        nameList.add(names2);
        nameList.add(names3);
        nameList.add(names4);
        for(String[] t: nameList){
            System.out.println(Arrays.toString(t));
        }
    }
}
