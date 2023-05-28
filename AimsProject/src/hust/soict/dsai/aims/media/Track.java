package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private int length;
	private String title;
	
	//Constructor
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	


	public int getLength() {
		return length;
	}


	public String getTitle() {
		return title;
	}
	//Implement play() for DigitalVideoDisc and Track
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}
		

}
