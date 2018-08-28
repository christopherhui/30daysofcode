import java.util.*;

public class Student extends Citizen{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    char calculate() {
        int len = testScores.length;
        int sum = 0;
        for(int i : testScores) {
            sum += i;
        }
        int average = sum / len;
        if (average >= 90) {
            return 'O';
        }
        else if(average < 90 && average >= 80) {
            return 'E';
        }
        else if(average >= 70) {
            return 'A';
        }
        else if(average >= 55) {
            return 'P';
        }
        else if(average >= 40) {
            return 'D';
        }
        else {
            return 'T';
        }
    }
}
class SolutionStu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printCitizen();
        System.out.println("Grade: " + s.calculate());
    }
}
