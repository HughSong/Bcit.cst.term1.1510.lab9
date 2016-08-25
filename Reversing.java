
/**
 * 
 */
import java.util.Scanner;

/**
 * Reversing
 * @author Hugh
 * @version 1
 */
public class Reversing {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan;
        int num;
        int value;
        int intermediary;
        scan = new Scanner(System.in);
        System.out.print("Please determine how many item do you want: ");
        num = scan.nextInt();
        int rev[] = new int[num];

        for (int i = 0; i < rev.length; i++) {
            System.out.print("Please give a value for your item" + (i) + " :");
            value = scan.nextInt();
            rev[i] = value;
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < rev.length; i++) {

            System.out.println(" " + i + " " + rev[i]);
        }
        
        System.out.println("--------------REVERSING----------------");
        for(int i = 0; i<(int)rev.length/2;i++) {
            intermediary=rev[i];
            rev[i]=rev[rev.length-(i+1)];
            rev[rev.length-(i+1)]=intermediary;
        }
        
        for (int i = 0; i < rev.length; i++) {

            System.out.println(" " + i + " " + rev[i]);
        }
    }

}
