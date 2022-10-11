package test;

public class MultiFor {
    public static void main(String[] args) {
        for (int x = 0; x < 4; x++) {
            //跳过 x=1 的大循环
            if (x == 1) {
                x++;
            }
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
//            //跳过 x=2 的大循环
//            if (x == 1) {
//                x++;
//            }
        }
    }
}
