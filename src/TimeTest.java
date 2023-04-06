public class TimeTest {
    public static void main(String[] args) {
        Time2 t = new Time2();
        t.setTime(12, 50,40);
        System.out.println(t.getTime());
        t.setTime(12, 34,67);
        System.out.println(t.getTime());
    }
}
class Time2 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if((hour<0||hour>23)||(minute<0||minute>59)||(second<0||second>59)){
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String getTime(){
        return hour+":"+minute+":"+second;
    }
}
