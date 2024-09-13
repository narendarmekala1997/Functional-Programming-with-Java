package programming.exercises;

import java.util.List;

public class Exercies {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		//printOddNumbers(numbers);
		//printCourses(courses);
		//printCoursesContainingSpring(courses);
		//printCourseNameWithAtleas4Letters(courses);
		//printCubersOfOddNumbers(numbers);
		printNumbersOfCharactersInCourseName(courses);
	}
	//exercise-1
	public static void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter( number -> number%2!=0 )
			.forEach(System.out::println);
	}
	//exercise-2
	public static void printCourses(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);
	}
	//exercise-3
	public static void printCoursesContainingSpring(List<String> courses) {
		
		courses.stream()
			.filter( s ->  s.contains("Spring"))
			.forEach(System.out::println);
	}
	//exercise-4
	public static void printCourseNameWithAtleas4Letters(List<String> courses) {
		
		courses.stream()
			.filter( s -> s.length()>=4)
			.forEach(System.out::println);
	}
	//exercise-5
	public static void printCubersOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter( number -> number%2!=0 )
			.map(number -> number*number*number)
			.forEach(System.out::println);
	}
	//exercise-6
	public static void printNumbersOfCharactersInCourseName(List<String> courses) {
		courses.stream()
		.map( s -> s.length())
		.forEach(System.out::println);
	}
}
