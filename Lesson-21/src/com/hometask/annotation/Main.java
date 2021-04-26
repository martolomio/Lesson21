package com.hometask.annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		getAnnotation(Book.class);
		
		System.out.println();
		date();
		
		System.out.println();
		time();
		
		System.out.println();
		timeDate();
	}
	
	public static void getAnnotation(Class<?> myClass) {
		
		Field[] fields = myClass.getDeclaredFields();
		for(int i =0; i< fields.length; i++) {
			Field field = fields[i];
			
			if(field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation ) {
				System.out.println(field.getName()+" ---- ");
				System.out.println("value = "+ field.getAnnotation(MyAnnotation.class).params());
			}
		}
	}

	public static void date() {
		LocalDate lt = LocalDate.now();
		System.out.println("Date ->"+lt);
	}
	
	public static void time() {
		LocalTime tm = LocalTime.now();
		System.out.println("Date ->"+tm);
	}
	
	public static void timeDate() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Date ->"+dt);
	}
}
