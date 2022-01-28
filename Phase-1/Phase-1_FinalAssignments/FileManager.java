package com.mazher.fm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileManager {
		static Scanner input = new Scanner(System.in);
		static String currentDirectory = System.getProperty("user.dir");
	public static void main(String[] args) {
		System.out.println("\n********************************************\n");
        System.out.println("\tWelcome to File manager 1.0 \n");
        System.out.println("\t  Developed By Md.Mazher\n");
        System.out.println("********************************************");
       
        mainMenu();
	}
	
	
	public static void mainMenu() {
		System.out.println("\n********************************************");
	    System.out.println("\t        Main Menu");
	    System.out.println("********************************************");
		String[] arr = {"1. Files in ascending order",
                "2. Sub Menu (Add, Delete, Search)",
                "3. Close Application"};
          
		for(String val:arr) {
			System.out.println(val);
			}

		System.out.println("\nEnter your choice:");
		int choice = input.nextInt();
		
		switch(choice) {
		case 1:
			fileInAscendingOrder();
			mainMenu();
			break;
		case 2:
			subMenu();
			break;
		case 3:
			closeApp();
			break;
		}
		
	}
	
	public static void fileInAscendingOrder() {
		
		
		File newfolder = new File(currentDirectory);
		String []fileNames = new String[50];
		fileNames = newfolder.list();
		
		int size = fileNames.length;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if((fileNames[i].compareTo(fileNames[j]))>0){
					String temp = fileNames[i];
					fileNames[i] = fileNames[j];
					fileNames[j] = temp;
				}
			}
		}
		for(String name:fileNames) {
			System.out.println("File : "+name);
		}
		System.out.println();
		
	}
	
	public static void subMenu() {
		
		System.out.println("\n********************************************");
        System.out.println("\t        Sub Menu");
        System.out.println("********************************************");
		
		String[] arr1 = {"1. Add file in existing directory",
                "2. Delete file from existing directory",
                "3. Search file",
                "4. Return to Main Menu"};
          
		for(String val:arr1) {
			System.out.println(val);
			}

		System.out.println("\nEnter your choice:");
		int choice2 = input.nextInt();
		
		switch(choice2) {
		case 1:
			addFile();
			subMenu();
			break;
		case 2:
			deleteFile();
			subMenu();
			break;
		case 3:
			searchFile();
			subMenu();
			break;
		case 4:
			mainMenu();
			break;
		
		}
			
	}
	
	public static void addFile() {
		System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("    |File name are case sensitive, make sure you enter correctly|   ");
		System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("Enter file name:");
		String strFileNames = input.next();
		File theFile = new File(currentDirectory, strFileNames);
		if(theFile.isFile()) {
		    System.out.println("---File with same name already exist, try with another name---\n");
		   }
		else {
		      try {
			theFile.createNewFile();
			System.out.println("file is created successfully\n");
		}catch (IOException e) {
			System.out.println(e.getMessage());
			}
		}

	}
	
	public static void deleteFile() {
		
		System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("    |File name are case sensitive, make sure you enter correctly|   ");
		System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("Enter file name:");
		String strFileNames1 = input.next();
		File theFile = new File(currentDirectory, strFileNames1);
		if(theFile.isFile()) {
		    theFile.delete();
		    System.out.println("file is deleted successfully");
		   }
		else {
		    System.out.println("------Delete operation not possible, file does not exist------");
		      }	
		}
		

	
	public static void searchFile() {
		
		System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("    |File name are case sensitive, make sure you enter correctly|   ");
		System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("Enter file name:");
		String strFileNames2 = input.next();
		File newFolder = new File(currentDirectory);
		String []fileNames = new String[50];
		fileNames = newFolder.list();
		boolean flag=false;
		for(String val:fileNames) {
		      if(val.equals(strFileNames2)) {
			flag=true;
			break;
		       }
		}
		if(flag) {
			System.out.println("file is found: "+strFileNames2);
			}
		else {
			System.out.println("file is not found: "+strFileNames2);
			}
		

	}
	public static void closeApp() {
		System.out.println("\tClosing Application... \n\t     Thank you!");
	}
	
}
