package manage_store.presentation;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

import manage_store.beans.Piece;
import manage_store.logic.ManagePieces;

public class StoreOption {

    ManagePieces managePieces = new ManagePieces();

    public void storeOptions() {
        Scanner sc = new Scanner(System.in);
        int op, day, month, year;
        String name;
        do {
            System.out.println("1. Add piece");
            System.out.println("2. Show old pieces");
            System.out.println("3. Exit");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Enter name");
                    name = sc.nextLine();
                    System.out.println("Enter year");
                    year = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter month");
                    month = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter day");
                    day = Integer.parseInt(sc.nextLine());
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(year, month - 1, day);
                    managePieces.addPiece(name, calendar.getTime());
                    break;
                case 2:
                    System.out.println("Enter year");
                    year = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter month");
                    month = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter day");
                    day = Integer.parseInt(sc.nextLine());
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(year, month - 1, day);
                    HashSet<Piece> pieces = managePieces.getOldPieces(calendar2.getTime());
                    for (Piece piece : pieces) {
                        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
                        System.out.println(piece.getName() + " - " + df.format(piece.getDate()));
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter valid option!");
            }
        } while (op != 3);
    }
}
