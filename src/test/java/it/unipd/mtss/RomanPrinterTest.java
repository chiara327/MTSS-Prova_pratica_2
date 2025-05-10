////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanPrinterTest {

    @Test
        public void ShouldInstantiateRomanPrinter(){
            new RomanPrinter();
            assertTrue(true);
        }

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
    public void ShouldPrintI(){
        int numero =1;
        String ascii=RomanPrinter.print(numero);
        assertEquals("  _____ \n"+
                     " |_   _|\n"+
                     "   | |  \n"+
                     "   | |  \n"+
                     "  _| |_ \n"+
                     " |_____|\n", ascii);
    }

    @Test
    public void ShouldPrintII(){
        int numero =2;
        String ascii=RomanPrinter.print(numero);
        assertEquals("  _____   _____ \n"+
                     " |_   _| |_   _|\n"+
                     "   | |     | |  \n"+
                     "   | |     | |  \n"+
                     "  _| |_   _| |_ \n"+
                     " |_____| |_____|\n", ascii);
        
    }

    @Test
    public void ShouldPrintIII(){
        int numero =3;
        String ascii=RomanPrinter.print(numero);
        assertEquals("  _____   _____   _____ \n"+
                     " |_   _| |_   _| |_   _|\n"+
                     "   | |     | |     | |  \n"+
                     "   | |     | |     | |  \n"+
                     "  _| |_   _| |_   _| |_ \n"+
                     " |_____| |_____| |_____|\n", ascii);
        
    }

    @Test
    public void ShouldPrintIV(){
        int numero =4;
        String ascii=RomanPrinter.print(numero);
        assertEquals("  _____  __      __\n"+
                     " |_   _| \\ \\    / /\n"+
                     "   | |    \\ \\  / / \n"+
                     "   | |     \\ \\/ /  \n"+
                     "  _| |_     \\  /   \n"+
                     " |_____|     \\/    \n", ascii);
        
    }

    @Test
    public void ShouldPrintV(){
        int numero =5;
        String ascii=RomanPrinter.print(numero);
        assertEquals(" __      __\n"+
                     " \\ \\    / /\n"+
                     "  \\ \\  / / \n"+
                     "   \\ \\/ /  \n"+
                     "    \\  /   \n"+
                     "     \\/    \n", ascii);
        
    }

    @Test
    public void ShouldPrintVI(){
        int numero =6;
        String ascii=RomanPrinter.print(numero);
        assertEquals(" __      __  _____ \n"+
                     " \\ \\    / / |_   _|\n"+
                     "  \\ \\  / /    | |  \n"+
                     "   \\ \\/ /     | |  \n"+
                     "    \\  /     _| |_ \n"+
                     "     \\/     |_____|\n", ascii);
        
    }

    @Test
    public void ShouldPrintVII(){
        int numero =7;
        String ascii=RomanPrinter.print(numero);
        assertEquals(" __      __  _____   _____ \n"+
                     " \\ \\    / / |_   _| |_   _|\n"+
                     "  \\ \\  / /    | |     | |  \n"+
                     "   \\ \\/ /     | |     | |  \n"+
                     "    \\  /     _| |_   _| |_ \n"+
                     "     \\/     |_____| |_____|\n", ascii);
        
    }

    @Test
    public void ShouldPrintVIII(){
        int numero =8;
        String ascii=RomanPrinter.print(numero);
        assertEquals(" __      __  _____   _____   _____ \n"+
                     " \\ \\    / / |_   _| |_   _| |_   _|\n"+
                     "  \\ \\  / /    | |     | |     | |  \n"+
                     "   \\ \\/ /     | |     | |     | |  \n"+
                     "    \\  /     _| |_   _| |_   _| |_ \n"+
                     "     \\/     |_____| |_____| |_____|\n", ascii);
        
    }

    @Test
    public void ShouldPrintIX(){
        int numero =9;
        String ascii=RomanPrinter.print(numero);
        assertEquals("  _____  __   __\n"+
                     " |_   _| \\ \\ / /\n"+
                     "   | |    \\ V / \n"+
                     "   | |     > <  \n"+
                     "  _| |_   / . \\ \n"+
                     " |_____| /_/ \\_\\\n", ascii);
        
    }

    @Test
    public void ShouldPrintX(){
        int numero = 10;
        String ascii=RomanPrinter.print(numero);
        assertEquals(" __   __\n"+
                     " \\ \\ / /\n"+
                     "  \\ V / \n"+
                     "   > <  \n"+
                     "  / . \\ \n"+
                     " /_/ \\_\\\n", ascii);
        
    }
}