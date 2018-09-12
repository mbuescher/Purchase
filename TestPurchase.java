
/**
 * This class is used to test the Purchase class.
 *
 * @author Michael Buescher @ APCS-A
 * @version 2018-09
 */
import java.util.Scanner;
public class TestPurchase
{
    public static void main (String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print ("Please enter the item name:      ");
        String name = kbd.nextLine();
        System.out.print ("Please enter the quantity:       ");
        int num = kbd.nextInt();
        System.out.print ("Please enter the price of each: $");
        double price = kbd.nextDouble();
        
        Purchase p1 = new Purchase (name, num, price);

        System.out.println("\n");
        System.out.println(p1);
        
        p1.setQuantity(5);
        System.out.println(p1);
        System.out.println("\n");
        
        System.out.println("Item:        " + p1.getItemName());
        System.out.println("Quantity:    " + p1.getQuantity());
        System.out.println("Price each: $" + p1.getPrice());
        System.out.println("Total cost: $" + p1.getTotalCost());
        
/*        p1.setQuantity(8);
        p1.setPrice(1.29);
        p1.setItemName("Avocado Toast");
        
        System.out.println("Item:        " + p1.getItemName());
        System.out.println("Quantity:    " + p1.getQuantity());
        System.out.println("Price each: $" + p1.getPrice());
        System.out.println("Total cost: $" + p1.getTotalCost());
 */
        
        
        kbd.close();
    }
}






