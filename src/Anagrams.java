import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = s.nextLine();
        int numAnagrams = 10;

        for (int i = 1; i <= numAnagrams; i++) {
            String anagram = generateAnagram(word);
            System.out.println("Anagram" + i + ":" + anagram);
        }
    }
public static String generateAnagram(String word) {
    char[] charArray = word.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        int randomIndex = (int) (Math.random() * charArray.length);
        char temp = charArray[i];
        charArray[i] = charArray[randomIndex];
        charArray[randomIndex] = temp;
    }
    return new String(charArray);
}
}
