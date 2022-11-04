import java.util.Scanner;

public class BusinessCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String name = scanner.next();
        /*String name = "Michal";*/

        System.out.println("Podaj nazwisko:");
        String surname = scanner.next();
        /*String surname = "Skowronski";*/

        System.out.println("Podaj numer telefonu:");
        String tel = scanner.next();
        /*int tel = 123456789;*/

        System.out.println("Podaj miasto zamieszkania:");
        String city = scanner.next();
        /*String city = "Chrzanow";*/

        String upperLine = "* " + name+ " " + surname;
        String lowerLine = "* tel. " + tel + " adres: " + city;

        int starLineLength;
        if (upperLine.length() > lowerLine.length()){
            upperLine += " *";
            starLineLength = upperLine.length();
            String whiteSpaceString = " ".repeat((starLineLength-lowerLine.length()-1));
            lowerLine = lowerLine + whiteSpaceString + "*";

        } else if(upperLine.length() < lowerLine.length()) {
            lowerLine += " *";
            starLineLength = lowerLine.length();
            String whiteSpaceString = " ".repeat((starLineLength-upperLine.length()-1));
            upperLine = upperLine + whiteSpaceString + "*";

        } else {
            starLineLength = upperLine.length();
            upperLine += " *";
            lowerLine += " *";
        }

        String starLine = "";
        for(int i=0; i<starLineLength; i++){
            starLine += "*"; // dla zaawansowanych StringBuilder
        }
        /*String starLine = "*".repeat(LowerLineLength);*/


        System.out.println(starLine);
        System.out.println(upperLine);
        System.out.println(lowerLine);
        System.out.println(starLine);

    }
}
