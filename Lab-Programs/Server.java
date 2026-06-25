import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        try (
            ServerSocket server = new ServerSocket(5000);
            Socket socket = server.accept();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);
        ) {
            System.out.println("Server is running...");
            System.out.println("Client Connected.");

            String msg = in.readLine();
            System.out.println("Client: " + msg);

            out.println("Hello Client, Message Received!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
