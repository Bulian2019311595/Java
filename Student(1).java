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
		return "ѧ�����: "+this.ID+"  ����: "+this.name+"  �Ա�: "+this.sex+"  ��ѡ�γ�:"+this.classname;
	}
}
