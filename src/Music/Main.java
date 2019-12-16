package Music;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Datasource datasource = new Datasource();
		if(!datasource.open()) {
			System.out.println("Can't open datasource");
			return;
		}
		
		List<Artist> artists=datasource.queryArtists();
		if(artists == null) {
			System.out.println("No artist");
			return;
		}
		
		for(Artist artist: artists) {
			System.out.println("ID = "+artist.getId()+", Name = "+artist.getName());
		}
		
		
		/*
		 * System.out.println(
		 * "============================================================");
		 * 
		 * List<Album> albums=datasource.queryAlbums(); if(albums == null) {
		 * System.out.println("No album"); return; }
		 * 
		 * for(Album album: albums) {
		 * System.out.println("ID = "+album.getId()+", Name = "+album.getName()
		 * +", ArtistId = "+album.getArtistId()); }
		 * 
		 * System.out.println(
		 * "============================================================");
		 * 
		 * List<Song> songs=datasource.querySongs(); if(songs == null) {
		 * System.out.println("No song"); return; }
		 * 
		 * for(Song song: songs) {
		 * System.out.println("ID = "+song.getId()+", Track = "+song.getTrack()
		 * +", Name = "+song.getName()+", AlbumId = "+song.getAlbumId()); }
		 */
		 		
		datasource.close();

	}

}
