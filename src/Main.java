import Entities.Coffee;
import Entities.Imerchandise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    Map<Imerchandise, Integer> order = new HashMap<>();

    //Imerchansie mer1= new Cofee;
        // mer.getaddress from basemerchandise

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
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
                    System.out.println("1. Entities.Coffee \n" +
                            "2. Entities.GiftCard \n" +
                            "3. Hockey Card \n" +
                            "4. Entities.Mug");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            Coffee coffee = new Coffee();
                            System.out.println(coffee);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {

                            }
                            break;
                        case 2:
                            CoffeePowder coffeePowder = new CoffeePowder();
                            System.out.println(coffeePowder);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = coffeePowder;
                            }
                            break;
                        case 3:
                            GiftCards giftCards = new GiftCards();
                            System.out.println(giftCards);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = giftCards;
                            }
                            break;
                        case 4:
                            HockeyCards hockeyCards = new HockeyCards();
                            System.out.println(hockeyCards);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = hockeyCards;
                            }
                            break;
                        default:
                            System.out.println("Please choose the right choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Dount \n" +
                            "2. Bagel \n" +
                            "3. Entities.Coffee \n " +
                            "4. Wrap \n" +
                            "5. Sandwich");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            Donut donut = new Donut();
                            System.out.println(donut);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = donut;
                            }
                            break;
                        case 2:
                            Bagel bagel = new Bagel();
                            System.out.println(bagel);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = bagel;
                            }
                            break;
                        case 3:
                            Coffee coffee = new Coffee();
                            System.out.println(coffee);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = coffee;
                            }
                            break;
                        case 4:
                            Wrap wrap = new Wrap();
                            System.out.println(wrap);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = wrap;
                            }
                            break;
                        case 5:
                            Sandwich sandwich = new Sandwich();
                            System.out.println(sandwich);
                            System.out.println("\n 1.Order" +
                                    "\n2.Continue with other Products");
                            num = scanner.nextInt();
                            if (num == 1) {
                                timsItems[counter++] = sandwich;
                            }
                            break;

                        default:
                            System.out.println("Please choose the right choice");
                            break;
                    }
                    break;
                default:
                    System.out.println("wrong entry please try again");
                    break;
            }

        }

        System.out.println("*******************");
        System.out.println("Total item ordered");
        System.out.println("*******************");
        double totalPrice = 0;
        for (int p=0;p<counter;p++){
            System.out.println("Item: "+ timsItems[p]);
            totalPrice = totalPrice+timsItems[p].getPrice();
        }
        System.out.println("*******************");
        System.out.println("total price " + totalPrice);

        //making wallet method now
        double balance = 30;
        long creditNumber;
        System.out.println("## YOU HAVE BALANCE OF" + balance+"  IN WALLET ##");
        System.out.println("Please enter 12 digit Credit card number ");
        creditNumber = scanner.nextLong();
        String cerditCardNumberSt = String.valueOf(creditNumber);
        if (cerditCardNumberSt.length() == 12) {
            System.out.println("cool");
            if (cerditCardNumberSt.equals("123456789012")){
                System.out.println("Please enter month and year mm/yy");
                String monthyear = scanner.next();
                if (monthyear.equals("03/25")){
                    System.out.println("Payment Accepted");
                    System.out.println("balace left " + (balance-totalPrice));
                }
                else {
                    System.out.println("wrong mm/yy");
                }
            }
            else {
                System.out.println("wrong card number");
            }
        }else {
            System.out.println("please enter 12 didgit number");
        }
    }
}
    }


}