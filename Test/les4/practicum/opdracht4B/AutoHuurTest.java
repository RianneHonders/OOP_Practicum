package les4.practicum.opdracht4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    AutoHuur ah1;


    @BeforeEach
    public void init(){
        ah1 = new AutoHuur();
    }

    @Test
    public void testGeenInfoBekendString(){
        assertEquals("  er is geen auto bekend\n" +"  er is geen huurder bekend\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }

    @Test
    public void testGeenHuurderString(){
        Auto at = new Auto("Citroën", 120);
        ah1.setGehuurdeAuto(at);
        assertEquals("  autotype: Citroën met prijs per dag: 120.0\n" +"  er is geen huurder bekend\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }

    @Test
    public void testGeenAutoString(){
        Klant kt = new Klant("De Wit");
        kt.setKorting(20);
        ah1.setHuurder(kt);
        assertEquals("  er is geen auto bekend\n" +"  op naam van: De Wit (korting: 20.0%)\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }
    @Test
    public void testGeenAutoGeenKorting(){
        Klant kt = new Klant("De Wit");
        kt.setKorting(0);
        ah1.setHuurder(kt);
        assertEquals("  er is geen auto bekend\n" +"  op naam van: De Wit (korting: 0.0%)\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }

    @Test
    public void testPrijsKortingKlant(){
        Klant kt = new Klant("De Wit");
        ah1.setHuurder(kt);
        kt.setKorting(50);
        Auto at1 = new Auto("Citroën", 50);
        ah1.setGehuurdeAuto(at1);
        ah1.setAantalDagen(6);
        assertEquals("  autotype: Citroën met prijs per dag: 50.0\n" +"  op naam van: De Wit (korting: 50.0%)\n" + "  aantal dagen: 6 en dat kost 150.0", ah1.toString());
    }

    @Test
    public void testGeenHuurder() {
        Klant kt = new Klant("");
        ah1.setHuurder(kt);
        Auto at1 = new Auto("Citroën", 50);
        ah1.setGehuurdeAuto(at1);
        ah1.setAantalDagen(6);
        assertEquals("  autotype: Citroën met prijs per dag: 50.0\n" +"  op naam van:  (korting: 0.0%)\n" + "  aantal dagen: 6 en dat kost 300.0", ah1.toString());
    }

}