package Automation_AI01;

public class Assignment_1 {public static void main(String[] args) {
    //declare a message variable
    String message = "Hello my name is Maita Johnson, this is my first QA course.";
            //declare an integer variable
    int classNumber = 2024;
    //combine / concatenate the message and the class number (concatenation)
    System.out.println(  message + "  The course number is Spring " + classNumber);
    //declare a string array variable
    String[] studentNames;
    //store some values in the string array
    studentNames = new String[]{" Donald Duck ",  " Batman ",  " Superman ", " Wonder Woman "};
                System.out.println("Students in this course are: " + studentNames[0]  +  studentNames[1] + studentNames[2] +  studentNames[3]);
    //declare and store student grades
    int[] studentGrades = new int[] {91 , 93 , 95 , 99};
    System.out.println("These are the following grades for each student: "  +  studentNames[0] + studentGrades [0]   + studentNames[1] +  studentGrades [1]  + studentNames[2] +  studentGrades [2]  +   studentNames[3] +studentGrades [3]) ;
    System.out.println("The highest grade is from " + studentNames[3]   +  studentGrades[3]);
    System.out.println("The student with the highest grade is " + studentNames[3]);
}// end of main method
}//end of class

