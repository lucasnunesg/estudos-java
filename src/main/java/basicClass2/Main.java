package basicClass2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Room[] rooms = new Room[10];

        for (int i=0; i<n; i++) {
            System.out.printf("%nRoom #%d%n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            rooms[roomNumber] = new Room(name, email, roomNumber);
        }

        System.out.printf("%nBusy rooms:%n");
        for (int i=0; i<10; i++) {
            if(rooms[i] != null) {
                System.out.print(i + ": " + rooms[i]);
            }
        }
        sc.close();
    }
}
