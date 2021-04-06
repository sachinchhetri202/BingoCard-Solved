/** 
    * Class Assignment Computer Science 1400 
    * @author Sachin Chhetri <sachinchhetri202@gmail.com>
    * Use of MultiDimentional Array, Loops, Nested loops and Conditions.  
    */

import java.util.*;

public class BingoCard{

    public static void main(String[] args){
    
        int[][] card = new int[5][5];
        ArrayList<Integer> values = new ArrayList<Integer>();
        boolean valid = false;
        int tmp = 0;  // stores the random number
        
        // 5 * 5 this iteraters 0 to 24 times
        for(int i = 0; i <= 4; i++){
            for(int row = 0; row < card.length; row++){
                while(!valid){ // checks if it is not valid
                    tmp = (int)(Math.random() * 15) + 1 + 15 * i; // after each iteration the number increases 
                    if(!values.contains(tmp)){ // if the value is not already in the Arraylist of values then it stores
                        valid = true; // if new number then it adds in the array
                        values.add(tmp);
                    }
                } // end while loop
                card[row][i] = tmp;
                valid = false;
            } // end inner loop
        } // end outer loop
        card[2][2] = 0;
        
        
        //creating an array for the title.  
        String title[]= {"B","I","N","G","O"};
    
        for(int i = 0; i < title.length; i++){
            System.out.print(title[i]+ "\t");
        }
        System.out.println();
        
        // r = row (horizontal)
        // c = column (vertical)
        for(int r = 0; r < card.length; r++){
            for(int c = 0; c < card[r].length; c++){
                System.out.print(card[r][c]+ "\t");
            }
            System.out.println();
        }
    }

}

