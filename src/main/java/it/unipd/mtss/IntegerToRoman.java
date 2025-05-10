////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert (int number){

        if (number < 1 || number > 10) {
            throw new IllegalArgumentException(number + 
            "non è un numero valido perché non compreso fra 1 e 10.");
        }

        String[] romanLetters = {"X", "IX", "V", "IV", "I"};
        int[] values = {10, 9, 5, 4, 1};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }
        return romanNumber.toString();
    }
}