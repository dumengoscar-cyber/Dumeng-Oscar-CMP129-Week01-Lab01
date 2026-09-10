//name: oscar dumeng
// cmp: 129
// week: 1 lab 1
// date: 9/10/2026
import java.util.Scanner;
public class InterestEarned {
    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("enter principle:");
double principle = input.nextDouble();

System.out.println("enter annual interest rate:");
double rate = input.nextDouble();

System.out.println("enter times compounded:");
int timesCompunded = input.nextInt();

double amount = principle * Math.pow(1 + rate / timesCompunded, timesCompunded);

double InterestEarned = amount - principle;

System.out.println("interest rate: " + rate);
System.out.println("times compunded: " + timesCompunded);
System.out.println("principel: $" + principle);
System.out.println("interest earned: $" + InterestEarned);
System.out.println("amount in savings: $" + amount);
    }
}
