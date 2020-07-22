package Moduk1.Lessone11.lesseon8;

public class Human<gtename> {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    Human(){

    }
    public Human(String name, String surname, int age, boolean gender){
        this.name = name;
        this.surname = surname;
        this.age=age;
        this.gender=gender;
    }

    public void getinfo(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
