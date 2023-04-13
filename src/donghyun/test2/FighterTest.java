package donghyun.test2;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();
        f2.attack(f2);

//        Unit2 u = new Fighter();
//        Fightable f = new Fighter();
//
//        u.move(100,200);
//        u.stop();
////        u.attack(new Fighter()); Unit2에는 attack()이 없어서 호출불가
//
//        f.move(100,200);
//        f.attack(new Fighter());
////        f.stop(); Fightable에는 stop()가 없어서 호출불가
    }
}
abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다.");
    }
}
interface Fightable {
    void move(int x, int y); // public abstract 생략됨
    public abstract void attack(Fightable f);
}
class Fighter extends Unit2 implements Fightable {
    public void move(int x, int y){
        System.out.println("[ "+x+" , "+y+ " ] 로 이동");
    }
    public void attack(Fightable f){
        System.out.println(f+" 을/를 공겨");
    }
    Fightable getFightable(){
        Fighter f = new Fighter();
        return (Fightable)f;
    }
}
