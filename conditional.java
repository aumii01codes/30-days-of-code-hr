//Day 3: Intro to Conditional Statements

import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        read.close();
        if(n%2!=0) System.out.print("Weird");
        else if(n%2==0 && (n>=2 && n<=5)) System.out.print("Not Weird");
        else if(n%2==0 && (n>=6 && n<=20)) System.out.print("Weird");
        else if(n%2==0 && n>20) System.out.print("Not Weird");
    }
}