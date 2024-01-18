import java.util.HashSet;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> allowedArray = new HashSet<>();

        for(char c: allowed.toCharArray()){ //add all characters in "allowed" to a hashset to compare easily
            allowedArray.add(c);
        }

        for(String word: words){ //for each word in words array,
            boolean isConsistent = true;

            for (int i = 0; i < word.length(); i++) { // and for every letter in each word
                if(!allowedArray.contains(word.charAt(i))){ // if at least one letter is not in the Hashset
                    isConsistent = false;   // word will not be consistent
                    break;  //no use of checking further as one letter has violated the condition
                }
            }

            if(isConsistent){
                count++; // if the  entire word is consistent, boolean is still true, then we increase the count
            }
        }
        return count;
    }
}