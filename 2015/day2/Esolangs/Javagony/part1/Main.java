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

    public static void main(String[] args) {
        System.out.println("Processing: " + args[0] + " " + args[1] + " " + args[2]);
        int l = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        int[] areas ={l*w,w*h,h*l};
        System.out.println(2*areas[0] + 2*areas[1] + 2*areas[2] + smallest(areas[0], areas[1], areas[2]));
    }
    
    public static int smallest(int a, int b, int c) {
        return smallest(smallest(a, b),c);
    }

    public static int smallest(int a, int b) {
        try {
            int i = 1231/(int)Math.sqrt(a-b); //if b > a the result of  Math.sqrt(a-b) will be 0 and therefore java will attemp to do 1231/0 :)
        } catch (ArithmeticException e) {
            return a;
        }
        return b;
    }
}
