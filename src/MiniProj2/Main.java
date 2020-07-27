package MiniProj2;

public class Main {
    static Mainmenu menu;
    public static void main(String[] args){

        MainFrame frame = new MainFrame();
        Secondpage secondpage = new Secondpage();
        menu = new Mainmenu(frame, secondpage);
        menu.setVisible(true);
    }
}
