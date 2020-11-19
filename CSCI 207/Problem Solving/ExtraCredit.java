/*Create a string, myString and print Same if the first 2 chars in the string also appear at the end of the string.
 If the first 2 chars in the string do not appear at the end of the string, print different.
Ron Youmans, Reth Abraham, Frederick Uy
Extra Credit
10/8/2020
*/


public class ExtraCredit{

     public static void main(String []args){

//define string mystring
      String mystring = "edited";
      
      //define variables
      char ch;
      char ch2;
      int len;
      int position;
      
      //calculates the positioning of letters
      ch = mystring.charAt(0);
      len = mystring.length();
      position = len - 2;
      ch2 = mystring.charAt(position);
      
      //if same, it prints same
      if (ch == ch2){
         System.out.println ("Same");
      }
      //if not, prints different
      else{
         System.out.println ("Different");
      }
      
   }//void
}//class