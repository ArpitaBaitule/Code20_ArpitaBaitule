import java.util.*;
class VowelsConsonant
{
   public static void main(String[] args)
   {
    int v=0,c=0;
    String s="I am Arpita";

    s=s.toLowerCase();

    for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {       
                v++;    
            }        
            else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {         
                c++;    
            }    
        }    
     System.out.println("The vowels are:"+v);
     System.out.println("The vowels are:"+c);
   }
  
}