import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Reader {
        public List<Person> ReadInfo(String filename) {

                List<Person> personList = new ArrayList<>();
                try (FileReader fr = new FileReader(filename);
                     CSVReader reader = new CSVReader(fr)) {
                        String[] nextLine;
                        int i = 0;
                        while ((nextLine = reader.readNext()) != null) {
                                if(i == 0){
                                        i++;
                                        continue;
                                }
                                String e = "";
                                for(int j = 0; j < nextLine.length;j++){
                                        e += nextLine[j];
                                }
                                String[] a = e.split(";");
                                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                                personList.add(new Person(Integer.parseInt(a[0]),a[1],a[2],format.parse(a[3]),a[4],Integer.parseInt(a[5])));
                        }
                } catch (ParseException | FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException | CsvValidationException e) {
                        e.printStackTrace();
                }
                return personList;
        }

}

