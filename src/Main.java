import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int distance,age,ticketType;

        double totalPrice = 0;

        final double pricePerKM = 0.1; // TL

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Distance(km): ");
        distance = keyboard.nextInt();

        if (distance <= 0){

            System.out.println("!!! Invalid Input !!!");
            //Update distance
            System.out.print("Distance(km): ");
            distance = keyboard.nextInt();

        }

        System.out.print("Age: ");
        age = keyboard.nextInt();

        if (age <= 0){

            System.out.println("!!! Invalid Input !!!");
            //Update distance
            System.out.print("Age: ");
            age = keyboard.nextInt();

        }

        System.out.println("\nTicket Type\n-----------\n1.One Way\n2.Round Trip");
        System.out.print("\nTicket Choice:");
        ticketType = keyboard.nextInt();

        if (ticketType != 1 && ticketType != 2){

            System.out.println("Invalid Input");
            System.out.println("\nTicket Type\n-----------\n1.One Way\n2.Round Trip");
            System.out.print("\nTicket Choice:");
            ticketType = keyboard.nextInt();

        }

        if (ticketType == 1){

            totalPrice = distance * pricePerKM;

        }

        if (ticketType == 2){

            totalPrice = distance * pricePerKM * 2;
            totalPrice = totalPrice * 0.8;

        }


        if (age<12){

            totalPrice = totalPrice * 0.5;

        }else if(age<=24){

            totalPrice = totalPrice * 0.9;

        }else if(age > 65){

            totalPrice = totalPrice * 0.7;

        }

        System.out.println("\n--------- Summary ---------");
        System.out.println("---------------------------");
        System.out.println("-> Distance    : " + distance + " km");
        System.out.println("-> Ticket Type : " + ticketType);
        System.out.println("-> Age         : " + age);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("***************************");
        System.out.println("Total Price : " + totalPrice);
        System.out.println("***************************");






    }
}
