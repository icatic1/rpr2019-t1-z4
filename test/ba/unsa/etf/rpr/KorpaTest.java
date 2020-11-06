package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Flasa",20,"f1");
        k.dodajArtikl(a);
        assertEquals(20,k.dajUkupnuCijenuArtikala());
    }

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Flasa",20,"f1");
        Artikl b = new Artikl("Flasa2",20,"f2");
        Artikl c = new Artikl("Flasa3",20,"f3");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);

        assertEquals(c,k.getArtikli()[2]);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Flasa",20,"f1");
        Artikl b = new Artikl("Flasa2",20,"f2");
        Artikl c = new Artikl("Flasa3",20,"f3");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);

        assertEquals(a,k.izbaciArtiklSaKodom("f1"));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Flasa",20,"f1");
        k.dodajArtikl(a);
        int i;
        for(i = 7; i<10;i++) {
            k.dodajArtikl(a);
            a = new Artikl("Flasa", i+1, 65+i+"1");
        }
        assertEquals(57,k.dajUkupnuCijenuArtikala());
    }
}