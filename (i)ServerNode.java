import java.util.ArrayList;
import java.util.List;

public class ServerNode {
    private List<ClientNode> clientNodes;

    public ServerNode() {
        this.clientNodes = new ArrayList<>();
    }

    // Method to add client nodes to the server node
    public void addClientNode(ClientNode node) {
        clientNodes.add(node);
    }

    // Method to broadcast a message to all connected client nodes
    public void broadcastMessage(String message) {
        for (ClientNode node : clientNodes) {
            node.receiveMessage(message);
        }
    }

    // Method to send a message to a specific client node
    public void sendMessageToClient(ClientNode clientNode, String message) {
        if (clientNodes.contains(clientNode)) {
            clientNode.receiveMessage(message);
        } else {
            System.out.println("Client node not found in the network.");
        }
    }

    // Setter methods for data1 and data2
    // These setters are optional and can be used to set data specific to the server node
    // You can remove them if not needed
    public void setData1(String data1) {
        // Implement data validation or other logic if needed
        this.data1 = data1;
    }

    public void setData2(String data2) {
        // Implement data validation or other logic if needed
        this.data2 = data2;
    }
}
