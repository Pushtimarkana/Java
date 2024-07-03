import java.util.*;

class Student {
    int id_no;
    int no_of_subject;
    int[] subject_code;
    int[] subject_credit;
    int[] grade_obtained;
    double spi;

    public Student() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of subject:");
        no_of_subject = sc.nextInt();

        subject_code = new int[no_of_subject];
        subject_credit = new int[no_of_subject];
        grade_obtained = new int[no_of_subject];

        for (int j = 0; j < no_of_subject; j++) {

            System.out.println("enter " + (j + 1) + " subject code");
            subject_code[j] = sc.nextInt();
            System.out.println("enter " + (j + 1) + " subject credit");
            subject_credit[j] = sc.nextInt();
            System.out.println("enter " + (j + 1) + " subject grade");
            grade_obtained[j] = sc.nextInt();

        }
    }

    public void calculate_spi() {

        int totalcredit = 1;
        int sum = 0;

        for (int i = 0; i < no_of_subject; i++) {

            sum += (grade_obtained[i] * subject_credit[i]);
            totalcredit += subject_credit[i];

        }
        spi = (sum / (totalcredit));
        System.out.println("SPI:" + spi);
    }

}

public class Lab6p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of student:");
        int n = sc.nextInt();
        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].calculate_spi();
        }
    }
}