package com.company;

import java.util.ArrayList;

public class ToDoFunction {

    private ArrayList<String> todoList=new ArrayList<String>();
    // add list items

    public void addItem(String item){
        todoList.add(item);
    }

    //remove list item
    public void removeItem(int index){
        String myString=todoList.get(index);
        todoList.remove(index);


    }
    //print entire list
    public void printTodoList(){
        System.out.println("TodoList consists of "+todoList.size()+" items ");

        for(int i=0;i<todoList.size();i++) {
            System.out.println("item at postion " + (i + 1) + " is " + todoList.get(i));
        }


        }
        //update the list
    public void updateList (int index,String list){
        todoList.set(index,list);
        System.out.println("list is updated at position"+ index+1);


    }
    // search feature fo user
     public String findItem(String searchItem){
        int index=todoList.indexOf(searchItem);
        if(index ==-1){
            return null;
        }else{
            return todoList.get(index);
        }
     }



}
