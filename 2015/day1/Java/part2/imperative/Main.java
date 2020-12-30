public class Main {
	public static void main(String[] args) {
		int floor = 0;
		System.out.println("Processing: " + args[0]);
		char[] chars = args[0].toCharArray();
		int i = 0;
		for (; i < chars.length && floor !=-1 ; i++) {
			if(chars[i] == '(') {
				++floor;
			} else {
				--floor;
			}
		}
		System.out.println(i);
	}
}
