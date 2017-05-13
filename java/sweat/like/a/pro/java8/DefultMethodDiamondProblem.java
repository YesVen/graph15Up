package sweat.like.a.pro.java8;

public class DefultMethodDiamondProblem {
	public static void main(String[] args) {
		MTechStudent ashu = new MTechStudent();
		ashu.gotoSchool();
		
		Headmaster anna = new Headmaster();
		anna.gotoSchool();
	}
}


interface Student
{
	default public void gotoSchool()
	{
		System.out.println("Attend Classrom and study");
	}
}

interface Teacher
{
	default public void gotoSchool()
	{
		System.out.println("Attend classrom and teach to student");
	}
}

class MTechStudent implements Student,Teacher
{
	@Override
	public void gotoSchool() {
		Student.super.gotoSchool();
	}
}


class Headmaster implements Student,Teacher
{

	@Override
	public void gotoSchool() {
		Teacher.super.gotoSchool();
	}
	
}