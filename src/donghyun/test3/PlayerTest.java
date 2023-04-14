package donghyun.test3;

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player();
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}
abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}
class AudioPlayer extends Player {
    void play(int pos){
        System.out.println(pos+" 위치부터 play 합니다.");
    }
    void stop(){
        System.out.println("재생을 멈춥니다.");
    }
}
