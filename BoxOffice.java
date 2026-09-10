// name: oscar dumeng
// date: 9/1/2026
// purpose: calculate box office
// 

import java.util.Scanner;
public class BoxOffice {
public static void main(String[] args)
{  
   Scanner Scr = new Scanner(System.in);
System.out.println("enter movie title");
String movieTitle = Scr.nextLine();

System.out.println("enter sold amount of adult tickets");
int adultTickets = Scr.nextInt();

System.out.println("enter amount of child tickets");
int childTickets = Scr.nextInt();

double gross = (adultTickets * 10) + (childTickets * 6);
double net = gross * .20;
double distributor = gross * .80;
System.out.println(movieTitle);
System.out.println(adultTickets);
System.out.println(childTickets);
System.out.println(gross);
System.out.println(net);
System.out.println(distributor);
}
}


