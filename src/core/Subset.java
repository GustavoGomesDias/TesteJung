package core;

public class Subset implements Comparable<Subset> {
    public String vertice;
    public String adjascente;
    public float peso;

    public Subset(String vertice, String adjascente, float peso) {
        this.vertice = vertice;
        this.adjascente = adjascente;
        this.peso = peso;
    }

    @Override
    public int compareTo(Subset o) {
        Float a = o.peso;
        Float b = this.peso;
        return b.compareTo(a);
    }
}
