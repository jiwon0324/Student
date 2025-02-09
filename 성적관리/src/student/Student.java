package student;

public class Student {
	private int stuNO;
	private String name;
	private String stuId;
	private double avg;
	private static int hackbun=1001;
	public Student(String name,String stuId) {
		super();
		this.name=name;
		this.stuNO=hackbun;
		this.stuId=stuId;
		hackbun+=1;
	}
	
	public int getStuNO() {
		return stuNO;
	}
	public void setStuNO(int stuNO) {
		this.stuNO = stuNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
