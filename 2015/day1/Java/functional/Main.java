import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Processing: " + args[0]);
        List<String> argsList = Arrays.asList(args[0].split(""));
        long open = argsList.stream().filter( s -> s.equalsIgnoreCase("(")).count();
        long close = argsList.stream().filter( s -> s.equalsIgnoreCase(")")).count(); //This is not the optimal solution
        System.out.println(open-close);
    }
}
