/* Lab 5 Step Counter Assignment
This program is about a game where the goal is to get the X to get to the final goal,O.
The user can use 2,4,6,8 to move and there are obstacles in which the player cannot go on the spaces.
The gameboard is a 6x15
Frederick Uy
26 October 2020
*/


import java.util.*;
public class Lab5StepCounter
{
   // Gameboard [][] is the array for how the program will work and will be called later to draw the board
    public static char Gameboard[][]; 
    public static void main(String[]args)
    {
    //enable scanner named scan
        Scanner scan = new Scanner(System.in);
        //created object to draw the gameboard
       Lab5StepCounter obj=new Lab5StepCounter();
       //draw the grameboard
        obj.drawboard();
        //set initial values to 0
        int n, moverow=0, movecolumn=0, count=0, x, y, row, column;
        //enable while loop to repeat the steps until the goal is reached
        while(true)
        {
        //counts how many times the user entered the value = steps taken to reach the end
            count++;
            System.out.println("Welcome to the step counter game. Reach the goal and avoid obstacles.");
            System.out.println("You will be given your total number of steps at the end of the game.");
            System.out.println("Press 2 to move up, 4 to move left, 6 to move right and 8 to move down.");
            //stores the value in which the X will move.
            n = scan.nextInt();             
            //value for moving horizontally (row)
            row = moverow; 
            //value for moving vertically (column)
            column = movecolumn;
            //Once the values are all assigned then time to do the movement based on the input of the user
            
            //if user press 2, move one space down
            if(n==2)           
            {
                moverow=moverow-1;
            }
            //if user press 4, move one space left
            else if(n==4)
            {
                movecolumn=movecolumn-1;
            }
            //if user press 6, move one space right
            else if(n==6)
            {
                movecolumn=movecolumn+1;
            }
            //if user press 8, move one space down
            else if(n==8)
            {
                moverow=moverow+1;
            }
            else
            {
                System.out.println("Invalid choice");
                continue;
            }
            //if user move in an obstacle which is I, it will skip, then continue.
            if(Gameboard[moverow][movecolumn]=='I')
            {
                moverow=row;
                movecolumn=column;
                continue;
            }
            //If user move in the goal, which is O, it will say Congratulations, and will say how many steps it took.
            if(Gameboard[moverow][movecolumn]=='O')
            {
                Gameboard[row][column]='_';
                Gameboard[moverow][movecolumn]='X';
                System.out.println("Congratulations. You made it to the end in "+count+" steps");
            }
            //if user move in an empty spot, which is _, it will transition the position of X to the new one
            if(Gameboard[moverow][movecolumn]=='_')
             {
                Gameboard[row][column]='_';
                Gameboard[moverow][movecolumn]='X';
            }
            //This prints the gameboard after each step. The board is a 6x15 array.
            for(x=0; x<6; x++)
            {
                for(y=0; y<15; y++)
                {
                    System.out.print(Gameboard[x][y]+" ");
                }
                System.out.println();
            }
            //once the X reach the O, game will end and say Congratulations
            if(moverow==5 && movecolumn==10)
            {
            System.out.println("Congratulations! You have finished the game!");
                break;
            }
        }
    }
// this method is for drawing the board and the elements on it
    public void drawboard()
    {
      //calling the array that was mentioned in the beginning
        Gameboard= new char[6][15];
        //X is the initial position which is at the place of 0,0
        Gameboard[0][0]='X';// Placing 'X' at its initial position
        //O is the final position which is at the place of 5, 10
        Gameboard[5][10]='O';// Final position 
        
        //There are three obstacles which is at the element of I
        //First obstacle is at 0,14
        Gameboard[0][14]='I';
        //Second obstacle is at 2, 3
        Gameboard[2][3]='I';
        //Third obstacle is at 4, 6
        Gameboard[4][6]='I';
        // initialzie variables for drawing the board
        int i, j;
        char ch;
        // this is a loop that all positions that was not defined above, will be replaced with an underscore
        for(i=0; i<6; i++)
        {
            for(j=0; j<15; j++)
            {
                ch=Gameboard[i][j];
                if(ch!='X'&&ch!='O'&&ch!='I')
                    Gameboard[i][j]='_';
            }
        }
    }
}

