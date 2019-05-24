import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First word!");
        String firstWord = input.next();
        System.out.println("Enter Second word!");
        String secondWord = input.next();

        Anagram anagram = new Anagram();

        if(anagram.checkAnagram(firstWord, secondWord)){
            System.out.println(firstWord +" and "+ secondWord +" are Anagrams");
        }else {
            System.out.println(firstWord +" and "+ secondWord +" are not Anagrams");
        }

    }

}
