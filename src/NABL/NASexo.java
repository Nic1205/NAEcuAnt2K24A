package NABL;

public abstract class NASexo {
    protected String naTipo;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (naTipo == null)
            naTipo = "";
        return naTipo.toUpperCase();
    }
}
