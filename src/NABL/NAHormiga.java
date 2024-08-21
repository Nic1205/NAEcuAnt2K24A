package NABL;

public abstract class NAHormiga {
    protected String naTipo;

    public String toString() {
        // TODO Auto-generated method stub
        if (naTipo == null)
            naTipo = "";
        return naTipo.toUpperCase();
    }
}
