package Utils;

public class Pair {
    private int node;
    private int weight;

    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    public int getNode() {
        return node;
    }

    public int getWeight() {
        return weight;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
