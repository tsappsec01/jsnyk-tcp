package com.company;
import java.net.*;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
        private Socket socket            = null;
        private DataInputStream  input   = null;
        private DataOutputStream out     = null;


        public Main(String address, int port) {

            // establish a connection
            try {
                System.out.println(port);
                socket = new Socket();
                socket.connect(new InetSocketAddress(address, port), 1000);
//                socket.setSoTimeout(3);
                System.out.println("Connected");

                // takes input from terminal
                input = new DataInputStream(System.in);

                // sends output to the socket
                out = new DataOutputStream(socket.getOutputStream());
            } catch (UnknownHostException u) {
                System.out.println(u);
            } catch (IOException i) {
                System.out.println(i);
            }

            // string to read message from input
            String line = "";

            // keep reading until "Over" is input
//            while (!line.equals("Over")) {
//                try {
//                    line = input.readLine();
//                    out.writeUTF(line);
//                } catch (IOException i) {
//                    System.out.println(i);
//                }
//            }

            // close the connection
            try {
                input.close();
                out.close();
                socket.close();
            } catch (IOException i) {
                System.out.println(i);
            }
            catch (NullPointerException n){
                System.out.println("No connection");
            }
        }


    public static void main(String[] args) {
        Main client = new Main("72.14.183.78", 22);
        Main client1 = new Main("72.14.183.78", 443);
        Main client2 = new Main("72.14.183.78", 80);
        Main client3 = new Main("72.14.183.78", 8080);
        Main client4 = new Main("72.14.183.78", 21);
        Main client5 = new Main("72.14.183.78", 8000);
        Main client6 = new Main("72.14.183.78", 8443);
        Main client7 = new Main("72.14.183.78", 23);
        Main client8 = new Main("72.14.183.78", 9000);
        Main client9 = new Main("72.14.183.78", 10000);
        Main client11 = new Main("72.14.183.78", 53);
        Main client12 = new Main("72.14.183.78", 445);
    }
}
