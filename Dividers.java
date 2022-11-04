import java.util.Arrays;
import java.util.Scanner;

public class Dividers {

    public static void main(String[] args){
        int a = readNumber(); // choosing number to find dividers
        int [] arrayOfDividers = findDividers(a); // creating array of dividers
        printDividers(arrayOfDividers); // printing array
    }

    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do wyznaczania jej dzielników: ");
        return scanner.nextInt(); //scanning for number
    }

    public static boolean checkDivider(int a, int b){
        return a % b == 0; // if number 'b' is divider of 'a' function return true
    }

    public static int[] findDividers(int a){
        int[] dividersOfNumber = new int[a]; // setting length of array
        dividersOfNumber[0] = a; // number always divide by itself
        int numOfDivider = 1; // creating variable holding number of dividers


        for (int i=1;i<(a/2+1); i++){
            if (checkDivider(a, i)){ // we check if number is divider using func checkDivider()
                dividersOfNumber[numOfDivider] = i; // adds divider to next slot of Array with dividers
                numOfDivider +=1;
            }
        }

        dividersOfNumber = Arrays.copyOf(dividersOfNumber, numOfDivider); // we cut unnecessary slots of array

        return dividersOfNumber;
    }

    public static void printDividers(int[] dividersOfNumber){
        System.out.println(Arrays.toString(dividersOfNumber));

    }

}
