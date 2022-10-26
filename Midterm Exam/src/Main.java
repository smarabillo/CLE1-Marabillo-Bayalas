import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        CoffeeShop db = new CoffeeShop();
        db.setBalance(100);
        CoffeeShop1 C1 = new CoffeeShop1();
        String[][] bev = {{"Cappuccino", "Latte", "Choco"},{"Mocha", "Caramel", "Salted Caramel"},{"Pink Milk", "Milo", "Iced Coffee"}};
        int[][] bevNum = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int price;

        C1.Branch();
        C1.Branch1();
        CoffeeShop.welcome();
        System.out.println("Balance: " + db.getBalance());
        CoffeeShop.drinks();


        for (int i = 0; i < 100; i++) {
            CoffeeShop.order();
            int cOrder = kb.nextInt();
            if (cOrder == bevNum[0][0]) {
                price = 75;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[0][0] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[0][1]) {
                    price = 70;
                    double RemBal = db.getBalance() - price;
                    System.out.println(bev[0][1] + " = Php " + price);
                    CoffeeShop.proceed();
                    System.out.print("Input: ");
                    String cChoice = kb.next();
                    if (Objects.equals(cChoice, "Y")) {
                        CoffeeShop.Yes();
                        System.out.println("Remaining Balance: " + RemBal);
                        break;
                    } else if (cChoice.equals("N")) {
                        CoffeeShop.No();
                    } else {
                        CoffeeShop.Else();
                        break;
                    }
            }else if (cOrder == bevNum[0][2]) {
                price = 79;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[0][2] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[1][0]) {
                price = 80;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[1][0] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[1][1]) {
                price = 90;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[1][1] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[1][2]) {
                price = 85;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[1][2] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[2][0]) {
                price = 72;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[2][0] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[2][1]) {
                price = 65;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[2][1] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            }else if (cOrder == bevNum[2][2]) {
                price = 62;
                double RemBal = db.getBalance() - price;
                System.out.println(bev[2][2] + " = Php " + price);
                CoffeeShop.proceed();
                System.out.print("Input: ");
                String cChoice = kb.next();
                if (Objects.equals(cChoice, "Y")) {
                    CoffeeShop.Yes();
                    System.out.println("Remaining Balance: " + RemBal);
                    break;
                } else if (cChoice.equals("N")) {
                    CoffeeShop.No();
                } else {
                    CoffeeShop.Else();
                    break;
                }
            } else {
                CoffeeShop.NotListed();
            }
        }
    }
}

