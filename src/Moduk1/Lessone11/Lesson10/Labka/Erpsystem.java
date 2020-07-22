package Moduk1.Lessone11.Lesson10.Labka;

public class Erpsystem {
    User[] users = new User[100];
    int sizeofUsers=0;


    public Erpsystem(){

    }
    public Erpsystem(User[] users) {
        this.users = users;
        this.sizeofUsers = sizeofUsers;
    }

    public void addUser(User user){
        if (sizeofUsers>99){
            return;
        }
        users[sizeofUsers]=user;
        sizeofUsers++;
    }

    public void printAllusers(){
        for (int i=0; i<users.length;i++){
            System.out.println(users[i].getUserData());
        }
    }

    public void printUsers(int index) {
        if (index < sizeofUsers) {
            System.out.println(users[index]);
        }
    }
}
