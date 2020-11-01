package xuanke;

public class People {
	public String ID;
	public String name;
	public String sex;
	public People(String ID,String name,String sex)
	{
		this.ID = ID;
		this.name = name;
		this.sex = sex;
	}
	public String toString() {
		return "人员编号: "+this.ID+"  姓名: "+this.name+"  性别: "+this.sex;
	}
}
