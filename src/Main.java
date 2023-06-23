import Entities.Coffee;
import Entities.Imerchandise;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    Map<Imerchandise, Integer> order = new HashMap<>();

    //Imerchansie mer1= new Cofee;
        // mer.getaddress from basemerchandise

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int num =0;
        System.out.println("****Welcome to tims merchandise*****");
        while (true) {
            System.out.println("1. Start Ordering \n" +
                    "2. Exit");

            int count =scanner.nextInt();
            if(count==2){
                break;
            }
            switch (count) {
                case 1:
                    System.out.println("1. Coffee \n" +
                            "2. GiftCard \n" +
                            "3. Hockey Card \n" +
                            "4. Mug");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            Coffee coffee = new Coffee();
                            System.out.println(coffee);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                System.out.println("Enter the Quantity of your order:");
                                int quantity;
                                quantity = scanner.nextInt();
//                                if (order.containsKey(coffee)){
//                                    quantity++;
//                            }
                                order.put(coffee, quantity);
                                break;
                            }

                        default:
                            System.out.println("Please choose the right choice");
                            break;
                    }
            }

        }
        for (Map.Entry<Imerchandise,Integer> entry : order.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());


    }
}
