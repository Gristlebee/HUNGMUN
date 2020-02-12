public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
      public boolean isntDead() {
          if(numWrongGuesses<7){
          return true;
        } else{
            return false;
        }
        }
        public void show() {
            if(numWrongGuesses<7){
            System.out.println(HangmanImage[numWrongGuesses]);}
            if(numWrongGuesses>=7){
                System.out.println(HangmanImage[6]);
              System.out.println("You lost you losing loser. Ha.");  
            }
        }
        public String[] dieSomeMore() {
            int i=0;
            if(numWrongGuesses<7) {
            numWrongGuesses++;
          }
            return HangmanImage;
        }
}
