public class Veicolo {

    protected String targa;

    protected int anno;

    public Veicolo(int anno, String targa) {
        this.anno = anno;
        this.targa = targa;
    }

    public String Descirzione(){
        return "La macchina ha come targa: " +  targa + " ed è stata immatricolata nel : " + anno ;
    }

}
