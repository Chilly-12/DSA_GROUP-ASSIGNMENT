class ServerNode {
    public void sendMessage(String senderId, String receiverId, String message) {
        System.out.println("Message sent from " + senderId + " to " + receiverId + ": " + message);
    }
}

class  ClientNode{
    private String clientId;

    public ClientNode(String clientId){

        this.clientId = clientId;
    }
    public void send(ServerNode server, String receiverId,String message){
        server.sendMessage(clientId,receiverId,message);
    }
    public void receive(String senderId,String message){
        System.out.println("Received message from" + senderId + ":" + message);
    }

    public static void main(String[] args) {

        ClientNode client = new ClientNode("client1");
        ServerNode server = new ServerNode();

        client.send(server, "server", "Hello from client!");

        client.receive("server", "Hello back from server!");
    }
}
