/**
 * Title: SortedNum.java
 * Abstract: This program read an array from a file and then sorts the array and prints into output file
 * Author: Arash Aria CST370
 * ID: 4210
 * Date: 09/04/2015
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedNum {

	public static void main(String[] args) throws IOException {
		
		Scanner fileScanner = new Scanner(System.in);
		
		System.out.println("Input File Path:");
    	
		FileReader file = new FileReader(fileScanner.nextLine());
    	
    	fileScanner.close();
        
    	List<Integer> numbers = new ArrayList<Integer>();
        
        Scanner reader = new Scanner(file);
        
        while(reader.hasNext())
        {
            numbers.add(reader.nextInt());
        }
        
        reader.close();
    	
        System.out.println("Original Numbers:");
        
    	for (int i=0; i<numbers.size();i++){
        System.out.println(numbers.get(i));
        }
        
        Collections.sort(numbers);
        
        System.out.println("Sorted Numbers:");
        
        for (int i=0; i<numbers.size();i++){
        	System.out.println(numbers.get(i));
        }
        
        FileWriter writer = new FileWriter("test1_result.txt"); 
                
    	String number = new String(numbers.toString());
    	writer.write(number);
 
        writer.close();
	}
}
