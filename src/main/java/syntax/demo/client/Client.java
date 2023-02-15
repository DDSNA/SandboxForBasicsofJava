package syntax.demo.client;

import java.io.*;
import java.net.*;
public class Client {
    // this is the initializer
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    // this is the constructor for ip address and port
    public Client(String address, int port){
        //establishing a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            // this takes new input from terminal
            input = new DataInputStream(System.in);

            // output sent through this to the socket
            out = new DataOutputStream(
                    socket.getOutputStream()
            );
        }
            catch (UnknownHostException u){
                System.out.println(u);
                return;
            }
            catch (IOException i) {
                System.out.println(i);
                return;
            }

        //String to read message from input
        }
    }

}
