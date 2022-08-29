import java.util.Scanner;

public class myTest
{
    static Scanner sc = new Scanner(System.in);

    static LinkedList g_list = new LinkedList();

    public static void main (String[] args)
    {
        menu();
    }

    static int input(String msg) {
        System.out.print(msg);
        return Integer.parseInt(sc.next());
    }


    static void menu() {
        while (true) {
            System.out.println(
                    """
                    ---------MAIN MENU--------
                    1 – Add First Node
                    2 – Add Last Node
                    3 – Add At Index
                    4 – Remove First Node
                    5 – Remove Last Node
                    6 – Remove At Index
                    7 – Print List Size
                    8 – Print List (Forward)
                    9 – Print List In Reverse
                    10- Exit program
                    Enter option number:
                    """
            );

            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    var temp = input("Value to add: ");
                    g_list.addFirstNode(temp);
                    System.out.println("Added value " + temp + " as the first node.");
                    System.out.println("List content before adding " + temp + " is: ");
                    System.out.println("List content after adding " + temp + "is: ");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Exiting program.");
                    return;
                default:
                    break;
            }

        }
    }

}

