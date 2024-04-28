public class PeripheralNode {
    private ServerNode centralNode;
    private String data1;
    private String data2;

    // Constructor to initialize the peripheral node with the central node
    public PeripheralNode(ServerNode centralNode) {
        this.centralNode = centralNode;
    }

    // Method to send a message to the central node
    public void sendMessage(String message) {
        centralNode.brokerMessage(message);
    }

    // Method to receive a message from the central node
    public void receiveMessage(String message) {
        // Process received message
        System.out.println("Received message: " + message);
    }

    // Setter method for data1
    public void setData1(String data1) {
        this.data1 = data1;
    }

    // Setter method for data2
    public void setData2(String data2) {
        this.data2 = data2;
    }
}
