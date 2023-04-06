public class test7 {
    public static void main(String[] args) {
        Test7 t7 = new Test7();
        t7.dowork(new FireEngine());
    }
}
class Test7 {
    void dowork(Car d){
        if(d instanceof FireEngine){
            FireEngine fe = (FireEngine)d;
            fe.water();
        }
    }
}
