public class Main {
	public static void main(String[] args) {
        System.out.println("Processing: " + args[0] + " " + args[1] + " " + args[2]);
        int l = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        System.out.println(2*l*w + 2*w*h + 2*h*l + smallest(l*w, w*h, h*l));
    }
    
    public static int smallest(int a, int b, int c) {
        if(a < b && a < c) return a;
        if(b < c) return b;
        return c;
    }
}