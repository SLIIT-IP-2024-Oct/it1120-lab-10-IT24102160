import java.util.Scanner;

public class IT24102160Lab10Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        
        assert( mark >= 0 && mark <= 100) : "Invalid Mark";
        System.out.println("Mark is Validated");

          
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

              assert if (mark >= 75 && grade == 'A') || 
              if (mark >= 60 && mark < 75 && grade == 'B') || 
              if (mark >= 50 && mark < 60 && grade == 'C') || 
              if (mark >= 40 && mark < 50 && grade == 'D') || 
              if (mark < 40 && grade == 'F'): "Incorrect Grade Assigned";
             
         System.out.println("Grade is: " + grade);

        
       }
}
