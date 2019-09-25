package permutepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {

    static int size; // static variable to hold the size of the char array
    static char[] a; // static char array that will store each character from string 

    public static void main(String[] args) throws IOException {

        /* Read user input form command line */
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please enter the string to permute");
        String s = br.readLine();
        /* Call the permuteString method*/
        permuteString(s);
    }

    public static void permuteString(String s) {
        s = s.replaceAll("\\s", ""); // remove all blank spaces
        size = s.length(); // length of string

        /* If empty string throw exception */
        if (size <= 0) {
            System.err.println("Please enter a non empty string");
            throw new IllegalArgumentException();
        } else {
            a = s.toCharArray(); // convert string to an array of characters
            System.out.println("The string permutations are");
            doPermute(size); // call the recursive method doPermute passing string length as a parameter
            System.out.println();
        }

    }

    /* recursive function that calls itself on characters from array index i+1 to n-1 */
    public static void doPermute(int newSize) {
        /* Base Case*/
        if (newSize <= 1) {
            return;
        } else {
            for (int i = 0; i < newSize; i++) {
                doPermute(newSize - 1);
                //if only two characters then display word
                if (newSize == 2) {
                    displayWord();
                }
                // rotate cycle through the elements in char array
                rotate(newSize);
            }
        }
    }

    /* This function performs in position rotation of the array characters giving each character in string a chance to start at beginning */
    public static void rotate(int s) {
        int position = size - s;
        char temp = a[position];
        int i;
        for (i = position + 1; i < size; i++) {
            a[i - 1] = a[i];
        }
        a[i - 1] = temp;
    }

    /* Displays the current permutation */
    public static void displayWord() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}