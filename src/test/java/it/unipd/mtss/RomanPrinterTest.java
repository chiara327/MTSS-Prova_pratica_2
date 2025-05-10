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

    @Test 
        public void ShouldPrintXV(){
        int numero = 15;
        String ascii =  RomanPrinter.print(numero);
        assertEquals(" __   __ __      __\n"+
                     " \\ \\ / / \\ \\    / /\n"+
                     "  \\ V /   \\ \\  / / \n"+
                     "   > <     \\ \\/ /  \n"+
                     "  / . \\     \\  /   \n"+
                     " /_/ \\_\\     \\/    \n", ascii);
    }

    @Test 
        public void ShouldPrintXIX(){
        int numero = 19;
        String ascii =  RomanPrinter.print(numero);
        assertEquals(" __   __  _____  __   __\n"+
                     " \\ \\ / / |_   _| \\ \\ / /\n"+
                     "  \\ V /    | |    \\ V / \n"+
                     "   > <     | |     > <  \n"+
                     "  / . \\   _| |_   / . \\ \n"+
                     " /_/ \\_\\ |_____| /_/ \\_\\\n", ascii);
    }

    @Test 
        public void ShouldPrintXX(){
        int numero = 20;
        String ascii =  RomanPrinter.print(numero);
        assertEquals(" __   __ __   __\n"+
                     " \\ \\ / / \\ \\ / /\n"+
                     "  \\ V /   \\ V / \n"+
                     "   > <     > <  \n"+
                     "  / . \\   / . \\ \n"+
                     " /_/ \\_\\ /_/ \\_\\\n", ascii);
    }

    @Test
        public void ShouldPrintXXX(){
            int numero = 30;
            String ascii =  RomanPrinter.print(numero);
            assertEquals(" __   __ __   __ __   __\n"+
                         " \\ \\ / / \\ \\ / / \\ \\ / /\n"+
                         "  \\ V /   \\ V /   \\ V / \n"+
                         "   > <     > <     > <  \n"+
                         "  / . \\   / . \\   / . \\ \n"+
                         " /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", ascii);
    }
    
    @Test
    public void ShouldPrintXL(){
        int numero = 40;
        String ascii =  RomanPrinter.print(numero);
        assertEquals(" __   __  _      \n"+
                     " \\ \\ / / | |     \n"+
                     "  \\ V /  | |     \n"+
                     "   > <   | |     \n"+
                     "  / . \\  | |____ \n"+
                     " /_/ \\_\\ |______|\n", ascii);
    }

    @Test
    public void ShouldPrintL(){
        int numero = 50;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("  _      \n"+
                     " | |     \n"+
                     " | |     \n"+
                     " | |     \n"+
                     " | |____ \n"+
                     " |______|\n", ascii);
    }

    @Test
    public void ShouldPrintLX(){
        int numero = 60;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("  _       __   __\n"+
                     " | |      \\ \\ / /\n"+
                     " | |       \\ V / \n"+
                     " | |        > <  \n"+
                     " | |____   / . \\ \n"+
                     " |______| /_/ \\_\\\n", ascii);
    }

    @Test
    public void ShouldPrintLXX(){
        int numero = 70;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("  _       __   __ __   __\n"+
                     " | |      \\ \\ / / \\ \\ / /\n"+
                     " | |       \\ V /   \\ V / \n"+
                     " | |        > <     > <  \n"+
                     " | |____   / . \\   / . \\ \n"+
                     " |______| /_/ \\_\\ /_/ \\_\\\n", ascii);
    }

    @Test
    public void ShouldPrintLXXX(){
        int numero = 80;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("  _       __   __ __   __ __   __\n"+
                     " | |      \\ \\ / / \\ \\ / / \\ \\ / /\n"+
                     " | |       \\ V /   \\ V /   \\ V / \n"+
                     " | |        > <     > <     > <  \n"+
                     " | |____   / . \\   / . \\   / . \\ \n"+
                     " |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", ascii);
    }

    @Test
    public void ShouldPrintXC(){
        int numero = 90;
        String ascii =  RomanPrinter.print(numero);
        assertEquals(" __   __   _____ \n"+
                     " \\ \\ / /  / ____|\n"+
                     "  \\ V /  | |     \n"+
                     "   > <   | |     \n"+
                     "  / . \\  | |____ \n"+
                     " /_/ \\_\\  \\_____|\n", ascii);
    }

    @Test
    public void ShouldPrintC(){
        int numero = 100;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("   _____ \n"+
                     "  / ____|\n"+
                     " | |     \n"+
                     " | |     \n"+
                     " | |____ \n"+
                     "  \\_____|\n", ascii);
    }

    @Test
    public void ShouldPrintCC(){
        int numero = 200;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("   _____    _____ \n"+
                     "  / ____|  / ____|\n"+
                     " | |      | |     \n"+
                     " | |      | |     \n"+
                     " | |____  | |____ \n"+
                     "  \\_____|  \\_____|\n", ascii);
    }

    @Test
    public void ShouldPrintCCC(){
        int numero = 300;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("   _____    _____    _____ \n"+
                     "  / ____|  / ____|  / ____|\n"+
                     " | |      | |      | |     \n"+
                     " | |      | |      | |     \n"+
                     " | |____  | |____  | |____ \n"+
                     "  \\_____|  \\_____|  \\_____|\n", ascii);
    }

    @Test
    public void ShouldPrintCD(){
        int numero = 400;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("   _____   _____  \n"+
                     "  / ____| |  __ \\ \n"+
                     " | |      | |  | |\n"+
                     " | |      | |  | |\n"+
                     " | |____  | |__| |\n"+
                     "  \\_____| |_____/ \n", ascii);
    }

    @Test
    public void ShouldPrintD(){
        int numero = 500;
        String ascii =  RomanPrinter.print(numero);
        assertEquals("  _____  \n"+
                     " |  __ \\ \n"+
                     " | |  | |\n"+
                     " | |  | |\n"+
                     " | |__| |\n"+
                     " |_____/ \n", ascii);
    }
}