////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {

    @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
         () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class,
         () -> RomanPrinter.print(1001));
        assertThrows(IllegalArgumentException.class,
         () -> RomanPrinter.print(-1));
    }

    @Test
	public void ShouldPrintI() {
        int numero = 1;
        String ascii = RomanPrinter.print(numero);
        assertEquals("  _____ \n"+
                     " |_   _|\n"+
                     "   | |  \n"+
                     "   | |  \n"+
                     "  _| |_ \n"+
                     " |_____|\n", ascii);
	}

    @Test
	public void ShouldPrintII() {
        int numero = 2;
        String ascii = RomanPrinter.print(numero);
        assertEquals("  _____   _____ \n"+
                     " |_   _| |_   _|\n"+
                     "   | |     | |  \n"+
                     "   | |     | |  \n"+
                     "  _| |_   _| |_ \n"+
                     " |_____| |_____|\n", ascii);
	}

    @Test
	public void ShouldPrintIII() {
        int numero = 3;
        String ascii = RomanPrinter.print(numero);
    assertEquals("  _____   _____   _____ \n"+
                 " |_   _| |_   _| |_   _|\n"+
                 "   | |     | |     | |  \n"+
                 "   | |     | |     | |  \n"+
                 "  _| |_   _| |_   _| |_ \n"+
                 " |_____| |_____| |_____|\n", ascii);
	}
}
