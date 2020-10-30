package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl [] artikli = new Artikl[50];
    private int duzina=0;

    public boolean dodajArtikl(Artikl a) {
        if(duzina < 50){
            artikli[duzina] = a;
            duzina++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<duzina; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl a =artikli[i];
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

    public int dajUkupnuCijenuArtikala() {
        int ukupna=0;
        for(int i=0; i<duzina;i++){
            ukupna=ukupna + artikli[i].getCijena();
        }
        return ukupna;
    }

}
