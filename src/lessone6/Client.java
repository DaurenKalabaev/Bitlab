package lessone6;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
        public static void main(String[] args){

            Scanner in = new Scanner(System.in);

            String userName= in.nextLine();

            try {
                Socket socket = new Socket("127.0.0.1", 2077);
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                while (true){
                    String message = in.nextLine();
                    MessageData md = new MessageData(userName, message);
                    outputStream.writeObject(md);

                    md = (MessageData) inputStream.readObject();
                    System.out.println(md.getMessageText());
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

