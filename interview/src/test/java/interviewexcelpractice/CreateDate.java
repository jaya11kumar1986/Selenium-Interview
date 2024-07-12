package interviewexcelpractice;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CreateDate {

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(date1);
		
		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String format = dateTime.format(formater);
		
		System.out.println(format);
		
		LocalDate birthDate=LocalDate.parse("1987-04-11");
		
		LocalDate currentDate=LocalDate.now();
		
		Period between = Period.between(birthDate, currentDate);
		
		System.out.println(between.getYears());
		

	}

}
