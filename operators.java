//Day 2: Operators

import java.util.*;
class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip=(tip_percent / 100.00)* meal_cost;
    double tax=(tax_percent / 100.00) * meal_cost;
    double cost= meal_cost + tip + tax;
    int bill=(int) Math.round (cost);
    System.out.println(bill);
    }
}

public class operators {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double meal_cost = read.nextDouble();
        int tip_percent = read.nextInt();
        int tax_percent = read.nextInt();
        Result.solve(meal_cost, tip_percent, tax_percent);
        read.close();
    }
}