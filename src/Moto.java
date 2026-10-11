public class Moto extends  Veicolo{

    private int cilindrata;

    public Moto(int anno, String targa, int cilindrata) {
        super(anno, targa);
        this.cilindrata = cilindrata;
    }

    @Override
    public String Descrizione() {
        return super.Descrizione() + ", Cilindrata: " + cilindrata;
    }
}
