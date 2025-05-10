////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert (int number){

        if (number < 1 || number > 100) {
            throw new IllegalArgumentException(number + 
            " non é un numero valido perché non compreso fra 1 e 100.");
        }

        String[] romanLetters = {"C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};


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