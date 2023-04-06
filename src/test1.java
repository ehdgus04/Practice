public class test1 {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(23);
        System.out.println(t.getHour());
    }
}
class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if(isNotValidHour(hour)){
            return;
        }
        this.hour = hour;
    }
    private boolean isNotValidHour(int hour){
        return hour<0||hour>23;
        }
    Time(){}
}
