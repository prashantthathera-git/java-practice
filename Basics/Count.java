import java.util.*;
public class Count {
    public static void main(String[] args)
    {
        int i, count_vowel =0 ,count_consonant = 0, count_digits =0 , count_spchar =0 ;char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        for(i=0;i< str.length();i++)
            {
            ch = str.charAt(i);
            if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o'|| ch =='u'|| ch=='A' || ch == 'E' || ch == 'I' || ch=='O'|| ch == 'U'){
                count_vowel ++;
            
             }
             else if ( (ch >='a' && ch <='z' )|| (ch >= 'A' && ch <='Z')){
                count_consonant ++;
             }
             else if (ch >= '0' && ch <= '9'){
                count_digits ++;
             }
             else if(ch == ' '){
                continue;
             }
             else{
                count_spchar ++;
             }
            }
            System.out.println("Count of Vowel = "+count_vowel);
            System.out.println("Count of Consonants = "+count_consonant);
            System.out.println("Count of Digits = "+count_digits);
            System.out.println("Count of Special Character = "+count_spchar);
    }
    
}
