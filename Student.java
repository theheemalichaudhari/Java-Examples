public class Student

{
	private int rollno;

	private String name;

	private String course;

	private static int count;

	static

	{

		count = -1;

		System.out.println("Static block (replica for Consturctor)");

	}

	public Student(int rollno, String name, String course)

	{

		this.rollno = rollno;

		this.name = name;

		this.course = course;

		count++;

	}

	public int getRollno()

	{

		return rollno;

	}

	public void setRollno(int rollno)

	{

		this.rollno = rollno;

	}

	public String getName()

	{

		return name;

	}

	public void setName(String name)

	{

		this.name = name;

	}

	public String getCourse()

	{

		return course;

	}

	public void setCourse(String course)

	{

		this.course = course;

	}

	public void dispStudent()

	{

		System.out.println("ROLLNO: " + rollno + "\tNAME: " + name + "\tCOURSE: " + course);

	}

	public static void dispCountOfStudents()

	{

		System.out.println("Total Students: " + count);

	}

}