import java.util.Arrays;

public class Anagram {


    public boolean checkAnagram(String firstWord,String secondWord){

        boolean isAnagram=true;


        // if strings length are not same
        // then they are not anagrams
        if ( firstWord.length() != secondWord.length() ) {
            return false;
        }
        firstWord   =  firstWord.toLowerCase();
        secondWord  = secondWord.toLowerCase();
        char[] firstWordCharacterArray = firstWord.toCharArray();
        char[] secondWordCharacterArray = secondWord.toCharArray();
        Arrays.sort(firstWordCharacterArray);
        Arrays.sort(secondWordCharacterArray);
        firstWord = new String(firstWordCharacterArray);
        secondWord = new String(secondWordCharacterArray);
        return firstWord.equals(secondWord);

    }


}
