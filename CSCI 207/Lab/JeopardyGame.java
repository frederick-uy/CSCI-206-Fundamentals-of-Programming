/* Jeopardy GameAssignment
This program is about asking the user to input a category and an amount. Each category and ammount
has a corresponding question. User will be able to answer questions until all questions have been answered
or selects Q to quit
Frederick Uy
21 September 2020
*/

import java.util.Random;
import java.util.Scanner;

class JeopardyGame {
    // initialize the dollar value and questions and answer for the category Important Dates
    public static void ImportantDateValues(int[] dollarvalue, String[] question, String[] answer) {
        dollarvalue[0] = 200;
        dollarvalue[1] = 400;
        dollarvalue[2] = 600;
        dollarvalue[3] = 800;
        dollarvalue[4] = 1000;

        question[0] = "When is Christmas celebrated?";
        question[1] = "When is Valentine’s Day celebrated? ";
        question[2] = "When is America’s Independence Day? ";
        question[3] = "When is election day? ";
        question[4] = "When is the start of a new year? ";

        answer[0] = "December 25";
        answer[1] = "February 24";
        answer[2] = "July 4";
        answer[3] = "November 3";
        answer[4] = "January 1";
    }

    // initialize the dollar value and questions and answer for the category Presidential Candidates
    public static void PresidentialCandidatesValues(int[] dollarvalue, String[] question, String[] answer) {
        dollarvalue[0] = 200;
        dollarvalue[1] = 400;
        dollarvalue[2] = 600;
        dollarvalue[3] = 800;
        dollarvalue[4] = 1000;

        question[0] = "Who is the first president of United States? ";
        question[1] = "Who is the current president (2020)? ";
        question[2] = "Who is the president during Great Depression? ";
        question[3] = "Who is the tallest president? ";
        question[4] = "Who is the shortest president? ";

        answer[0] = "George Washington";
        answer[1] = "Donald Trump";
        answer[2] = "Franklin Roosevelt";
        answer[3] = "Abraham Lincoln";
        answer[4] = "James Madison";
    }

    // initialize the dollar value and questions and answer for the category Voting Information
    public static void VotingInformationValues(int[] dollarvalue, String[] question, String[] answer) {
        dollarvalue[0] = 200;
        dollarvalue[1] = 400;
        dollarvalue[2] = 600;
        dollarvalue[3] = 800;
        dollarvalue[4] = 1000;

        question[0] = "How old do you have to be to vote? ";
        question[1] = "Can you vote by mail (Yes/No)? ";
        question[2] = "Do you have to be a citizen to vote (Yes/No)? ";
        question[3] = "Can you be disqualified from voting due to a court order (Yes/No)? ";
        question[4] = "Can you pre-register to vote at 17 (Yes/No)? ";

        answer[0] = "18";
        answer[1] = " Yes";
        answer[2] = " Yes";
        answer[3] = " Yes";
        answer[4] = " Yes";
    }
    
    // initialize the dollar value and questions and answer for the category General Election
    public static void GeneralElectionValues(int[] dollarvalue, String[] question, String[] answer) {
        dollarvalue[0] = 200;
        dollarvalue[1] = 400;
        dollarvalue[2] = 600;
        dollarvalue[3] = 800;
        dollarvalue[4] = 1000;

        question[0] = "A general election is an election in which candidates are elected to offices (Yes/No) ? ";
        question[1] = "General elections happen every 10 years (Yes/No)? No";
        question[2] = "What state has a unique general election rules? ";
        question[3] = "General elections can be held at any level (city, county) (Yes/No)? ";
        question[4] = "A general election day may also include elections for local officials. (Yes/No)? ";

        answer[0] = "Yes";
        answer[1] = "No";
        answer[2] = "Louisiana";
        answer[3] = "Yes";
        answer[4] = "Yes";
    }

    // main method for printing the board
    public static void main(String[] args) throws java.lang.Exception {

        // Important Dates assigned the questions and answers to a string and initialize a new value
        Scanner scan = new Scanner(System.in);
        int[] ImportantDate = new int[5];
        String[] ImportantDateQuestions = new String[5];
        String[] ImportantDateAnswers = new String[5];
        // fill the values. The questions and answers I wrote are now assigned to these strings and int.
        ImportantDateValues(ImportantDate, ImportantDateQuestions, ImportantDateAnswers);

        // same process above, but for Presidential Candidates
        int[] PresidentialCandidates = new int[5];
        String[] PresidentialCandidatesQuestions = new String[5];
        String[] PresidentialCandidatesAnswers = new String[5];
        PresidentialCandidatesValues(PresidentialCandidates, PresidentialCandidatesQuestions, PresidentialCandidatesAnswers);

        // same process above, but for Voting Information
        int[] VotingInformation = new int[5];
        String[] VotingInformationQuestions = new String[5];
        String[] VotingInformationAnswers = new String[5];
        VotingInformationValues(VotingInformation, VotingInformationQuestions, VotingInformationAnswers);

        // same process above, but for General Election
        int[] GeneralElection = new int[5];
        String[] GeneralElectionQuestions = new String[5];
        String[] GeneralElectionAnswers = new String[5];
        GeneralElectionValues(GeneralElection, GeneralElectionQuestions, GeneralElectionAnswers);
        
int score = 0;
while(true)
       { 
        // front-end print the game and welcomes user to game
        System.out.println("Welcome to the game!");
        System.out.println("This is the game jeopardy!");
        String quit = "a";
        // game will end if user press Q or q
        while (!quit.equals("Q") && !quit.equals("q")) {
            System.out.println("Please Select a category and a matching dollar value or press Q to quit");
            System.out.println("Score: $" + score);
            System.out.println("");//space
            // utilized a multi dimensional array to print the board numbers
            String[][] jeopardyBoard= { 
            { "$200", "$200", "$200", "$200" }, 
            { "$400", "$400", "$400", "$400" },
            { "$600", "$600", "$600", "$600" }, 
            { "$800", "$800", "$800", "$800" },
            { "$1000", "$1000", "$1000", "$1000" } };
            
            
            // print the board headings and to make sure the values align with category
            System.out.println("Important     Presidential     Voting      General");
            System.out.println(" Dates         Candidates    Information   Election");
            for (int row = 0; row < jeopardyBoard.length; row++) {
                for (int column = 0; column < jeopardyBoard[row].length; column++) {
                    System.out.print(jeopardyBoard[row][column] + "           ");
                }
                System.out.println();
            }
            break;
        }
        // if user press Q or q game will end
        String categoryinput = scan.nextLine().trim();
        if (categoryinput.equals("Q") || categoryinput.equals("q")) {
          System.out.println("Thank you for playing. Please come again.");
        break;
      
        }
        
        // if user entered category not mentioned, it will say enter a valid input
        while (!categoryinput.equals("Important Dates") && !categoryinput.equals("Presidential Candidates")
                && !categoryinput.equals("Voting Information") && !categoryinput.equals("General Election")) {
            System.out.println("Enter a valid input");
            categoryinput = scan.nextLine().trim();
        }
        
        // this is for choosing the dollarvalue
        int value = Integer.parseInt(scan.nextLine());
        // basically if user chose 800 it will be divided by 200 -1 which is equals to 3 showing the 3rd question on the method
        int index = value / 200 - 1;

        // I used a switch statement for the category, basically each category has its own case and it has similar logic on how the code is
        switch (categoryinput) {

            // important dates category
            case "Important Dates":
                // the user input a number aligns from the values indicated
                if (ImportantDate[index] > 0) {
                    // print out the question
                    System.out.println(ImportantDateQuestions[index]);
                    // get the answer from user
                    String ans = scan.nextLine().trim();
                    // if it is the same as mentioned
                    if (ans.equals(ImportantDateAnswers[index])) {
                        // I utilized the index which will make a value dissapear once answered
                        ImportantDate[index] = -1;
                        // correct answer
                        System.out.println("Your answered is correct! Congratulations");
                         System.out.println("");//space
                         score = score + value; // increase score if correct
                   }
                    // wrong answer
                    else {
                        System.out.println("Your answer is wrong! Please try again");
                        score = score - value; //decrease score if incorrect
                    }

               }
                // user picked a category that already has been answered
                else {
                    System.out.println("You already have answered this question. Please select again");        
                }
              

                break;

            // same logic as the category Important Date
            case "Presidential Candidates":
                if (PresidentialCandidates[index] > 0) {
                    System.out.println(PresidentialCandidatesQuestions[index]);
                    String ans = scan.nextLine().trim();
                    if (ans.equals(PresidentialCandidatesAnswers[index])) {
                        PresidentialCandidates[index] = -1;
                        System.out.println("Your answered is correct! Congratulations");
                         System.out.println("");//space
                         score = score + value; // increase score if correct
                    } else {
                        System.out.println("Your answer is wrong! Please try again");
                        score = score - value;
                        score = score - value; //decrease score if incorrect
                    }
                    
                    
                } else {
                    System.out.println("You already have answered this question. Please select again");
                }
                break;

            // same logic as the category Important Date
            case "Voting Information":
                if (VotingInformation[index] > 0) {
                    System.out.println(VotingInformationQuestions[index]);
                    String ans = scan.nextLine().trim();
                    if (ans.equals(VotingInformationAnswers[index])) {
                        VotingInformation[index] = -1;
                        System.out.println("Your answered is correct! Congratulations");
                         System.out.println("");//space
                         score = score + value; // increase score if correct
                    } else {
                        System.out.println("Your answer is wrong! Please try again");
                        score = score - value; //decrease score if incorrect
                    }
                } else {
                    System.out.println("You already have answered this question. Please select again");
                }
                break;

            // same logic as the category Important Date
            case "General Election":
                if (GeneralElection[index] > 0) {
                    System.out.println(GeneralElectionQuestions[index]);
                    String ans = scan.nextLine().trim();
                    if (ans.equals(GeneralElectionAnswers[index])) {
                        GeneralElection[index] = -1;
                        System.out.println("Your answer is correct! Congratulations");
                         System.out.println("");//space
                         score = score + value; // increase score if correct
                    } else {
                        System.out.println("Your answer is wrong! Please try again");
                        score = score - value; //decrease score if incorrect
                    }
                } else {
                    System.out.println("You already have answered this question. Please select again");
                }
                break;
                
            default:
                break;
        }
    }
}

}
