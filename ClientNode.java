class  ClientNode{
    private String clientId;

    public ClientNode(String clientId){

        this.clientId = clientId;
    }
    public void sendMessage(ServerNode server, String receiverId,String message){
        server.sendMessage(clientId,receiverId,message);
    }
    public void receiveMessage(String senderId,String message){
        System.out.println("Received message from" + senderId + ":" + message);
    }
}