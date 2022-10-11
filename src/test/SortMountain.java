package test;

import java.util.Comparator;
import java.util.LinkedList;

public class SortMountain {
    LinkedList<Mountain> mtn = new LinkedList<>();

    public static void main(String[] args) {
        new SortMountain().go();
    }

    private void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("as entered:\n" + mtn);

        NameCompare nc = new NameCompare();
        mtn.sort(nc);
        System.out.println("by name:\n" + mtn);

        HeightCompare hc = new HeightCompare();
        mtn.sort(hc);
        System.out.println("by height:\n" + mtn);
    }

    private static class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private static class HeightCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            // 返回值为正就排在前边
            return o2.getHeight() - o1.getHeight();
        }
    }
}

class Mountain {
    String name;
    int height;

    public Mountain(String n, int h) {
        name = n;
        height = h;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}