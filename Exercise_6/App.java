public class App {
    public static void main(String[] args) throws Exception {
       
        //polymorphic variable
        // item in form of a diaper
        GroceryItem item1 = new Diaper ();
        item1.name = "Pampers";
        item1.price = 10;
        item1.showItemName();

        // item in form of an ice cream
        GroceryItem item2 = new IceCream();
        item2.name = "Magnum";
        item2.price = 70;
        item2.showItemName();

        //cashier obj
        Cashier c1 = new Cashier();
        
        //polymorphic parameter
        c1.checkOut(item1);
        c1.showItemPrice(item1);
        
        c1.checkOut(item2);
        c1.showItemPrice(item2);

        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        //polymorphic Array

        double totalAmount = 0.00;
        for (int i = 0; i < itemArray.length; i++){
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price);
            
            totalAmount += itemArray[i].price;

        }
        System.out.println("The total is: " + totalAmount);

        //Pet

        Cat mycat = new Cat();
        mycat.eat();

    }
}
