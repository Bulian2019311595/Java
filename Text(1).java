package xuanke;

public class Text {
	public static void main(String args[]){
		//import choose.people;
		//import choose.teacher;
		//import choose.student;
		//import choose.course;
		Student stu1 = new Student("2019123456","����","��","JAVA");
		Teacher tea1 = new Teacher("101","����ʦ","��","����");
		Course cou1 = new Course("1","����","101","��1-2��","����ʦ");
		People peo1 = new People("2019987654","����","��");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}
