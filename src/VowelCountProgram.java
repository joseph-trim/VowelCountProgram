import java.util.Scanner;

public class VowelCountProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: \n");
        String word = sc.next();
        System.out.println("Number of vowels: "+countVowel(word,word.length()));
    }


    static int setVowel(char v) {
        if(v=='a' || v=='a' || v=='e' || v=='i' || v=='o' || v=='u'
                || v=='A' || v=='E' || v=='I' || v=='O' || v=='U') {
            return 1; //true
        }else return 0; //false
    }

    static int countVowel(String word, int number) {
        if (number==1) {
            return setVowel(word.charAt(number-1));
        }
        return countVowel(word, number-1) + setVowel(word.charAt(number-1));
    }

}
