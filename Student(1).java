package xuanke;

public class Student {
	public String ID;
	public String name;
	public String sex;
	public String classname;
	public Student(String ID,String name,String sex,String course)
	{
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.classname = classname;
	}
	public String toString() {
		return "学生编号: "+this.ID+"  姓名: "+this.name+"  性别: "+this.sex+"  所选课程:"+this.classname;
	}
}
