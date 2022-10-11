package attack_dotcom_simple;

public class DotCom {
    private int[] locations;

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    /**
     * 检查玩家是否击中，并返回结果
     * @param guess 玩家猜测的数字
     * @return dotcom 的状态
     */
    public String checkYourSelf(int guess) {
        String result = "miss";
        ArrayHelper helper = new ArrayHelper();
        int neqNum = 0;
        for (int cell : locations) {
            if (cell == guess) {
                result = "hit";
                //从数组中把击中数字删除，并更新数组
                locations = helper.remove(locations, cell);
                break;
            } else {
                neqNum++;
                if (neqNum == locations.length) {
                    result = "miss";
                }
            }
        }
        if (locations.length == 0) {
            result = "kill";
        }
        return result;
    }
}
