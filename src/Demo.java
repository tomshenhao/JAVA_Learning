import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit,"Wellington");
		addInOrder(placesToVisit,"ch");
		addInOrder(placesToVisit,"Auckland");
		printList(placesToVisit);
		
		visit(placesToVisit);
		
	}
	
	private static void printList(LinkedList<String>  linkdedlist) {
		Iterator<String> i = linkdedlist.iterator();
		while(i.hasNext()) {
			System.out.println("Now visting "+i.next());
		}
		System.out.println("============================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList,String newCity) {
		ListIterator<String> stringListIterator=linkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison=stringListIterator.next().compareTo(newCity);
			if(comparison==0) {
				System.out.println(newCity+" is alreay included");
				return false;
			} else if(comparison>0) {
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison<0) {
				continue;
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit=false;
		boolean goingForward = true;
		
		ListIterator<String> listItrator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
			return;
		} else {
			System.out.println("Now visiting"+ listItrator.next());
			printMenu();
		}
		
		while(quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0:
				System.out.println("Holiday (vacation) Over");
				quit=true;
				break;
			case 1:
				if(!goingForward) {
					if(listItrator.hasNext()) {
						listItrator.next();
					}
					goingForward=true;
				}
				if(listItrator.hasNext()) {
					System.out.println("Now visting "+listItrator.next());
				} else {
					System.out.println("Reached the end of the list");
					goingForward=false;
				}
				break;
			case 2:
				if(goingForward) {
					if(listItrator.hasPrevious()) {
						listItrator.previous();
					}
					goingForward=false;
				}
				if(listItrator.hasPrevious()) {
					System.out.println("Now visiting "+listItrator.previous());
				} else {
					System.out.println("We are at the start of the list");
					goingForward=true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available action:\npress:");
		System.out.println("0 - to quie\n"  +
				"1 - go to the next city\n" + 
				"2 - go to the previous city\n" +
				"3 - print the menu");
	}
}
