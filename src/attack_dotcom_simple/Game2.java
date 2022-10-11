package attack_dotcom_simple;

import java.util.ArrayList;

public class Game2 {
    public void startGame() {
        boolean isAlive = true;
        int guessNum = 0;
        DotCom2 dotCom2 = new DotCom2();
        ArrayList<String> locations = new ArrayList<>();

        //设置 dotcom 的位置（使达康网站的位置随机产生）
        int random = (int) (Math.random() * 5); //random 取 0~4
        for (int i = 0; i < 3; i++) {
            locations.add(String.valueOf(random));
            random++;
        }
        dotCom2.setLocations(locations);

        while (isAlive) {
            //从命令行获取输入
            GameHelper helper = new GameHelper();
            String guessInput = helper.getUserInput("Enter guess number");
            //检查是否击中并返回结果
            String result = dotCom2.checkYourSelf(guessInput);
            System.out.println(result);
            guessNum++;
            if (result.equals("kill")) {
                isAlive = false;
            }
        }
        System.out.println("guessNum is " + guessNum);
    }


    public static void main(String[] args) {
        Game2 game2 = new Game2();
        game2.startGame();
    }
}
