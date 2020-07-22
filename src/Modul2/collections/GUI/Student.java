package Modul2.collections.GUI;

public class Student {
    String name;
    String surname;
    int faculty;
    String group;

    public Student(){

    }

    public Student(String name, String surname, int faculty, String group){
        this.name=name;
        this.surname=surname;
        this.faculty=faculty;
        this.group=group;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                ", group='" + group + '\'';
    }
}
