import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Silbentrennen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welchen String willst du in Silben teilen?: ");
        String word = sc.nextLine();
        ArrayList<String> characters = new ArrayList<String>();
        ArrayList<String> vokale = new ArrayList<String>();
        ArrayList<String> silbenString = new ArrayList<String>();
        vokale.add("A"); vokale.add("a"); vokale.add("E"); vokale.add("e"); vokale.add("i"); vokale.add("I"); vokale.add("O"); vokale.add("o"); vokale.add("U"); vokale.add("u");
        int wordCharCount = 0;
        
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            String charString = Character.toString(ch);
            characters.add(charString);
            if(charString.equals(" ")){
               wordCharCount = 0;
            }else{
                wordCharCount += 1;
            }
            
            if(i > 1){
                int charIDb = i - 1;
                int charIDa = i;
                int charIDc = i + - 2;
                String space = " ";
                String charA = characters.get(charIDa);
                String charB = characters.get(charIDb);
                String charC = characters.get(charIDc);
                boolean contA = vokale.contains(charA);
                boolean contB = vokale.contains(charB);
                
                if(charA.equals(charB) && !vokale.contains(charA)){
                    silbenString.add("_");
                }
                silbenString.add(charA);
                if(vokale.contains(charC) && contA ^ contB && wordCharCount > 4){
                    silbenString.add(charIDb ,"_");
                }
            
            }
            else{
             silbenString.add(charString);
            
            }       
        }
        String charString = silbenString.toString();
        System.out.println(charString);
    }
    
}