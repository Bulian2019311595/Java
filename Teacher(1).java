package xuanke;

public class Teacher {
	public String ID;	 
	public String name;
	public String sex;
	public String classname;
	public Teacher(String ID,String name,String sex,String classname)
	{
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.classname = classname;
	}
	public String toString() {
		return "教师编号: "+this.ID+"  姓名: "+this.name+"  性别: "+this.sex+"  教授课程:"+this.classname;
	}
}