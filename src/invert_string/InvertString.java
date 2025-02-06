package invert_string;

import java.util.Scanner;

public class InvertString {

    public void invert_string() {
        Scanner sc = new Scanner(System.in);
        String cad;
        StringBuilder aux = new StringBuilder("");
        System.out.println("Enter a string");
        cad = sc.nextLine();
        for (int i = cad.length() - 1; i >= 0; i--) {
            aux.append(cad.charAt(i));
        }
        System.out.println(aux);
    }
}
