////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntergerToRomanTest {

    @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
         () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class,
         () -> IntegerToRoman.convert(1001));
        assertThrows(IllegalArgumentException.class,
         () -> IntegerToRoman.convert(-1));
    }
    
    @Test
	public void ShouldConvertToI() {
        int numero = 1;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("I", romano);
	}

    @Test
	public void ShouldConvertToII() {
        int numero = 2;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("II", romano);
	}

    @Test
	public void ShouldConvertToIII() {
        int numero = 3;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("III", romano);
	}
}