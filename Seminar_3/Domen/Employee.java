package Seminar_3.Domen;

public class Employee extends Person{

    private String specialisation;

    public Employee(String name, int age, String pecialisation){
        super(name, age); 
        this.specialisation = specialisation;
    }
    public String getSpecialisation() {
        return specialisation;
    }
}