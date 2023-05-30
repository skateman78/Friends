import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down 5 friends. If you don't have any, make some up.");
        System.out.println("Friend 1 > ");
            String first = scanner.nextLine();
        System.out.println("Friend 2 > ");
            String second = scanner.nextLine();
        System.out.println("Friend 3 > ");
            String third = scanner.nextLine();
        System.out.println("Friend 4 > ");
            String fourth = scanner.nextLine();
        System.out.println("Friend 5 > ");
            String fifth = scanner.nextLine();

        String[] array = new String[5];
        array[0] = first;
        array[1] = second;
        array[2] = third;
        array[3] = fourth;
        array[4] = fifth;

        AV.printAll(array);
        System.out.print("You have to get rid of a person, choose between 1 and 5 > ");
        int number = scanner.nextInt();
        array = AV.deleteAtIndex(array,number-1);
        AV.printAll(array);
        
        System.out.println("\nEnter some majors for each person\n" + array[0] + "'s major > ");

        first = scanner.next();
        System.out.println(array[1] + "'s major > ");
        second = scanner.next();
        System.out.println(array[2] + "'s major > ");
        third = scanner.next();
        System.out.println(array[3] + "'s major > ");
        fourth = scanner.next();

        String[] majors = {first,second,third,fourth};
        String[][] doubleArray = new String[4][2];
        
        doubleArray = DoubleAV.insert(array,majors);
        System.out.print("Here are your college friends: ");
        System.out.println("\n"+DoubleAV.dubPrintAll(doubleArray));

        
        

    }

}
