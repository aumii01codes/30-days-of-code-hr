//Day 1: Data Types

import java.util.*;
public class datatypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner read= new Scanner(System.in);
        int i2= read.nextInt();
        double d2=read.nextDouble();
        read.nextLine();
        String s2= read.nextLine();
        read.close();
        
        int sumi=i + i2;
        double sumd=d + d2;
        String sums=s + s2;
        
        System.out.println(sumi);
        System.out.println(sumd);
        System.out.println(sums);
    }
}