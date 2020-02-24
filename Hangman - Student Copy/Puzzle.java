import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    
    ArrayList<String> words;
    public Puzzle() {
         words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();
		
	
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    String [] correct=wordD(words.get((int)(Math.random())*(words.size())));
    String[] A = new String[correct.length];
    String[] Wrg = new String[100];
    String 
    int wrg=0;
    public String[] wordD(String s) {
        String[] a= new String[s.length()];
        for(int i=0; i<s.length(); i++){
            a[i]=s.charAt(i)+"";
        }
        return a;
    }
     public void set() {
         for(int i=0; i<Wrg.length; i++) {
            Wrg[i]="";
            
        }
        for(int i=0; i<A.length; i++) {
         A[i]="_";
        }
    }
    public boolean isUnsolved() {
         for(int i=0; i<A.length;i++){
           
          if(A[i].equals("_")){
               System.out.println("LETS PLAY HUNGMUN");
             return true;
             
            } 
        }
       
        return false;
     
    }
    public void show() {
        
        
        
         for(int i=0; i<A.length; i++) {
         System.out.print(A[i]);
        }
        System.out.println(" ");
       
        for(int i=0; i<Wrg.length; i++) {
            
         System.out.print(Wrg[i]);
        }
       
    }
    public boolean makeGuess(String guess) {
        int yes=0;
        for(int i=0; i<correct.length();i++){
            String s=correct.substring(i,i+1);
          if(guess.equals(s)){
              A[i]=guess;
              yes=1;
              
            } 
        }
        if(yes==1) {return true;}
        Wrg[wrg]=guess;
        wrg++;
        return false;
        
    }
    public String getWord() {
     return "correct";
    }
}
