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
                "  _____  ",  // D
                "   _____ ",  // C
                "  _      ",  // L
                " __   __",  // X
                " __      __",  // V
                "  _____ " // I
            },


            {
                " |  __ \\ ",  // D
                "  / ____|",  // C
                " | |     ",  // L
                " \\ \\ / /",  // X
                " \\ \\    / /",  // V
                " |_   _|" // I
            },

            {
                " | |  | |",  // D
                " | |     ",  // C
                " | |     ",  // L
                "  \\ V / ",  // X
                "  \\ \\  / / ",  // V
                "   | |  " // I
            },

            {
                " | |  | |", // D
                " | |     ", // C
                " | |     ", // L
                "   > <  ", // X
                "   \\ \\/ /  ", // V
                "   | |  " // I
            },
                
            {
                " | |__| |", // D
                " | |____ ", // C
                " | |____ ", // L
                "  / . \\ ", // X
                "    \\  /   ", // V
                "  _| |_ " // I
            },
                
            {
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
                asciiArt.append(asciiLetters[z]["DCLXVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}