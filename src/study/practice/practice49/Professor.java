package study.practice.practice49;

public class Professor {

	int profno;
	String name;
	String id;
	String prosition;
	int pay;
	int deptno;
	
	public Professor() {}
	
	public Professor(int profno, String name, String id, String prosition, int pay, int deptno) {
		super();
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.prosition = prosition;
		this.pay = pay;
		this.deptno = deptno;
	}



	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProsition() {
		return prosition;
	}
	public void setProsition(String prosition) {
		this.prosition = prosition;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", prosition=" + prosition + ", pay="
				+ pay + ", deptno=" + deptno + "]";
	}
	
	
	
	
}
