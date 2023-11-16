//DAY 0: Hello World

import java.util.*;
public class helloworld {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String inputString= read.nextLine();
        read.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}