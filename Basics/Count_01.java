import java.util.Scanner;

public class Count_01 {

    public static void main(String[] args){
        int i, count_vowel =0 ,count_consonant = 0, count_digits =0 , count_spchar =0 ;char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        for(i = 0; i < str.length(); i ++){
            ch = str.charAt(i);

            if("aeiouAEIOU".indexOf(ch) != -1){
            count_vowel ++;
            }
            else if(Character.isLetter(ch)){
                count_consonant ++;
            }
            else if(Character.isDigit(ch)){
                count_digits ++;
            }
            else if(!Character.isWhitespace(ch)){
                count_spchar ++;
            }
        }
        System.out.println("Count of Vowel = "+count_vowel);
            System.out.println("Count of Consonants = "+count_consonant);
            System.out.println("Count of Digits = "+count_digits);
            System.out.println("Count of Special Character = "+count_spchar);
            sc.close();
    }   
}
