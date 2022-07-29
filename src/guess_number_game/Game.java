package guess_number_game;

public class Game {

    //产生谜底随机数
    int answerNumber = (int) (Math.random() * 10);
    public void startGame() {
        //实例化三个参与者
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        System.out.println("The answerNumber is " + answerNumber);

        int p1Number = p1.guess();
        int p2Number = p2.guess();
        int p3Number = p3.guess();

        boolean p1isRight = p1Number == answerNumber;
        boolean p2isRight = p2Number == answerNumber;
        boolean p3isRight = p3Number == answerNumber;

        while (true) {
            System.out.println("p1 guess number is " + p1Number + "中文无法解析" + p1isRight);
            System.out.println("p2 guess number is " + p2Number + "中文" + p2isRight);
            System.out.println("p3 guess number is " + p3Number + "草" + p3isRight);

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Game Over! The guess number is " + answerNumber);
                break;
            } else {
                // 更新值，为下一次循环做准备
                p1Number = p1.guess();
                p2Number = p2.guess();
                p3Number = p3.guess();

                p1isRight = p1Number == answerNumber;
                p2isRight = p2Number == answerNumber;
                p3isRight = p3Number == answerNumber;
            }
        }
    }
}
