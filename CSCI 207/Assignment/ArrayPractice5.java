//5.Write a program to create an 8 elements array and add the folowing the values:red,blue,green,orange,black,pink,gray,brown. your program should print the first and last element of the array

public class ArrayPractice5 {
  public static void main(String args[]) {

    String[] colors = new String[8];
    colors[0] = "red";
    colors[1] = "blue";
    colors[2] = "green";
    colors[3] = "orange";
    colors[4] = "black";
    colors[5] = "pink";
    colors[6] = "gray";
    colors[7] = "brown";

    System.out.println(colors[0]);
    System.out.println(colors[7]);
  }
}
