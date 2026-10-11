
void main(){
    Auto a1 = new Auto(2000, "TI 739 GA", 5);
    Auto a2 = new Auto(2010, "HI 612 SU", 2);
    Auto a3 = new Auto(2004, "AI 739 TP", 10);

    Moto m1 = new Moto(2000,"CA 056 FA", 300);
    Moto m2 = new Moto(2010,"MG 924 HJ", 1000);
    Moto m3 = new Moto(2005,"LB 125 FG", 125);

    System.out.println(a1.Descrizione());
    System.out.println(a2.Descrizione());
    System.out.println(a3.Descrizione());

    System.out.println(m1.Descrizione());
    System.out.println(m2.Descrizione());
    System.out.println(m3.Descrizione());
}

