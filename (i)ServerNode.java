import java.util.ArrayList;
import java.util.List;

public class ServerNode {
    private List<PeripheralNode> peripheralNodes;
    private String data1;
    private String data2;

    public ServerNode() {
        this.peripheralNodes = new ArrayList<>();
    }

    // Method to add peripheral nodes to the server node
    public void addPeripheralNode(PeripheralNode node) {
        peripheralNodes.add(node);
    }

    // Method to broker messages sent by client node objects
    public void brokerMessage(String message) {
        // Process and distribute the message to peripheral nodes
        for (PeripheralNode node : peripheralNodes) {
            node.receiveMessage(message);
        }
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
