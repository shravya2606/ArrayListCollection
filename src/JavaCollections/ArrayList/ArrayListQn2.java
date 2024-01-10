package JavaCollections.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQn2 {


    static ArrayList<String> arrayList = new ArrayList<String>();
    int n;
    ArrayListQn2() {
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the No of elements");
    n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
        System.out.println("Enter the "+(i+1)+"  colour");
        String temp= sc.next();
        arrayList.add(temp);
    }
    sc.close();
    }
    public void printing(){
        for (int i = 0; i < n; i++) {
            System.out.println(arrayList.get(i));
             
        }
    }
    
}
//2. Write a Java program to iterate through all elements in an array list.
