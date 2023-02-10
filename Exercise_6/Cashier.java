public class Cashier {
    
    public void checkOut (GroceryItem item){
        System.out.print(" You have bought " + item.name);
    }

    public void showItemPrice (GroceryItem item){
        System.out.print(" This item cost " + item.price);
        
    }
}
