package JavaCollections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQn4 {



    ArrayListQn4(){
        ArrayList<String> arrayList = new ArrayList<String>();
        int n;



        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the No of elements");
        n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
        System.out.println("Enter the "+(i)+"  element");
        String temp= sc.next();
        arrayList.add(temp);
    }

        System.out.println("Enter the index of elements you want to retrive");
        n = sc.nextInt();
        System.out.println("Element retrived: "+arrayList.get(n));
    

    sc.close();

    }
    
}

/*4. Write a Java program to retrieve an element (at a specified index) 
from a given array list. */