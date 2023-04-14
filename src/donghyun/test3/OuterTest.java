package donghyun.test3;

public class OuterTest {
    private int outerIv = 0;
    private static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }
    static class StaticInner {
//        int siv = outerIv;
        static int scv = outerCv;
    }
    void myMethod() {
        int Lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int iiv2 = outerCv;
            int iiv3 = Lv;
            int llv4 = LV;
        }
    }
}
