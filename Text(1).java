package xuanke;

public class Text {
	public static void main(String args[]){
		//import choose.people;
		//import choose.teacher;
		//import choose.student;
		//import choose.course;
		Student stu1 = new Student("2019123456","张三","男","JAVA");
		Teacher tea1 = new Teacher("101","孙老师","男","高数");
		Course cou1 = new Course("1","大物","101","第1-2节","赵老师");
		People peo1 = new People("2019987654","李四","男");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}
