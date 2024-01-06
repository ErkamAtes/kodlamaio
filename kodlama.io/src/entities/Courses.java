package entities;

public class Courses extends Product{
	
	private String educator;
	public Courses(int id, String name,String category, double unitPrice, String educator) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.educator = educator;
	}
	
	public String getEducator() {
		return educator;
	}
	public void setEducator(String educator) {
		this.educator = educator;
	}
	
	
	
	
}
