// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;

public class TowerOfHanoi {
    private static int steps = 0;
    // count the steps

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();

        // Initialize the source peg A with the disks
        int n = 5;
        for (int i = n; i > 0; i--) {
            A.add(i);
        }

        // Move the disks from A to C using B as auxiliary peg
        towerOfHanoi(n, A, C, B);

        // Print the contents of peg C (the target)
        System.out.println("Peg A: " + A);
        System.out.println("Peg B: " + B);
        System.out.println("Peg C: " + C);
        System.out.println("Number of steps: " + steps);
    }

    public static void towerOfHanoi(int n, ArrayList<Integer> source, ArrayList<Integer> target, ArrayList<Integer> auxiliary) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary, using target as auxiliary peg
            towerOfHanoi(n-1, source, auxiliary, target);

            // Move the nth disk from source to target
            target.add(source.remove(source.size()-1));
            steps++;

            // Display the progress of the algorithm
            System.out.println("Peg A: " + source);
            System.out.println("Peg B: " + auxiliary);
            System.out.println("Peg C: " + target);
            System.out.println("Number of steps: " + steps);
            System.out.println();

            // Move n-1 disks from auxiliary to target, using source as auxiliary peg
            towerOfHanoi(n-1, auxiliary, target, source);
        }
    }
}

