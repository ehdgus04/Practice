public class test {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        //System.out.println(mm.add());
        System.out.println(mm.add(3,5));
    }
}
class MyMath {
    int a = 3;
    int b = 5 ;

    int add2(int a, int b, int y){
        return a+b;
    }
    static int add(int a, int b){
        return a+b;
    }
    int add2(int a, int b){
        return a+b;
    }
}


