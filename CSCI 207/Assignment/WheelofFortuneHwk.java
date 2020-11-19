/* Wheel of Fortune Assignment
This program is about asking the user to guess the hidden phrase. The user also needs to spin
the wheel and has to have $250 to be able to guess a letter
Frederick Uy
14 September 2020
*/


/*enabling scanner, array lists, and generator for
  a random number */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//file name is WheelofFortuneHwk
public class WheelofFortuneHwk {
    public static void main(String[] args) {

        // Introduction and Welcomes the User to the game
        System.out.println("Welcome to the Game of Wheel of Fortune");
        System.out.println("Claflin University Edition");
        System.out.println("The category is 'A SONG TITLE'");

        // Song name is SOMEONE YOU LOVE and is assigned to a string
        String song = "SOMEONE YOU LOVE";
        // the __ replaced is also assigned to a string
        String hiddensong = "_______ ___ ____";
        System.out.println(hiddensong);
        System.out.println("$0");
        // ab for random number
        Random ab = new Random();
        // scan for taking user input
        Scanner scan = new Scanner(System.in);
        // num is the money of user after spinning wheel
        int num = 0;
        // boolean to keep looping and asking option until break
        boolean cycle = false;
        // score of user
        int score = 0;

        /*
         * ask user to select an option. Placed in while so it will repeat, answer will
         * be registered to int ans and will go through the switch with each number as a
         * specific case ! is for opposite so cycle = false !cycle = true
         */
        while (!cycle) {
            System.out.println("");
            System.out.println("Select an option: [1] spin the wheel [2] buy a vowel [3] guess the phrase");
            int ans = Integer.parseInt(scan.nextLine());

            // new array for switch statements. If we dont have the import array, this wont
            // work
            ArrayList<Integer> indexes = new ArrayList<>();
            switch (ans) {
                // if user select 1
                case 1: {
                    System.out.println("You Chose Option #1:");
                    // ab = random number generate random number from 1 - 1001
                    num = ab.nextInt(1002);
                    // if num == 0, gameover
                    if (num == 0) {
                        System.out.println("YOU REACHED BANKRUPTCY");
                        System.out.println("GAME OVER! PLEASE TRY AGAIN");
                        // end loop since gameover
                        cycle = true;
                        // if not, it will give a random number and ask user to guess a letter
                    } else if (num > 0 && num < 1001) {
                        System.out.println("You Spinned The Wheel:");
                        System.out.println("WHEEL:$" + num);
                        System.out.println("Guess The Letter on the Phrase");
                        // take user answer
                        String letter = scan.nextLine();
                        // if the letter is in the statement,
                        if (song.contains(letter)) {
                            System.out.println(" The Song Title Is: ");
                            for (int i = 0; i < song.length(); i++) {
                                // ensure that the letter is going to be on the same location of the indicated
                                // location
                                if (song.split("")[i].equals(letter))
                                    indexes.add(i);
                            }

                            // string buffer is like a string but can modified. We used this to be able to
                            // check if a letter is on the song
                            StringBuffer fill = new StringBuffer();
                            // split is for splitting a string to substrings. hidden song is the ____
                            String[] sd = hiddensong.split("");
                            // this cycle checks if the letter is found in the song so it can replace the
                            // letter and change the string
                            boolean cycle1 = false;
                            for (int j = 0; j < hiddensong.length(); j++) {
                                for (Integer i : indexes) {
                                    if (i == j) {
                                        // fill.apend is part of the buffer for changing the hidden song with the letter
                                        // from the user input
                                        fill.append(letter);
                                        score += num;
                                        cycle1 = true;

                                    }
                                }
                                // if letter is not found, then it will cycle = false = reset the option again
                                if (!cycle1) {
                                    fill.append(sd[j]);
                                } else {
                                    cycle1 = false;

                                }
                            }
                            // basically a statement needed to override the ___ with the updated letter
                            hiddensong = fill.toString();
                            if (!hiddensong.contains("-")) {
                                System.out.println(hiddensong);
                            } else {
                                // end cycle = true
                                cycle = true;

                            }
                        }
                        // if number is 1001, user lose a turn
                    } else if (num == 1001) {
                        System.out.println("WHEEL:LOSE A TURN");
                        // end cycle = true
                        cycle = true;
                    }

                    break;
                }
                // if user select 2 as option
                case 2: {
                    System.out.println("You Chose Option #2:");
                    // score or the num has to be >250 to continue, if not it will loop
                    if (score < 250) {
                        System.out.println("Please spin the wheel again. You cannot buy a vowel");
                    } else {
                        score -= 250;
                        System.out.println("Guess The Letter on the Phrase");

                        String letter = scan.nextLine();
                        // same process on 1, just without the spinning wheel. It will identify if the
                        // letter user entered is on the song
                        if (song.contains(letter)) {
                            System.out.println("Song Title");
                            // ensures letter is on the same location where it is supposed to replace
                            for (int i = 0; i < song.length(); i++) {
                                if (song.split("")[i].equals(letter))
                                    indexes.add(i);
                            }
                            // modified string that will be utilized to check if letter is on the song
                            StringBuffer fill = new StringBuffer();
                            // divides hidden song into sub strings to proerly locate and replace the letter
                            String[] sd = hiddensong.split("");
                            boolean cycle1 = false;
                            for (int j = 0; j < hiddensong.length(); j++) {
                                for (Integer i : indexes) {
                                    if (i == j) {
                                        // fill.apend is part of the buffer for changing the hidden song with the letter
                                        // from the user input
                                        fill.append(letter);
                                        score += num;
                                        cycle1 = true;
                                    }

                                }
                                // if letter is not found, then it will cycle = false = reset the option again
                                if (!cycle1) {
                                    fill.append(sd[j]);
                                } else {
                                    cycle1 = false;
                                }
                            }
                            // basically a statement needed to override the ___ with the updated letter
                            hiddensong = fill.toString();
                            if (!hiddensong.contains("-")) {
                                System.out.println(hiddensong);
                            } else {
                                cycle = true;
                            }

                        } else {
                            System.out.println("Try again. The letter is not in the phrase");
                        }

                    }
                    break;
                }

                case 3: {
                    // user choose option 3 and ask user to guess the phrase
                    System.out.println("You Chose Option #3:");
                    System.out.println("Please Guess The Phrase");
                    System.out.println("WHEEL:$" + num);
                    String phrase = scan.nextLine();
                    // if the user guessed the song and is right, it will say You Got It Right!
                    if (phrase.equals(song)) {
                        System.out.println("You Got it Right!");
                        System.out.println("WINNER");
                        cycle = true; // cycle true = end
                    } else {
                        // if not, it will say Try again
                        System.out.println("You got it Wrong!");
                        System.out.println("INCORRECT. Try Again");
                    }
                    break;
                }

            }

        }
    }

}
