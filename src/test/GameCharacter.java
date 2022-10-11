package test;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        StringBuilder weaponList = new StringBuilder();
        for (String weapon : weapons) {
            weaponList.append(weapon).append(" ");
        }
        return weaponList.toString();
    }
}
