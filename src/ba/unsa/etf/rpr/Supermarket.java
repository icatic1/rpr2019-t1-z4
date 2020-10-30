package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli=new Artikl[1000];
    private int duzina;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<duzina; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl a = artikli[i];
                for(int j=i;j<duzina-1;j++){
                    artikli[j]=artikli[j+1];

                }
                artikli[duzina-1]=null;
                duzina--;
                return a;
            }
        }
        return null;
    }

    public void dodajArtikl(Artikl a) {
        artikli[duzina]= a;
        duzina++;

    }
}


