package Projects;

import java.util.Scanner;

public class StringiTerstenYazdirma {
    public static void main(String args[])
    {
        String ilkStr, reverseString = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Ters çevirilecek stringi girin");
        ilkStr = in.nextLine();

        int length = ilkStr.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverseString = reverseString + ilkStr.charAt(i);

        System.out.println("Stringin tersi: " + reverseString);
    }
}
