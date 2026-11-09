package day20;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
        static void main() {
            Scanner input = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();
            int choice;
            do{
                System.out.println("Menu------------------");
                System.out.println("1.Add student names");
                System.out.println("2.Display all students");
                System.out.println("3.Search for a student");
                System.out.println("4.Update a student's name");
                System.out.println("5.Remove a student");
                System.out.println("6.Display the number of students");
                System.out.println("7.Exists");
                System.out.println("------------------------");

                System.out.print("Select an option to proceed:");
                choice = input.nextInt();
                input.nextLine();
                switch (choice){
                    case 1 :
                        System.out.print("Enter a name to add: ");
                        String newName = input.nextLine();
                        names.add(newName);
                        System.out.println("Student added successfully");
                        break;
                    case 2 :
                        if(names.isEmpty()) System.out.println("No student found!");
                        else{
                            System.out.println("Students: ");
                            for (int i=0;i<names.size();i++){
                                System.out.println((i+1)+" -- "+names.get(i));
                            }
                        }
                        break;
                    case 3 :
                        System.out.print("Search a student name: ");
                        String searchName = input.nextLine();
                        if(names.contains(searchName)){
                            System.out.println("Student found!");
                        }
                        else{
                            System.out.println("Student not found!");
                        }
                        break;
                    case 4 :
                        System.out.print("Enter the student name you want to update: ");
                        String oldName = input.nextLine();
                        int index = names.indexOf(oldName);
                        System.out.print("New name: ");
                        String updatedName = input.nextLine();
                        names.set(index, updatedName);
                        System.out.println("Student name successfully updated!");
                        break;
                    case 5 :
                        System.out.print("Enter the student name you want to remove: ");
                        String name=input.nextLine();
                        names.remove(name);
                        System.out.println("Student successfully removed!");
                        break;
                    case 6 :
                        System.out.print("Number of students: ");
                        System.out.println(names.size());
                        break;
                    case 7 :
                        System.out.println("Exits");
                        break;
                    default:
                        System.out.println("Invalid choice! ");
                }
            }while(choice  != 7);


        }
    }
