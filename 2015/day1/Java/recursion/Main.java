public class Main {

    private static int floor = 0;

    public static void main(String[] args) {
        System.out.println("Processing: " + args[0]);
        loopString(args[0]);
        System.out.println(floor);
    }

    public static String loopString(String myStr) {
        int a = myStr.charAt(0);
        if (myStr.substring(0, 1).equalsIgnoreCase("(")) {
            floor++;
        } else {
            floor--;
        }
        if (myStr.length() <= 1) return myStr;
        return loopString(myStr.substring(1));
    }
}
