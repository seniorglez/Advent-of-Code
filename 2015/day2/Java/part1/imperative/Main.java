public class Main {
	public static void main(String[] args) {
        System.out.println("Processing: " + args[0] + " " + args[1] + " " + args[2]);
        int l = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        int[] areas ={l*w,w*h,h*l};
        System.out.println(2*areas[0] + 2*areas[1] + 2*areas[2] + smallest(areas[0], areas[1], areas[2]));
    }
    
    public static int smallest(int a, int b, int c) {
        if(a < b && a < c) return a;
        if(b < c) return b;
        return c;
    }
}