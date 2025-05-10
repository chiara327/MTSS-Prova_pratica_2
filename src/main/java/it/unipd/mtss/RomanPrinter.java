////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        StringBuilder asciiArt = new StringBuilder();
    
        String[][] asciiLetters = {
            {
                "  __  __ ", // M
                "  _____  ",  // D
                "   _____ ",  // C
                "  _      ",  // L
                " __   __",  // X
                " __      __",  // V
                "  _____ " // I
            },


            {   
                " |  \\/  |", // M
                " |  __ \\ ",  // D
                "  / ____|",  // C
                " | |     ",  // L
                " \\ \\ / /",  // X
                " \\ \\    / /",  // V
                " |_   _|" // I
            },

            {   
                " | \\  / |", // M
                " | |  | |",  // D
                " | |     ",  // C
                " | |     ",  // L
                "  \\ V / ",  // X
                "  \\ \\  / / ",  // V
                "   | |  " // I
            },

            {   
                " | |\\/| |", // M
                " | |  | |", // D
                " | |     ", // C
                " | |     ", // L
                "   > <  ", // X
                "   \\ \\/ /  ", // V
                "   | |  " // I
            },
                
            {
                " | |  | |", // M
                " | |__| |", // D
                " | |____ ", // C
                " | |____ ", // L
                "  / . \\ ", // X
                "    \\  /   ", // V
                "  _| |_ " // I
            },
                
            {
                " |_|  |_|", // M
                " |_____/ ", // D
                "  \\_____|", // C
                " |______|", // L
                " /_/ \\_\\", // X
                "     \\/    ", // V
                " |_____|" // I
            },
        };
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                asciiArt.append(asciiLetters[z]["MDCLXVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}