package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist= artist;
		this.songs = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Song> getSongList() {
		return songs;
	}
	
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}else {
			return false;
		}
	}
	
	private Song findSong(String title) {
		for(Song checkedSong: this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong!=null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song "+title+"song not found in album");
		return false;
	}
}
