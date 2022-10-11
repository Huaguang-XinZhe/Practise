package test;

public class ExTestDrive {
    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            System.out.print("a");
        } else throw new MyEx();
    }

    public static void main(String[] args) {
        String test = "no";
        try {
            System.out.print("t");
            doRisky(test);

        } catch (MyEx e) {
            System.out.print("r");
            System.out.print("o");
        } finally {
            System.out.print("w");
            System.out.println("s");
        }
    }
}

class MyEx extends Exception {}
