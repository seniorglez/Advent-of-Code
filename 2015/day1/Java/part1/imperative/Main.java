public class Main {
	public static void main(String[] args) {
		int floor = 0;
		System.out.println("Processing: " + args[0]);
		char[] chars = args[0].toCharArray();
		for(char c: chars) {
			if(c == '(') {
				++floor;
			} else {
				--floor;
			}
		}
		System.out.println(floor);
	}
}
