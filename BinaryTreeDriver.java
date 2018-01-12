import java.util.Scanner;

public class BinaryTreeDriver {
    public static void main(String[] args){
        // get initial dataset
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the initial sequence of values:");
        String inputtedList = kb.next();
        String[] inputtedNums = inputtedList.split(" ");

        int[] numList = new int[inputtedNums.length];

        //parse Strings to Int
        for(int i=0;i<numList.length;i++){
            numList[i] = Integer.parseInt(inputtedNums[i]);
        }
        //create tree

        //run menu
        boolean running = true;
        while (running) {
            System.out.print("Command? ");
            String command = kb.next().toUpperCase();
            if (command.equals("I")){

            }
            else if (command.equals("D")){

            }
            else if (command.equals("P")){

            }
            else if (command.equals("S")){

            }
            else if (command.equals("E")){

            }
            else if (command.equals("H")){

            }
            else {
                System.out.println("Invalid Command.")
            }
        }
    }
}