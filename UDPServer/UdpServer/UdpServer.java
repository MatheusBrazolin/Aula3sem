import java.net.*;

public class UdpServer {
    public static void main(String[] args) {
        try{
            System.out.println("servidor iniciando...");
            byte[]receiveData = new byte[1024];
            DatagramSocket serverSocket = new DatagramSocket(4000);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            while(true){
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData());
                if (sentence.substring(0,3).equals("fim")){
                    break;
                }
                InetAddress iPAddress = receivePacket.getAddress();
                System.out.println("Recebido de " + iPAddress.getHostAddress()+ ":" + sentence);
    
            }serverSocket.close();  
        } catch(Exception e){
            System.out.println("Erro no sistema!");
        }
    }
}
