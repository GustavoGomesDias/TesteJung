package core;

public class EdgeType {
    public float weight;
    private String label;

    public float getWeight() {
        return weight;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public EdgeType(float w) {
        this.weight = w;
    }

    public EdgeType(float w, String label) {
        this.weight = w;
        this.label = label;
    }
}
