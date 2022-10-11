package attack_dotcom_simple;

import java.util.ArrayList;

public class ArrayHelper {
    /**
     * 从数组中删除指定元素，得到一个大小改变的新数组
     * @param sourceArr 源数组
     * @param element 要删除的元素
     * @return 删除指定元素后的数组
     */
    public int[] remove(int[] sourceArr, int element) {
        //初始化一个 ArrayList，以备添加元素
        ArrayList<Integer> list = new ArrayList<>();
        int[] newArr;

        for (int x : sourceArr) {
            if (x != element) {
                list.add(x);
            }
        }
        newArr = toArr(list);
        return newArr;
    }

    //将 ArrayList<Integer> 转换成 int[]
    private int[] toArr(ArrayList<Integer> list) {
        int length = list.size();
        //创建一个和 list 大小一样的数组
        int[] arr = new int[length];
        //遍历，将 list 中的元素逐个赋给同索引的数组
        for (int i = 0; i < length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

//    public static void main(String[] args) {
//        int[] sourceArr = {2,3,4};
//        System.out.println(Arrays.toString(sourceArr));
//        ArrayHelper helper = new ArrayHelper();
//        int[] newArr = helper.remove(sourceArr, 3);
//        System.out.println(Arrays.toString(newArr));
//    }
}
