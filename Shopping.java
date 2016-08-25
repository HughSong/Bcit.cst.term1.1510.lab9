/**
 * 
 */
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * To create a shopping item.
 * @author Hugh
 * @version 1
 */
public class Shopping {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ShoppingCart myCart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String itemName;
        double price;
        int quantity;
        String dete=null;
        int itemCount = 0;
        
        do{
        System.out.print("Please enter your item's name: ");
        itemName = scan.next();
        System.out.print("Please enter your item's price: ");
        price = scan.nextDouble();
        System.out.print("Please enter your item's quantity: ");
        quantity = scan.nextInt();
        myCart.addToCart(itemName, price, quantity);
        System.out.println(myCart);
        System.out.println("Contiune shopping?(y/n):");
        dete = scan.next();
        }while(dete.equals("y"));
        
        System.out.println("\nThank you for your shopping!");
        System.out.println("Please pay: " + fmt.format(myCart.getprice()));
        
    }

}
