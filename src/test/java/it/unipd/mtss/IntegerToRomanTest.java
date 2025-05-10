////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerToRomanTest {

    @Test
        public void ShouldInstantiateIntegerToRoman(){
            new IntegerToRoman();
            assertTrue(true);
        }

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

    @Test
	public void ShouldConvertToIV() {
        int numero = 4;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("IV", romano);
	}

    @Test
	public void ShouldConvertToV() {
        int numero = 5;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("V", romano);
	}

    @Test
	public void ShouldConvertToVI() {
        int numero = 6;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("VI", romano);
	}

    @Test
	public void ShouldConvertToVII() {
        int numero = 7;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("VII", romano);
	}

    @Test
	public void ShouldConvertToVIII() {
        int numero = 8;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("VIII", romano);
	}

    @Test
	public void ShouldConvertToIX() {
        int numero = 9;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("IX", romano);
	}

    @Test
	public void ShouldConvertToX() {
        int numero = 10;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("X", romano);
	}

    @Test
	public void ShouldConvertToXV() {
        int numero = 15;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("XV", romano);
	}

    @Test
	public void ShouldConvertToXIX() {
        int numero = 19;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("XIX", romano);
	}

    @Test
	public void ShouldConvertToXX() {
        int numero = 20;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("XX", romano);
	}

    @Test
	public void ShouldConvertToXXX() {
        int numero = 30;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("XXX", romano);
	}

    @Test
	public void ShouldConvertToXL() {
        int numero = 40;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("XL", romano);
	}

    @Test
	public void ShouldConvertToL() {
        int numero = 50;
        String romano = IntegerToRoman.convert(numero);
        assertEquals("L", romano);
	}
}