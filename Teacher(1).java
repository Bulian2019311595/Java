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
		return "��ʦ���: "+this.ID+"  ����: "+this.name+"  �Ա�: "+this.sex+"  ���ڿγ�:"+this.classname;
	}
}