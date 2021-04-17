
public class Department {
    
    public  int Id;
    public  Departments name;

    public Department(int id,Departments name){
        this.Id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
