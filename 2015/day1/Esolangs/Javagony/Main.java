/**
 * Javagony is an OOP programming language derived from Java. The only differences to Java are that following statements are not available in Javagony:
 *
 * for (){}
 * if (){} //including else and else if
 * while (){}
 * do {} while ();
 * switch(){}
 * ?:
 * 
 * For more information check it's wiki page https://esolangs.org/wiki/Javagony
 */
public class Main {

    private static int floor = 0;

    public static void main(String[] args) {
        System.out.println("Processing: " + args[0]);
        try {
            loopString(args[0]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(floor);
        }
    }

    public static String loopString(String myStr)
	{
        int a = myStr.charAt(0);
        try {
            int b = floor/(a-40);
        } catch (ArithmeticException e) {
            ++floor;
            ++floor;
        }
        --floor;
		return loopString(myStr.substring(1));
	}
}
