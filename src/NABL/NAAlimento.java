package NABL;

public abstract class NAAlimento {
    protected String naTipo;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (naTipo == null)
            naTipo = "";
        return naTipo.toUpperCase();
    }
}
