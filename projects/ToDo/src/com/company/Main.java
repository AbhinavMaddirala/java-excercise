package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =new Scanner(System.in);
    private static ToDoFunction myTodoLIst =new ToDoFunction();


    public static void main(String[] args) {

        int command=0;
        boolean exit=false;
        printCommand();

        while(!exit){
            System.out.println("enter your command/choices");
            command=scanner.nextInt();
            scanner.nextLine();

            switch(command){
                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoLIst.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit=true;
                    break;
                default:
                    System.out.println("please pick from given commands only");
            }
        }

    }






public static void printCommand(){
    System.out.println("i will print instructions in future");
    System.out.println("\n commands:"+
            "\n press 0:To print instructions" +
            "\n press 1: T print all list" +
            "\n press 2: To add list in todo " +
            "\n press 3:To modify item in the todo" +
            "\n press 4:To remove item from todo" +
            "\n press 5: To search an item from todo" +
            "\n press 6: to exit the app" );
}

public static void addItem(){
    System.out.println("enter item to be added in todo list: ");
    myTodoLIst.addItem(scanner.nextLine());
}
public static void updateItem(){
    System.out.println("enter the item number");
    int index=scanner.nextInt();
    scanner.nextLine();
    System.out.println("enter new item to be added");
    String myNewItem=scanner.nextLine();
    myTodoLIst.updateList(index-1,myNewItem);
}
public static void removeItem(){
    System.out.println("enter the item no to be deleted: ");
    int index=scanner.nextInt();
    scanner.nextLine();
    myTodoLIst.removeItem(index-1);
}
public static void searchItem(){
    System.out.println("enter a string to be searched");
    String searchItem=scanner.nextLine();
    if(myTodoLIst.findItem(searchItem)==null)
    {
        System.out.println("item not found ");
    }
    else
    {
        System.out.println(searchItem+"was found in your list");
    }
}

}


