public class LoginGenerator {

    public static void main(String[] args) {

        String[] studentNames = { "Budynek Piotr",
                "Chalupa Krystyna",
                "Wiezowiec Jan",
                "Szkieletor Andrzej",
                "Domek Marianna" };

        int lenStudentsNames = studentNames.length;

        for (int i=0; i<lenStudentsNames; i++){
            String loweredName = studentNames[i].toLowerCase();
            String[] studentName = loweredName.split(" ");
            String surname = studentName[0];
            String name = studentName[1];
            System.out.println(name.substring(0, 3) + surname.substring(0, 2) + "@student.agh.edu.pl");
        }







    }
}