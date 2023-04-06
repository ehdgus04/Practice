public class test2 {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        Car c = null;
        FireEngine f2 = null;

        f.water();
        c = (Car)f;
//      c.water();
        f2 = (FireEngine)c;
        f2.water();
    }
}
class Car {
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brrrr");
    }
    void stop(){
        System.out.println("Stop !");
    }
}
class FireEngine extends Car {
    void water(){
        System.out.println("water !");
    }
}