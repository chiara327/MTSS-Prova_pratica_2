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
                " __      __",  // V
                "  _____ " // I
            },


            {
                " \\ \\    / /",  // V
                " |_   _|" // I
            },

            {
                "  \\ \\  / / ",  // V
                "   | |  " // I
            },

            {
                "   \\ \\/ /  ", // V
                "   | |  " // I
            },
                
            {
                "    \\  /   ", // V
                "  _| |_ " // I
            },
                
            {
                "     \\/    ", // V
                " |_____|" // I
            },
        };
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                asciiArt.append(asciiLetters[z]["VI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}