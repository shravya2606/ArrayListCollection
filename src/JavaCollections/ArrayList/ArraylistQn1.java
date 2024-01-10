package JavaCollections.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistQn1 {
    //1. Write a Java program to create an array list, add some colors (strings), and print out the collection.
    static ArrayList<String> arrayList = new ArrayList<String>();
    int n;
    ArraylistQn1() {
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the No of colours you want to put in the list");
    n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
        System.out.println("Enter the "+(i+1)+"  colour");
        String temp= sc.next();
        arrayList.add(temp);
    }
    sc.close();

    }
    
    
    public void showColours(){
    	System.out.println("Colors are");
        for (int i = 0; i < n; i++) {
        	
            System.out.println(arrayList.get(i));
             
        }
    }
    
}

