package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	//private int id;  // Instance attribute
	//private String title;
	//private String category;
	private String director;
	private int length;
	//private float cost;
	
	private static int nbDigitalVideoDiscs = 0; // Class attribute
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length < 0) {
			this.length = 0;
		}
		else {
			this.length = length;
		}
	}
	public DigitalVideoDisc() {
		super();
		this.id = nbDigitalVideoDiscs++;
	    
	}

	
	public DigitalVideoDisc(String title) {
		super(title);
		this.id = nbDigitalVideoDiscs++;
		
	}
	
	public DigitalVideoDisc(String title, String category) {
		super();	
		this(title);
		this.category = category;
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	

	public DigitalVideoDisc(String title, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
	    return String.format("%2d.DVD - %-20s - %-15s - %-15s - %-6d : %.2f $%n", id, title, category, director, length, cost);
	}

	
	public boolean isMatch(String title) {
		if (this.getTitle().equals(title)) {	
		return true;
		}
		else return false;
	}
	public void show() {
		System.out.println("id: "+id);
		System.out.println("Title: "+title);
		System.out.println("Category: "+category);
		System.out.println("Director: "+director);
		System.out.println("Length: "+length);
		System.out.println("Cost "+ cost);
	}
	
	//28/05/24
	//Implement play() for DigitalVideoDisc and Track
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	
	
	

}
