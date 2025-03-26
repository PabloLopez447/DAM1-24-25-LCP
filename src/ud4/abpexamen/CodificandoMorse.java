// Álvaro Barrientos Pazos

package ud4.abpexamen;

public class CodificandoMorse {
    public static void main(String[] args) {

        int result;

        //result = numPuntosMorse("?");
        //result = numPuntosMorse("!");
        //result = numPuntosMorse("SI");
        result = numPuntosMorse("YA NACIO");
        //result = numPuntosMorse("SI VOY");

        System.out.println(result);

        codificaMorse("YA NACIO");

    }

    static int numPuntosMorse(String frase){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
        ".--", "-..-", "-.--", "--..",
        "-.-.--", "..--.." };


        frase = frase.toUpperCase();
        String morseCode = "";

        int letterIDX;
        char letter;
        
        for (int i = 0; i < frase.length(); i++) {
            letter = frase.charAt(i);
            letterIDX = letras.indexOf(letter);
            
            
            if (letter == ' '){
                if (i<frase.length()-1){
                    morseCode+="@@";
                }
            }
            else{
                morseCode += letrasMorse[letterIDX];
                if(i<frase.length()-1){
                    morseCode +="@@";
                }
            }
        }

        morseCode.stripTrailing();

        String pointsString = "";

        for (int i = 0; i < morseCode.length(); i++) {
            
            letter = morseCode.charAt(i);

            pointsString += switch (letter) {
                case '-'-> "...@";
                case '.' -> ".@";
                default -> letter;
            };
        }

        return pointsString.length()-1;
    }

    
    static String codificaMorse(String frase){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
        ".--", "-..-", "-.--", "--..",
        "-.-.--", "..--.." };


        frase = frase.toUpperCase();
        String morseCode = "";

        int letterIDX;
        char letter;
        
        for (int i = 0; i < frase.length(); i++) {
            letter = frase.charAt(i);
            letterIDX = letras.indexOf(letter);
            
            
            if (letter == ' '){
                if (i<frase.length()-1){
                    morseCode+="  ";
                }
            }
            else{
                morseCode += letrasMorse[letterIDX];
                if(i<frase.length()-1){
                    morseCode +="  ";
                }
            }
        }

        morseCode.stripTrailing();

        String pointsString = "";

        for (int i = 0; i < morseCode.length(); i++) {
            
            letter = morseCode.charAt(i);

            pointsString += switch (letter) {
                case '-'-> "... ";
                case '.' -> ". ";
                default -> letter;
            };
        }

        pointsString = pointsString.stripTrailing();

        System.out.println("Codigo Morse: "+pointsString);
        System.out.println(pointsString.length());

        return pointsString;
    }

}
