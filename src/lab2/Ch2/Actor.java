package lab2.Ch2;

public class Actor {
    public String nume;
    public Integer varsta;
    public Premiu[] premii; //vector de obiecte de tip Premiu

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }

}
