public abstract class Veicolo {

    protected String targa;

    protected int anno;

    public Veicolo(int anno, String targa) {
        this.anno = anno;
        this.targa = targa;
    }

    public String Descrizione() {
        return "Anno: " + anno + ", Targa: " + targa;
    }
}
