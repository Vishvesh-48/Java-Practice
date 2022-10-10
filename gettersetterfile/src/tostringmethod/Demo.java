package tostringmethod;

public class Demo {

	private int id;
	private String name;
	private String date;

	public void setId(int i) {

		this.id = i;
	}

	public int getId() {

		return id;
	}

	public void setName(String s) {

		this.name = s;
	}

	public String getName() {

		return name;
	}

	public void setDate(String a) {

		this.date = a;
	}

	public String getDate() {

		return date;
	}
	
	@Override
	public String toString() {
	
		return id+"  "+name ;
	}

}
