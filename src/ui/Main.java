package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static Scanner sn= new Scanner(System.in);

	public static void main(String[] args) {

		int option=menu();

		switch(option) {
		case 1:
			union();
			break;

		case 2:
			intersection();
			break;
		case 3:
			deleteCharacter();
			break;

		case 4:

			System.out.println("has successfully exited the games");
			System.exit(0);
			break;
		}
	}

	public static int menu() {
		int menu=0;
		System.out.println("                         MAIN  MENU                                                        ");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Enter (1) to perform a union of two sets");
		System.out.println("Enter (2) to perform an intersection of two sets");
		System.out.println("Enter (3) to make a symmetric difference between two sets.");
		System.out.println("Enter (4) for out the program.");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Choose the option of your liking");
		menu=sn.nextInt();
		sn.nextLine();

		return menu;
	}

	public static void union() {

		System.out.println("How many elements has the first set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		String[] set1= new String[cant1];
		Set<String> setA = new HashSet<String>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			set1[i]=sn.nextLine();
		}

		setA.addAll(Arrays.asList(set1));

		System.out.println("How many elements has the second set?");
		int cant2=sn.nextInt();
		sn.nextLine();

		String[] set2= new String[cant2];
		Set<String> setB = new HashSet<String>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant2;i++) {
			set2[i]=sn.nextLine();
		}

		setB.addAll(Arrays.asList(set2));

		Set<String> setUnion = new HashSet<String>(setA);
		setUnion.addAll (setB);

		System.out.println("Union of A and B" );
		System.out.println( setUnion );


	}

	public static void intersection() {
		System.out.println("How many elements has the first set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		String[] set1= new String[cant1];
		Set<String> setA = new HashSet<String>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			set1[i]=sn.nextLine();
		}

		setA.addAll(Arrays.asList(set1));

		System.out.println("How many elements has the second set?");
		int cant2=sn.nextInt();
		sn.nextLine();

		String[] set2= new String[cant2];
		Set<String> setB = new HashSet<String>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant2;i++) {
			set2[i]=sn.nextLine();
		}

		setB.addAll(Arrays.asList(set2));

		Set<String> intersection = new HashSet<String>(setA);
		intersection.retainAll(setB);

		System.out.println("intersection of A and B" );
		System.out.println( intersection );
	}

	public static void deleteCharacter() {
		System.out.println("How many elements has the first set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		String[] set1= new String[cant1];
		Set<String> setA = new HashSet<String>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			set1[i]=sn.nextLine();
		}

		setA.addAll(Arrays.asList(set1));

		System.out.println("How many elements has the second set?");
		int cant2=sn.nextInt();
		sn.nextLine();

		String[] set2= new String[cant2];
		Set<String> setB = new HashSet<String>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant2;i++) {
			set2[i]=sn.nextLine();
		}

		setB.addAll(Arrays.asList(set2));

		Set<String> symmetricalDifference = new HashSet<String>(setA);
		symmetricalDifference.removeAll(setB);

		System.out.println("Symmetrical Difference of A and B" );
		System.out.println( symmetricalDifference );
	}

}
