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
		return "��Ա���: "+this.ID+"  ����: "+this.name+"  �Ա�: "+this.sex;
	}
}
