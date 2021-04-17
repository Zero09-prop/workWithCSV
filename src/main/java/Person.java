import java.util.Date;

public class Person {
    public int id;
    public String name;
    public String gender;
    public Date birthDate;
    public Department department;
    public String division;
    public int salary;

    public Person(int id,String name,String gender,Date birthDate,String division,int salary){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
        this.department = new Department(id%5,Departments.values()[id % 5]);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", department=" + department +
                ", division='" + division + '\'' +
                ", salary=" + salary +
                '}';
    }
}
