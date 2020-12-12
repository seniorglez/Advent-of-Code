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
        switch (ch) {
            case '>':
                currentXCoordinate += 1;
                break;
            case '<':
                currentXCoordinate -= 1;
                break;
            case '^':
                currentYCoordinate += 1;
                break;
            case 'v':
                currentYCoordinate -= 1;
                break;
        }
        giftHouses.put(buildCoordinates(currentXCoordinate, currentYCoordinate), true);
	}

	public static void main(String[] args) {
        giftHouses = new HashMap<String, Boolean>();
        giftHouses.put(buildCoordinates(currentXCoordinate, currentYCoordinate), true);
        args[0].chars().forEach(direction -> insertNextHouse((char) direction));
        System.out.println(giftHouses.size());
	}
}
