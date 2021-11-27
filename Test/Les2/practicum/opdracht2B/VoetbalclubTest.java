package Les2.practicum.opdracht2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    Voetbalclub v1;

    @BeforeEach
    void init(){
        v1 = new Voetbalclub("Rianne");
    }

    @Test
    void testGeenNaamVoetbalClub(){
        Voetbalclub v2 = new Voetbalclub("");
//        assertEquals("FC", v1.getNaam());
    }

    @Test
    void testFoutieveInvoerVerwerkResultaat(){
        v1.verwerkResultaat('2');
        assertEquals(0, v1.aantalGespeeld());
    }

    @Test
    void testResultaatVerwerkResultaat(){
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('v');
        assertEquals( 4, v1.aantalPunten());
    }

    @Test
    void testToStringVerwerkResultaat(){
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        assertTrue(v1.toString().contains("3 1 0"));
    }

    @Test
    void testWedstrijdAantallen(){
        for (int i = 0; i < 5; i++) {
            v1.verwerkResultaat('g');
        }
        assertEquals(5 ,v1.aantalGespeeld());

    }


}