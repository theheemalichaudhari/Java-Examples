import java.time.LocalDate;

import java.time.LocalTime;

import java.util.Date;
 
public class DateDemo 

{

	public static void main(String[] args) 

	{

//		Date d = new Date();

//		System.out.println(d);

//		System.out.println(d);

		LocalDate ld = LocalDate.now();

		System.out.println(ld);

		System.out.println(ld.plusDays(5));

		LocalTime lt = LocalTime.now();

		System.out.println(lt);

		System.out.println(lt.plusHours(3));

	}

}