package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Flasa",20,"f1");
        Artikl b = new Artikl("Flasa2",20,"f2");
        Artikl c = new Artikl("Flasa3",20,"f3");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.dodajArtikl(c);

        assertEquals(c,s.getArtikli()[2]);

    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Flasa",20,"f1");
        Artikl b = new Artikl("Flasa2",20,"f2");
        Artikl c = new Artikl("Flasa3",20,"f3");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.dodajArtikl(c);

        assertEquals(a,s.izbaciArtiklSaKodom("f1"));
    }

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Flasa",20,"f1");
        s.dodajArtikl(a);
        Artikl b = new Artikl("Flas2",20,"f2");
        s.dodajArtikl(b);
        assertEquals(a,s.getArtikli()[0]);
    }
}