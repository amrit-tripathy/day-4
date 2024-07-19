package com.Graymatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DemoOnDateTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "deprecation", "deprecation" })
		Date date = new Date("7/3/24");
		System.out.println(date);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy",Locale.US);
//		String myDate = "17-09-2024";
//		Date datee = sdf.parse(myDate);
//		System.out.println(date);
		
		LocalDate local = LocalDate.now();
		System.out.println(local);
		
		
		System.out.println(local);
		
		LocalDate parsedDate = LocalDate.parse("2023-07-16");
		System.out.println("Parsed Date: " + parsedDate);
		
		
		
		//first create date in local format
		LocalDate currentDate = LocalDate.of(2006, 7, 21);
        
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //MMM==JUL
        
        // Format the current date
        String formattedDate = currentDate.format(formatter);
        //print
        System.out.println("Formatted Date: " + formattedDate);
        
        
        LocalTime t = LocalTime.now();
        System.out.println(t);
        
        System.out.println(date.getDay());
       
        String myJoining ="2022-03-22";
        LocalDate doj = LocalDate.parse(myJoining);
        String myleaving ="2024-03-20";
        LocalDate dol = LocalDate.parse(myleaving);
        Period p = Period.between(doj, dol);
        System.out.println(p);
        
        System.out.println("total period of time worked "+p.getYears()+" years "
        +p.getMonths()+" months "+p.getDays()+" days ");
        

		
		
		

	}

}
