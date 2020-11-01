package xuanke;

public class Course {
	public String ID;
	public String name;
	public String posion;
	public String time;
	public String classname;
	public Course(String ID,String name,String posion,String time,String classname)
	{
		this.ID = ID;
		this.name = name;
		this.posion = posion;
		this.time =  time;
		this.classname = classname;
	}
	public String toString() {
		return "课程编号: "+this.ID+"  课程名称: "+this.name+"  上课地点: "+this.posion+"  上课时间:"
	+this.time+"  授课教师:"+this.classname;
	}
}
