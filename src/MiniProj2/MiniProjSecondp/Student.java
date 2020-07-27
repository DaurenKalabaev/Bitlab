package MiniProj2.MiniProjSecondp;

import java.io.Serializable;

public class Student implements Serializable {
    private Long id;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(long id, String name, String surname){
        this.id=id;
        this.name=name;
        this.surname=surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
