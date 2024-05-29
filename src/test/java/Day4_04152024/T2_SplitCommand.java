package Day4_04152024;

public class T2_SplitCommand {
    public static void main(String[] args) {
        //declare a string variable with a single message
        String message = "My name is John";
        //declare an array to store the split messages
        String[] splitMessageArray = message.split(" ");
        //print out only John from the string
        System.out.println("The name is " + splitMessageArray[3]);
        //declare another message
        String triageMessage = "Automation_02";
        //store the message in a linear array
        String[] triageMessageArray = triageMessage.split("_");
        //print out only the number
        System.out.println("The number is " + triageMessageArray[1]);
    }//end of main
}//end of class