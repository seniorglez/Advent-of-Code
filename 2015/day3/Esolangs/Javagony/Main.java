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

import java.util.HashMap;
import java.util.Map;

public class Main {

	private static int currentXCoordinate = 0;
    private static int currentYCoordinate = 0;
    private static Map<String, Boolean> giftHouses;

    private static String buildCoordinates(int x, int y) {
        return x + ":" + y;
    }

    private static void insertNextHouse(char ch) {

        try {
            compareChars (ch, '>');
        } catch (ArithmeticException e) {
            currentXCoordinate += 1;
        }
        try {
            compareChars (ch, '<');
        } catch (ArithmeticException e) {
            currentXCoordinate -= 1;
        }
        try {
            compareChars (ch, '^');
        } catch (ArithmeticException e) {
            currentYCoordinate += 1;
        }
        try {
            compareChars (ch, 'v');
        } catch (ArithmeticException e) {
            currentYCoordinate -= 1;
        }

        giftHouses.put(buildCoordinates(currentXCoordinate, currentYCoordinate), true);
    }
    
    public static void compareChars (char cha, char chb) throws ArithmeticException {
        int a = 223/(cha-chb);
    }

    public static String loopString(String s) {
        insertNextHouse(s.charAt(0));
        return loopString(s.substring(1));
    }

	public static void main(String[] args) {
        System.out.println("Processing: " + args[0]);
        giftHouses = new HashMap<String, Boolean>();
        giftHouses.put(buildCoordinates(currentXCoordinate, currentYCoordinate), true);
        try {
            loopString(args[0]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(giftHouses.size());
        }
	}
}