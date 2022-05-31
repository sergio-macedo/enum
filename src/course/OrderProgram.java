package course;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data");
        System.out.println("enter client's name");
        String clientName = sc.nextLine();
        System.out.println("enter client's email");
        String clientEmail = sc.nextLine();
        System.out.println("enter client's birth date");
        Date clientBirthDate = sdf.parse(sc.next());
        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data");
        System.out.println("Status");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println("How many items to this order");
        Order order = new Order(new Date(),status,client);

        int items = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= items; i++) {
            sc.nextLine();
            System.out.println("Enter #" +i+ "item data" );
            System.out.println("Product name");
            String productName = sc.nextLine();
            System.out.println("Product price ");
            Double productPrice = sc.nextDouble();
            System.out.println("quantity");
            int productQuantity = sc.nextInt();
            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(productQuantity,productPrice,product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);



        sc.close();
    }
}
