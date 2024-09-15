import java.util.Scanner;
public class task2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        double subjects= scanner.nextInt();
        double total = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " +  i  + " : ");
            int marks = scanner.nextInt();
            total+= marks;
        }
        double percentage= total / subjects;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
