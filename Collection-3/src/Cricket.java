
public class Cricket {
	private String name;
	private int id;
	private String lastName;
	private String skill;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setSkill(String skill) {
		this.skill=skill;
	}
	public String getSkill() {
		return skill;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public Cricket(String name, int id, String lastName, String skill, int age) {
		this.name=name;
		this.id=id;
		this.lastName=lastName;
		this.skill=skill;
		this.age=age;
	}
	
	public String toString() {
		return "Name:"+name+",Id:"+id+",LastName:"+lastName+",Skill:"+skill+",Age:"+age;
	}

}
