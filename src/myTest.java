// Name: Jacob Germana-McCray
// Class: CS 3305/Section#04
// Term: Fall 2022
// Instructor: Dr. Majeed
// Assignment: 2

import java.util.Scanner;

public class myTest
{
    static Scanner sc = new Scanner(System.in);

    // Global list to keep track of values across switch cases.
    static LinkedList gList = new LinkedList();

    public static void main (String[] args)
    {
        menu();
    }

    // Simple input method, so I don't have to repeat code.
    static int input(String msg) {
        System.out.print(msg);
        return Integer.parseInt(sc.next());
    }
    /// The logic of the program.
    ///
    /// Prompts for the user input, then sends the output into
    /// the switch statement to be acted upon.
    ///
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
                case 1 -> {
                    preList = gList;
                    data = input("Value to add: ");
                    gList.addFirstNode(data);
                    System.out.println("Added value " + data + " as the first node.");
                    System.out.print("List content before adding " + data + " is: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after adding " + data + "is: ");
                    gList.printList();
                    System.out.println();
                }
                case 2 -> {
                    preList = gList;
                    data = input("Value to add: ");
                    gList.addLastNode(data);
                    System.out.println("Added value " + data + " as the last node.");
                    System.out.print("List content before adding " + data + " is: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after adding " + data + "is: ");
                    gList.printList();
                    System.out.println();
                }
                case 3 -> {
                    preList = gList;
                    data = input("Value to add: ");
                    index = input("index to add at");
                    gList.addAtIndex(index, data);
                    System.out.println("Added value " + data + " at index " + index + ".");
                    System.out.print("List content before adding " + data + " is: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after adding " + data + "is: ");
                    gList.printList();
                    System.out.println();
                }
                case 4 -> {
                    preList = gList;
                    gList.removeFirstNode();
                    System.out.println("Removed first node.");
                    System.out.print("List content before removing first node was: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after removing first node is: ");
                    gList.printList();
                    System.out.println();
                }
                case 5 -> {
                    preList = gList;
                    gList.removeLastNode();
                    System.out.println("Removed last node.");
                    System.out.print("List content before removing last node was: ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after removing last node is: ");
                    gList.printList();
                    System.out.println();
                }
                case 6 -> {
                    preList = gList;
                    index = input("index to remove");
                    gList.removeAtIndex(index);
                    System.out.println("Removed node at index " + index + ".");
                    System.out.print("List content before removing index " + index + ": ");
                    preList.printList();
                    System.out.println();
                    System.out.print("List content after removing index " + index + ": ");
                    gList.printList();
                    System.out.println();
                }
                case 7 -> System.out.println("List size: " + gList.countNodes() + ".");
                case 8 -> {
                    System.out.print("The current list forwards is: ");
                    gList.printList();
                    System.out.println();
                }
                case 9 -> {
                    System.out.print("The current list backwards is: ");
                    gList.printInReverse(gList.head);
                    System.out.println();
                }
                case 10 -> {
                    System.out.println("Exiting program.");
                    return;
                }
                default -> {
                }
            }

        }
    }

}

