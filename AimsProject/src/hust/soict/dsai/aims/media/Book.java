package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

//import javax.management.loading.PrivateClassLoader;

public class Book extends Media {

		// TODO Auto-generated constructor stub
		/*private int id ; 
	    private String title;
	    private String  category;
	    private float cost;*/ // kế thừa từ Media
	    private List<String> authors = new ArrayList<String>();
	    
	    public Book(int id, String title, String category, float cost,List<String> authors ) {
	    	super(id, title, category, cost); // Invoke the constructor of the Media class
	        this.authors = authors;
	    }
	    public Book(int id, String title, String category,float cost) {
	    	super();
	    }
	    public Book(int id, String title,float cost) {
	    	super();
	    }
	    public Book(int id, String title, List<String> authors) {
	    	super();
	    	this.authors = authors;
	    }

		public List<String> getAuthors() {
			return authors;
		}

		public void setAuthors(List<String> authors) {
			this.authors = authors;
		}
		public void addAuthors(String authorName) {
			if(!authors.contains(authorName)) {
				authors.add(authorName);
				System.out.println("Author added " + authorName);
			}
			else {
				System.out.println("Author already exist: "+ authorName);
			}
		}
		public void removeAuthors(String authorName) {
			if(!authors.contains(authorName)) {
				authors.remove(authorName);
				System.out.println("Author removed: " + authorName);
			}
			else {
				System.out.println("Author not exist in list:" + authorName);
			}
		}
	

}
