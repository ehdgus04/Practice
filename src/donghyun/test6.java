package donghyun;

public class test6 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
        System.out.println(p3.getLocation());

        Point p = new Point(3,4);
        System.out.println(p.getLocation());

        Point p2 = new Point();
        System.out.println(p2.getLocation());

        Point3D p4 = new Point3D();
        System.out.println(p4.getLocation());
    }
}
class Point {
    int x;
    int y;

    Point(){
        this(0,0);
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x : " +x+"\ny : "+y;
    }
}
class Point3D extends Point {
    int z;

    Point3D(){
        this(0,0,0);
    }
    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    String getLocation(){
        return "x : "+x+"\ny : "+y+"\nz : "+z;
    }
}
abstract class Abst {
    abstract void move();
}
class Abst2 extends Abst {
    void move(){

    }
}
