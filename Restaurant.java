import java.util.*;

public abstract class Restaurant
{
    protected String name;
    protected int amount;
    LinkedList<Record> records = new LinkedList<Record>();
    public Restaurant(String name)
    {
        this.name=name;
        //System.out.println("Restaurant name: " + getName());
    }
    public void menu()
    {
        int i;
    }
    
    public String[][] order(String[][] menu)
    {
        int order = In.readNameInt("dish") -1;
        
        // System.out.println(menu[0][order]);
        // System.out.println(menu[1][order]);
        
        if (order > menu[0].length) {
            System.out.println("invalid dish!");
        } else {
            String[][] selectedItem = {{menu[0][order]}, {menu[1][order]}};
            System.out.println("Dish: " + selectedItem[0][0] + " - $" + selectedItem[1][0]);
            records.add(new Record(selectedItem));
            System.out.println("Order Placed!");
            System.out.println("Going To Checkout");
            return selectedItem;
        }
        return null;
        // int itemId = Integer.valueOf(order) - 1;
        
        // if (itemId > dishes.length) {
            // System.out.println("That is not a valid item");
        // } else {
            // records.add(new Record(dishes[itemId]));
            // System.out.println("Added");
            
            // for (Record rec : records) {
                // System.out.println("Current Order Item: " + rec.getOrder());
            // }
            // System.out.println("----------------------------------------------------");
        // }
    }
    public String getName() {
        return name;
    }

    public String toString()
    {
        return "The restaurant name is: " + name;

    }
}