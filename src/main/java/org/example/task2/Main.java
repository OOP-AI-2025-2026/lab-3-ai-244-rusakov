package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(new Item[10]);
        cart.addToCart(new Item(1, "iPhone 15 Pro", 45999));
        cart.addToCart(new Item(2, "Asus ROG Strix G16 Gaming Laptop", 58999));
        cart.addToCart(new Item(3, "Sony Bravia 65\" OLED Smart TV", 74999));
        cart.addToCart(new Item(4, "Electrolux PerfectCare 700 Washing Machine", 22999));
        cart.addToCart(new Item(5, "LG InstaView Door-in-Door Refrigerator", 37999));
        cart.addToCart(new Item(6, "Nespresso Vertuo Next Coffee Machine", 8999));
        cart.addToCart(new Item(7, "Bosch Serie 4 Electric Oven", 17999));
        cart.addToCart(new Item(8, "Dyson Gen5detect Vacuum Cleaner", 24999));
        cart.addToCart(new Item(9, "Panasonic NN-ST46 Microwave Oven", 6999));
        cart.addToCart(new Item(10, "Remington Air3D Hair Dryer", 3299));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        Box box = new Box(3.0, 4.0, 5.0);

        System.out.println("\n");
        System.out.println("Площа поверхні: " + box.calcSurfaceArea());
        System.out.println("Площа бічної поверхні: " + box.calcLateralSurfaceArea());
        System.out.println("Об'єм: " + box.calcVolume());

        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(3);
        myStack.push(40);

        for (int i = 0; i < 7; i++) {
            myStack.push(i);
        }

        myStack.pop();
        myStack.pop();

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(1);
        myStack.push(3);
        myStack.push(40);
        System.out.println("Peek:" + myStack.peek());

        myStack.clear();

        for (int i = 0; i < 5; i++) {
            myStack.push(i);
        }
        System.out.println("Size: " + myStack.size());

        System.out.println("Result: Not empty - " + myStack.isEmpty());
        myStack.clear();
        System.out.println("Result: It is empty - " + myStack.isEmpty());

        myStack.clear();
        for (int i = 1; i < 5; i++) {
            myStack.push(i * 3);
        }

        myStack.push(10000);
    }
}
