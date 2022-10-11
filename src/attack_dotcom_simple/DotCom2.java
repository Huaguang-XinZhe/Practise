package attack_dotcom_simple;

import java.util.ArrayList;

//应用 ArrayList API 的新的 DotCom 类
public class DotCom2 {
    private ArrayList<String> locations = new ArrayList<>();

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public String checkYourSelf(String guessInput) {
        String result;

        int index = locations.indexOf(guessInput);
        if (index >= 0) {
            result = "hit";
            locations.remove(guessInput);
        } else {
            result = "miss";
        }

        if (locations.isEmpty()) {
            result = "kill";
        }
        return result;
    }
}
