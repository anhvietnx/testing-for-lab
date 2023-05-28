package hust.soict.dsai.aims.media;

public class Media {

	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this. title = title;
		this.category = category;
		this.cost = cost;
		// TODO Auto-generated constructor stub
	}
	public Media() {
        // Constructor không tham số của lớp Media
        // Khởi tạo giá trị mặc định cho các thuộc tính
        this.id = 0;
        this.title = "";
        this.category = "";
        this.cost = 0.0f;
    }
	
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	public Media(String title, String category, float cost) {
		this(title,category);
		this.cost = cost;
	}
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	

}
