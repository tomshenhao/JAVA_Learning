package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {	

	public static void main(String[] args) {
		
		Album album=new Album("Stormbringer", "Deep Purple");
		album.addSong("first", 4.6);
		album.addSong("second", 4.22);
		album.addSong("third", 4.23);		
		album.addSong("four", 4.6);
		album.addSong("five", 4.22);
		album.addSong("six", 4.23);		
		album.addSong("seven", 4.6);
		album.addSong("eight", 4.22);
		album.addSong("nine", 4.23);		
		
		LinkedList<Song> playList= new LinkedList<Song>();
		album.addToPlayList("first", playList);
		album.addToPlayList("second",playList);
		album.addToPlayList("third", playList);
		album.addToPlayList("four",playList);		
		album.addToPlayList("five", playList);
		album.addToPlayList("six",playList);
		album.addToPlayList("seven",playList);		
		album.addToPlayList("eight", playList);
		album.addToPlayList("nine",playList);		
		
		play(playList);		
	}

	private static void play(LinkedList<Song> playList) {
		
		Scanner scanner=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() ==0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("PlayList Complete");
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward=true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing "+listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward=false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward=false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing "+listIterator.previous().toString());
				} else {
					System.out.println("We are at the start of the playlist");
					forward=true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing "+listIterator.previous().toString());
					} else {
						System.out.println("We are at the start of the list");
					}  
				} else {
					if(listIterator.hasNext()) {
						System.out.println("Now playing "+listIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;				
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing"+ listIterator.next());
					} else if(listIterator.hasPrevious()){
						System.out.println("Now playing"+listIterator.previous());
					}
				}
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available action:\n press");
		System.out.println("0 - to quit\n" +
				"1 - to play next song\n" +
				"2 - to play previous song\n" +
				"3 - to reply the current song\n" +
				"4 - list songs in the playlist\n" +
				"5 - print available actions\n" +
				"6 - delete current song from playlist");
	}	
	
	private static void printList(LinkedList<Song> playlist) {
		Iterator<Song> iterator=playlist.iterator();
		System.out.println("============================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("============================");
	}
	
	
}
