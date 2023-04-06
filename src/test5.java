public class test5 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        System.out.println(c1.color);

        Car1 c2 = new Car1("Green", "auto", 4);
        System.out.println(c2.color);
    }
}
class Car1 {
    String color;
    String gearType;
    int door;

//    Car1(){
//        color = "white";
//        gearType = "auto";
//        door = 4;
//    }
    Car1(){
        this("white", "auto", 4);
    }
    Car1(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
