
// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * sale.
 * @author Hugh
 * @version 1
 */
public class Sales {
    public static void main(String[] args) {
        int SALESPEOPLE;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many salers do you want to set up: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int average;
        int max=0;
        int maxID =0;
        int min=999999999;
        int minID=0;
        int standard;
        int countS=0;
        int id;
                
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            //maximum sale
            if(sales[i]>max) {
                max = sales[i];
                maxID = i+1;
            }
            //minimum sale
            if(sales[i]<min){
                min = sales[i];
                minID = i+1;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        average = sum / sales.length;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + average);
        System.out.println("\nSalesperson "+maxID+" had the highest sale with" + money.format(max));
        System.out.println("\nSalesperson "+minID+" had the lowest sale with" + money.format(min));
        System.out.println("===================================================");
        System.out.print("Please enter your standard sale amount: ");
        standard = scan.nextInt();
        for (int i = 0; i < sales.length; i++) {
            if(sales[i]>standard) {
                id = i+1;
                System.out.print("\tSalesperson " + id);
                countS++;
            }
        }
        System.out.println(" have exceeded the goal!");
        System.out.println("\tThere are " + countS + " saler exceeded the goal.");
        scan.close();
    }
}