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
		return "�γ̱��: "+this.ID+"  �γ�����: "+this.name+"  �Ͽεص�: "+this.posion+"  �Ͽ�ʱ��:"
	+this.time+"  �ڿν�ʦ:"+this.classname;
	}
}
