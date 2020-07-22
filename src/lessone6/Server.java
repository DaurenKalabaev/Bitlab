package lessone6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

    public class Server {
        public static void main(String [] args){

            try {
                ServerSocket server = new ServerSocket(2077);
                System.out.println("server started");
                Socket socket = server.accept();
                System.out.println("client connected");

                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());


                while (true){
                    MessageData md = (MessageData)inputStream.readObject();
                    System.out.println(md.getMessageText());

                    if (md.getMessageText().toLowerCase().contains("hello")){

                        md.setMessageText("hello ");
                        outputStream.writeObject(md);
                    }else {
                        md.setMessageText("ok");
                        outputStream.writeObject(md);
                    }

                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

