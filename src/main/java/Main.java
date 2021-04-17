import java.util.List;

public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader();
        String filename = "foreign_names.csv";

        List<Person> personList = reader.ReadInfo(filename);

        for(Person person: personList){
            System.out.println(person);
            break;
        }
    }
}