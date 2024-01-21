import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop"; // String containing the first row characters in the keyboard
        String secondRow = "asdfghjkl"; // String containing the second row characters in the keyboard
        String thirdRow = "zxcvbnm"; // String containing the third row characters in the keyboard

        String[] lowerCaseWords = new String[words.length]; //Since string can contain uppercase letters too, for simplification in comparing, the words are separately stored as complete lowercase words

        for (int i = 0; i < words.length; i++) { // Storing the words as lowercase words in a separate array
            lowerCaseWords[i] = words[i].toLowerCase();
        }

        List<String> result = new ArrayList<>(); // Arraylist is used for the convenient adding of elements

        for (int i = 0; i < words.length; i++) {
            boolean containsIn1stRow = containsLetters(firstRow,lowerCaseWords[i]); // checks if the given word's letters are in the first row
            boolean containsIn2ndRow = containsLetters(secondRow,lowerCaseWords[i]); // checks if the given word's letters are in the second row
            boolean containsIn3rdRow = containsLetters(thirdRow,lowerCaseWords[i]); // checks if the given word's letters are in the third row

            if(containsIn1stRow || containsIn2ndRow || containsIn3rdRow){
                result.add(words[i]);
            }
        }

        String[] resultArray = new String[result.size()]; // Original word with uppercase letters has to be returned therefore a final array to store them.

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;

    }

    private static boolean containsLetters(String mainString, String lettersToCheck) {
        for (char letter : lettersToCheck.toCharArray()) { //iterates through every letter in the string to check
            if (mainString.indexOf(letter) == -1) { // if at least one letter is absent in the mainstring
                return false;
            }
        }
        return true; // all letters in the letterstocheck string are available in the mainstring
    }
}