package com.mazher.nonassisted;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileHandle {
	
	public static void main(String[] args) throws IOException {
		optionSelection();
		
	}
	public static void optionSelection() throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Operation you want to perform on file:");
		System.out.println("Read - Press 1");
		System.out.println("Write - Press 2");
		System.out.println("Append - Press 3");
		System.out.println("CloseApplication - Press 4");
		int number = input.nextInt();
		switch(number) {
		case 1:
			readFile();
			optionSelection();
			break;
		case 2:
			writeFile();
			optionSelection();
			break;
		case 3:
			appendFile();
			optionSelection();
			break;
		case 4:
			closeApp();
			break;
		default:
			System.out.println("Invalid Operation, try again");
			optionSelection();
		}
	}
	public static void readFile() throws IOException{
		File file = new File("C://Users//mdmaz//eclipse-workspace//Practice_Project_NonAssisted//textdemo1.txt");
        if (file.createNewFile()) {
            System.out.println("File has been created.");
        } else {
        	System.out.println();
            System.out.println("File already exists,Here is your file Content.");
            System.out.println("----------------------------------------------");
            Scanner sc = new Scanner(file);
         
            while (sc.hasNextLine()) {
            	System.out.println(sc.nextLine());
            }
              
        }
		
	}
	public static void writeFile() throws IOException {
		File file = new File("C://Users//mdmaz//eclipse-workspace//Practice_Project_NonAssisted//textdemo1.txt");
        if (file.createNewFile()) {
            System.out.println("File has been created.");
        } else {
        	System.out.println();
            System.out.println("File already exists,What you want to write.Please type Below");
            System.out.println("------------------------------------------------------------");
            Scanner input = new Scanner(System.in);
            String str =input.nextLine();
            
            FileWriter fWriter = new FileWriter("C://Users//mdmaz//eclipse-workspace//Practice_Project_NonAssisted//textdemo1.txt");
            fWriter.write(str);
            fWriter.close();
            System.out.println("File is created successfully with the content."); 
              
        }
	}
	public static void appendFile() throws IOException {
		File file = new File("C://Users//mdmaz//eclipse-workspace//Practice_Project_NonAssisted//textdemo1.txt");
        if (file.createNewFile()) {
            System.out.println("File has been created.");
        } else {
        	System.out.println();
            System.out.println("File already exists,Here is your file. Now you can appand data please type below.");
            System.out.println("---------------------------------------------------------------------------------");
            Scanner input = new Scanner(System.in);
            String str =input.nextLine();
            FileWriter output = new FileWriter("C://Users//mdmaz//eclipse-workspace//Practice_Project_NonAssisted//textdemo1.txt",true);
            output.write(str);
            output.close();
            System.out.println("Content Successfully Added");
              
        }
     
	}
	public static void closeApp() {
		System.out.println("Closing Application, Thankyou...");
	}
	
}
