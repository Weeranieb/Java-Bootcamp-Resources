import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        int people = scan.nextInt();
        String[][] database = new String[people][3];
        //       – Store the value.
        scan.nextLine();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
        }
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 

        System.out.print("\nWho do you want information on? ");  
        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        
        String name = scan.nextLine();
        for (String[] database1 : database) {
            if (database1[0].equals(name)) {
                System.out.println("\tName: " + database1[0]);
                System.out.println("\tDate of birth: " + database1[1]);
                System.out.println("\tOccupation: " + database1[2]);
            }
        }

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (String[] array1 : array) {
            System.out.print("\t");
            for (String array11 : array1) {
                System.out.print(array11 + " "); 
            }
            System.out.print("\n");
        }
    }

}
