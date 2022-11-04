import java.util.Scanner;

public class aritmeticMarks {

    public static void main(String[] args){
        int[] marksArray = getMarksArray();
        double avMarks = average(marksArray);// oblcizamy srednia ocen wywolujac metode average
        System.out.println("Srednia ocen osobnika wynosi: " + avMarks); //wyswietlamy srednia ocen

    }

    public static int[] getMarksArray(){
        //wczytujemy ilosc ocen osoby
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc ocen:");
        int numbOfMarks = scanner.nextInt();//

        //tworzymy tablice o wielkosci wpisanej ilosci ocen
        int[] marksArray = new int[numbOfMarks];

        //wczytujemy po kolei kazda ocene oraz dodajemy ja do tablicy ocen
        for (int i=0;i<numbOfMarks;i++){
            System.out.println("Podaj ocene:");
            int mark = scanner.nextInt();
            marksArray[i] = mark;
        }

        return marksArray;
    }

    public static double average(int[] marks) {
        int sum = 0;

        for(int i=0; i<marks.length; i++) {
            sum += marks[i];
        }

        return sum/(double)marks.length;
    }

}



