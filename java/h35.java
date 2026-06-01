import java.io.*;
import java.net.*;

public class h35 {

    public static void main(String[] args) {

        try {

            ServerSocket server =
                    new ServerSocket(5000);

            System.out.println("Server Waiting...");

            Socket socket = server.accept();

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            System.out.println(
                    "Client : " + br.readLine());

            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}