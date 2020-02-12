import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    
    String correct="correct";
    String[] A = new String[correct.length()];
    String[] Wrg = new String[100];
    int wrg=0;
     public void set() {
         for(int i=0; i<Wrg.length; i++) {
            Wrg[i]="";
         
        }
    }
    public boolean isUnsolved() {
      
        return true;
     
    }
    public void show() {
        String[] A = new String[correct.length()];
        
        for(int i=0; i<A.length; i++) {
         A[i]="_";
        }
         for(int i=0; i<A.length; i++) {
         System.out.print(A[i]);
        }
        System.out.println(" ");
       
        for(int i=0; i<Wrg.length; i++) {
            
         System.out.print(Wrg[i]);
        }
       
    }
    public boolean makeGuess(String guess) {
        for(int i=0; i<correct.length();i++){
            String s=correct.substring(i,i+1);
          if(guess.equals(s)){
              return true;
              
            } 
        }
        
        Wrg[wrg]=guess;
        wrg++;
        return false;
        
    }
    public String getWord() {
     return "correct";
    }
}
