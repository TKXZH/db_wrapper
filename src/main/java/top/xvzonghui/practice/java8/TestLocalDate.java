package top.xvzonghui.practice.java8;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zonghuixu
 */

@Slf4j
public class TestLocalDate {
	public static void main(String[] args) {
		//new instance
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		localDate = LocalDate.of(2018, 12, 21);
		System.out.println(localDate);

		//format to String
		System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(localDate.format(DateTimeFormatter.ISO_WEEK_DATE));

		//parse to Object
		LocalDate localDate1 = LocalDate.parse("20181221", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(localDate1);

		//get some info
		System.out.println(localDate.isAfter(localDate1));

		//change some value
		System.out.println(localDate.withMonth(2));

		//add some time
		System.out.println(localDate.plusWeeks(34));

		//combine with other time object
		System.out.println(localDate.atTime(LocalTime.of(12, 23, 34)));
	}
}
