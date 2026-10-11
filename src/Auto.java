public class Auto extends Veicolo {

    private int numeroPorte;

    public Auto(int anno, String targa, int numeroPorte) {
        super(anno, targa);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String Descrizione() {
        return super.Descrizione() + ", numeroPorte: " + numeroPorte;
    }

}
