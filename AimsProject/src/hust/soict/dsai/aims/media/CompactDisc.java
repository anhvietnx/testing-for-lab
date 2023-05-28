package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;


public class CompactDisc extends Disc implements Playable{
	private int nbDisc = 0;
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title) {
		super(title);
		this.id = nbDisc++;
	}
	public CompactDisc(String title,String category) {
		this(title);
		this.category = category;
	}
	public CompactDisc(String title, String category, String director) {
		this(title,category);
		this.director = director;
	}
	public CompactDisc(String title, String category, String director, float cost) {
		this(title,category,director);
		this.cost = cost;
	}
	public CompactDisc( String title, String category, String director, float cost, int length) {
	    this(title, category,director,cost);
	    this.length = length;
	    
	    // Các logic khác trong constructor của CompactDisc
	}
	
	//methods
	public void addTrack(Track...newTracks) {
		boolean trackAlready = false;
		for(Track newTrack : newTracks) {
			if(tracks.contains(newTrack)) {
				trackAlready = true;
				System.out.println(newTrack.getTitle() + "is already exist");
				continue;
			}
			tracks.add(newTrack);
		}
		if(!trackAlready) {
			System.out.println("All tracks have been added !");
		}
	}
	public void removeTrack(Track track) {
		
		if(!tracks.contains(track)) {
			System.out.println("this track is not in the list");
			return;
		}
		tracks.remove(track);
	}
	public void removeTrack(Track...trackstoRemove) {
		boolean Tracknotfound = false;
		for(Track track : trackstoRemove) {
			if(!tracks.contains(track)) {
				Tracknotfound = true;
				System.out.println("Track :" + track.getTitle() + " is not in the list");
			}
			tracks.remove(track);
		}
		if(!Tracknotfound) {
			System.out.println("All track you want have been removed !");
		}
	}
	
	/*Create the getLength() method
● Because each track in the CD has a length, the length of the CD 
should be the sum of lengths of all its tracks.*/
	public int getLength() {
		int totalLength = 0;
		
		for (int i = 0; i <tracks.size(); i++) {
			totalLength += tracks.get(i).getLength();
		}
		return totalLength;
	}
	public int getLength1() {
		int total = 0;
		for(Track track : tracks) {
			total += track.getLength();			
		}
		return total;
	}
	
	public String getArtist() {
		return artist;
	}
	//28/05/24
	//Implement play() 
	public void play() {
		System.out.println("CD number of tracks :" + tracks.size());
		System.out.println("CD artist: " + this.getArtist());
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		for(Track track : tracks) {
			track.play();
		}
	}

}
	
