package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Bicikl",2000,"kod_bicikla");
        assertEquals("Bicikl",a.getNaziv());
    }

    @Test
    void setNaziv() {
        Artikl a = new Artikl("Bicikl",2000,"kod_bicikla");
        a.setNaziv("Kompjuter");
        assertEquals("Kompjuter",a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Bicikl",2000,"kod_bicikla");
        assertEquals(2000,a.getCijena());
    }

    @Test
    void setCijena() {
        Artikl a = new Artikl("Bicikl",2000,"kod_bicikla");
        a.setCijena(400);

        assertEquals(400,a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Bicikl",2000,"kod_bicikla");
        assertEquals("kod_bicikla",a.getKod());
    }

    @Test
    void setKod() {
        Artikl a = new Artikl("Bicikl",2000,"kod_bicikla");
        a.setKod("kod_televizije");
        assertEquals("kod_televizije",a.getKod());
    }
}