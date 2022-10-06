public class CaeserCipher {

    public static StringBuilder encrpyt(String inpStr , int shift){
        StringBuilder result = new StringBuilder();
        for (char character : inpStr.toCharArray()) {
            if (character != ' ' && Character.isLetter(character)) {

                if (Character.isLowerCase (character)) {
                    int originalAlphabetPosition = character - 'a';
                    int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);
                    result.append (newCharacter);
                } else {
                    int originalAlphabetPosition = character - 'A';
                    int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                    char newCharacter = (char) ('A' + newAlphabetPosition);
                    result.append (newCharacter);
                }
            } else { // not encrypting special characters and spaces
                result.append(character);
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println (encrpyt("Arizona State University!!", 1));
    }
}
