public class CoffeeShop {

    //Encapsulation
    private double Balance;

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    //Inheritance
    public static void Branch() {
        System.out.println("CoffeeShop Branch:");
    }

    //Methods
    public static void drinks(){
        System.out.println("""
            List of Drinks Available:
            
            [1]Cappuccino   [2]Latte    [3]Choco
            [4]Mocha        [5]Caramel  [6]Salted Caramel
            [7]Pink Milk    [8]Milo     [9]Iced Coffee""");
    }
    public static void welcome(){
        System.out.println("\nWelcome to SnT's Coffee Shop\n");
    }
    public static void order(){
        System.out.print("\nEnter the number of the drink you want to order: ");
    }
    public static void proceed(){
        System.out.println("\nProceed with order?\nType [Y] to proceed or [N] to order again");
    }
    public static void Yes(){
        System.out.println("\nYour order will be picked up by your courier and be delivered to you\nThank you for ordering!");
    }
    public static void No() {
        System.out.println("\nChoose your order again");
    }
    public static void Else(){
        System.out.println("\nError Input!");
    }
    public static  void NotListed(){
        System.out.println("Your order may not be on the list, Please Try Again");
    }
}

