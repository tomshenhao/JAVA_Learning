package Music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

	public static final String DB_NAME="music.db";
	public static final String CONNECTION_STRING="jdbc:sqlite:C:\\Work\\Projects\\database\\"+DB_NAME;
	
	public static final String TABLE_ALUMBS="albums";
	public static final String COLUMN_ALUMBS_ID="_id";
	public static final String COLUMN_ALUMBS_NAME="name";
	public static final String COLUMN_ALUMBS_ARTIEST="artist";
	public static final int INDEX_ALBUMS_ID = 1;
	public static final int INDEX_ALBUMS_NAME = 2;
	public static final int INDEX_ALBUMS_ARTIEST = 3;
	
	public static final String TABLE_ARTISTS="artists";
	public static final String COLUMN_ARTISTS_ID="_id";
	public static final String COLUMN_ARTISTS_NAME="name";
	public static final int INDEX_ARTISTS_ID = 1;
	public static final int INDEX_ARTISTS_NAME = 2;
		
	public static final String TABLE_SONGS="songs";
	public static final String COLUMN_SONGS_ID="_id";
	public static final String COLUMN_SONGS_TRACK="track";
	public static final String COLUMN_SONGS_TITLE="title";
	public static final String COLUMN_SONGS_ALBUM="album";
	public static final int INDEX_SONGS_ID = 1;
	public static final int INDEX_SONGS_TRACK = 2;
	public static final int INDEX_SONGS_TITLE = 3;
	public static final int INDEX_SONGS_ALBUM = 4;
	
	private Connection conn;
	
	public boolean open() {
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING);
		} catch (SQLException e) {
			System.out.println("Couldn't connect to database: "+e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean close() {
		try {
			if(conn!=null) {
				conn.close();
			} 
		}catch(SQLException e) {
				System.out.println("Couldn't close connection: "+e.getMessage());
				return false;
		}
		return true;
	}
	
	public List<Artist> queryArtists(){

		try (Statement statement = conn.createStatement();
			ResultSet results = statement.executeQuery("SELECT * FROM "+TABLE_ARTISTS)){			
						
			List<Artist> artists = new ArrayList<>();
			while(results.next()) {
				Artist artist = new Artist();
				artist.setId(results.getInt(INDEX_ARTISTS_ID));
				artist.setName(results.getString(INDEX_ARTISTS_NAME));
				artists.add(artist);
			}
			
			return artists;
			
		} catch (SQLException e) {
			System.out.println("Qurey failed: "+e.getMessage());
			return null;
		}
	}	
	
	public List<Album> queryAlbums(){

		try (Statement statement = conn.createStatement();
			ResultSet results = statement.executeQuery("SELECT * FROM "+TABLE_ALUMBS)){			
						
			List<Album> albums = new ArrayList<>();
			while(results.next()) {
				Album album = new Album();
				album.setId(results.getInt(INDEX_ALBUMS_ID));
				album.setName(results.getString(INDEX_ALBUMS_NAME));
				album.setArtistID(results.getInt(INDEX_ALBUMS_ARTIEST));
				albums.add(album);
			}
			
			return albums;
			
		} catch (SQLException e) {
			System.out.println("Qurey failed: "+e.getMessage());
			return null;
		}
	}	
	
	public List<Song> querySongs(){

		try (Statement statement = conn.createStatement();
			ResultSet results = statement.executeQuery("SELECT * FROM "+TABLE_SONGS)){			
						
			List<Song> songs = new ArrayList<>();
			while(results.next()) {
				Song song = new Song();
				song.setId(results.getInt(INDEX_SONGS_ID));
				song.setTrack(results.getInt(INDEX_SONGS_TRACK));
				song.setName(results.getString(INDEX_SONGS_TITLE));
				song.setAlbumId(results.getInt(INDEX_SONGS_ALBUM));
				songs.add(song);
			}
			
			return songs;
			
		} catch (SQLException e) {
			System.out.println("Qurey failed: "+e.getMessage());
			return null;
		}
	}	
}

