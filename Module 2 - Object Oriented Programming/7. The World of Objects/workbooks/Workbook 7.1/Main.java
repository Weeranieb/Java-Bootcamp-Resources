import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person man = new Person();

        man.name = "John";
        man.dateOfBirth = "01/01/1971";
        man.nationality = "American";
        man.passport = new String[]{man.name, man.nationality, man.dateOfBirth};
        man.seatNumber = 5;

        System.out.println(man.name);
        System.out.println(man.nationality);
        System.out.println(man.dateOfBirth);
        System.out.println(Arrays.toString(man.passport));
        System.out.println(man.seatNumber);

    }


    
}
