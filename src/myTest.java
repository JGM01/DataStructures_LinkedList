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

            LinkedList preList;
            int data;
            int index;
            var choice = input("");
            switch (choice) {
                case 1:
                    preList = g_list;
                    data = input("Value to add: ");
                    g_list.addFirstNode(data);
                    System.out.println("Added value " + data + " as the first node.");
                    System.out.print("List content before adding " + data + " is: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after adding " + data + "is: ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 2:
                    preList = g_list;
                    data = input("Value to add: ");
                    g_list.addLastNode(data);
                    System.out.println("Added value " + data + " as the last node.");
                    System.out.print("List content before adding " + data + " is: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after adding " + data + "is: ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 3:
                    preList = g_list;
                    data = input("Value to add: ");
                    index = input("index to add at");
                    g_list.addAtIndex(index, data);
                    System.out.println("Added value " + data + " at index " + index + ".");
                    System.out.print("List content before adding " + data + " is: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after adding " + data + "is: ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 4:
                    preList = g_list;
                    g_list.removeFirstNode();
                    System.out.println("Removed first node.");
                    System.out.print("List content before removing first node was: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after removing first node is: ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 5:
                    preList = g_list;
                    g_list.removeLastNode();
                    System.out.println("Removed last node.");
                    System.out.print("List content before removing last node was: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after removing last node is: ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 6:
                    preList = g_list;
                    index = input("index to remove");
                    g_list.removeAtIndex(index);
                    System.out.println("Removed node at index " + index + ".");
                    System.out.print("List content before removing index " + index + ": ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after removing index " + index + ": ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("List size: " + g_list.countNodes() + ".");
                    break;
                case 8:
                    System.out.print("The current list forwards is: ");
                    g_list.printList();
                    System.out.println();
                    break;
                case 9:
                    System.out.print("The current list backwards is: ");
                    g_list.printInReverse(g_list.head);
                    System.out.println();
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

