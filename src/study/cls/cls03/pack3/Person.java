package study.cls.cls03.pack3;

public class Person {

	public String name;
	private String job;
	private int age;
	
	public String getName() { //getter
		return name;
	}
	public void setName(String name) { //setter
		this.name = name;
	}
	public String job() { //getter
		return job;
	}
	public void setJob(String job) { //setter
		this.job = job;
	}
	public int getAge() { //getter
		return age;
	}
	public void setAge(int age) { //setter
		this.age = age;
	}
}
