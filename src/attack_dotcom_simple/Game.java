package attack_dotcom_simple;

public class Game {
    public void startGame() {
        boolean isAlive = true;
        int guessNum = 0;
        DotCom dotCom = new DotCom();

        //设置 dotcom 的位置（使达康网站的位置随机产生）
        int random = (int) (Math.random() * 5); //random 取 0~4
        int[] locations = {random, random+1, random+2};
        dotCom.setLocations(locations);

        while (isAlive) {
            //从命令行获取输入
            GameHelper helper = new GameHelper();
            String guessStr = helper.getUserInput("Enter guess number");
            //转换成 int 类型
            int guess = Integer.parseInt(guessStr);
            //检查是否击中并返回结果
            String result = dotCom.checkYourSelf(guess);
            System.out.println(result);
            guessNum++;
            if (result.equals("kill")) {
                isAlive = false;
            }
        }
        System.out.println("guessNum is " + guessNum);
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

}
