package guess_number_game;

public class Player {
    public int guess() {
        return (int) (Math.random() * 10);
    }
}
