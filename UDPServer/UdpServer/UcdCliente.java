import java.net.*;
import javax.swing.*;

public class UcdCliente {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];
            InetAddress iPAddress = InetAddress.getByName("localhost");
            while (true) {
                String sentence = JOptionPane.showInputDialog("Digite:");
                sendData = sentence.getBytes();
                DatagramPacket sentPacket = new DatagramPacket(sendData, sentence.length(), iPAddress, 4000);
                clientSocket.send(sentPacket);
                if (sentence.equals("Fim")) {
                    break;
                }
            }
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Fim 2.0");
        }

    }

}