package day21;

import java.util.HashSet;
import java.util.Scanner;

public class StudentRegistrationSystem {
    static void main() {
        HashSet<String> students= new HashSet<>();
        Scanner input = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("____________ Menu ___________");
            System.out.println("1. Register a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Remove a student");
            System.out.println("4. Display all students");
            System.out.println("5. Display number of students");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1: {
                    System.out.print("Enter Student name to add: ");
                    String newStudent=input.nextLine();
                    if (students.contains(newStudent)) System.out.println("Student already exists...");
                    else {
                        students.add(newStudent);
                        System.out.println(newStudent + " Added successfully...\n");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter Student name to search: ");
                    String searchName=input.nextLine();
                    if (students.contains(searchName)) System.out.println("Student found...\n");
                    else System.out.println("student not found...\n");
                    break;
                }
                case 3: {
                    System.out.print("Enter Student name to remove: ");
                    String removeName=input.nextLine();
                    students.remove(removeName);
                    System.out.println(removeName + " Successfully removed...\n");
                    break;
                }
                case 4: {
                    System.out.println("Students: ");
                    for (String student:students) System.out.println(student);
                    break;
                }
                case 5: {
                    System.out.println("There are " + students.size() + " students in the system...\n");
                    break;
                }
                case 6:{
                    System.out.println("Exits...\n");
                    break;
                }
                default:
                    System.out.println("\ninvalid entry...");
            }

        } while (choice!=6);
    }
}
