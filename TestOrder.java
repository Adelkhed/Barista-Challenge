public class TestOrder {
    public static void main(String[] args) {

        // Create two orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // create three orders
        Order order3 = new Order("Alice");
        

        // create three items
        Item item1 = new Item("Drip Coffee", 1.50);
        Item item2 = new Item("Cappuccino", 3.50);
        Item item3 = new Item("Latte", 4.00);
        Item item4 = new Item("Mocha", 4.50);

        //Add  items to the orders
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item4);

       
        
        order1.setReady(true);
        order2.setReady(false);
        System.out.println(order1.getStatusMessage()); 
        System.out.println(order2.getStatusMessage()); 

        // Test de getOrderTotal
        System.out.println(order1.getOrderTotal()); // Total of order 1
        System.out.println(order2.getOrderTotal()); // Total of order 2

        //Display the orders
        order1.display();
        order2.display();
        order3.display();
       
 
}
}
