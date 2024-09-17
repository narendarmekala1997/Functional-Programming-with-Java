package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		List<String> courses2 = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		
		//joining the string with ,
		System.out.println(courses.stream().collect(Collectors.joining(",")));
		
		//splitting all characters to list for all strings 
		
		System.out.println( courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
	
		System.out.println(
			
				courses.stream()
					.flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2)))
					.collect(Collectors.toList())
				
		);
//		//[[Spring, Spring], [Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], 
//		[Spring, PCF], [Spring, Azure], [Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring],
//		[Spring Boot, Spring Boot], [Spring Boot, API], [Spring Boot, Microservices], [Spring Boot, AWS], 
//		[Spring Boot, PCF], [Spring Boot, Azure], [Spring Boot, Docker], [Spring Boot, Kubernetes], [API, Spring],
//		[API, Spring Boot], [API, API], [API, Microservices], [API, AWS], [API, PCF], [API, Azure], [API, Docker], 
//		[API, Kubernetes], [Microservices, Spring], [Microservices, Spring Boot], [Microservices, API], [Microservices, Microservices]
//				, [Microservices, AWS], [Microservices, PCF], [Microservices, Azure], [Microservices, Docker], 
//				[Microservices, Kubernetes], [AWS, Spring], [AWS, Spring Boot], [AWS, API], [AWS, Microservices], [AWS, AWS],
//				[AWS, PCF], [AWS, Azure], [AWS, Docker], [AWS, Kubernetes], [PCF, Spring], [PCF, Spring Boot], [PCF, API], 
//				[PCF, Microservices], [PCF, AWS], [PCF, PCF], [PCF, Azure], [PCF, Docker], [PCF, Kubernetes], [Azure, Spring], 
//				[Azure, Spring Boot], [Azure, API], [Azure, Microservices], [Azure, AWS], [Azure, PCF], [Azure, Azure], 
//				[Azure, Docker], [Azure, Kubernetes], [Docker, Spring], [Docker, Spring Boot], [Docker, API], [Docker, Microservices],
//				[Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Docker], [Docker, Kubernetes], [Kubernetes, Spring],
//				[Kubernetes, Spring Boot], [Kubernetes, API], [Kubernetes, Microservices], [Kubernetes, AWS], [Kubernetes, PCF],
//				[Kubernetes, Azure], [Kubernetes, Docker], [Kubernetes, Kubernetes]]

		
		System.out.println(
				
				courses.stream()
					.flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course.length()).map(course2 -> List.of(course,course2)))
					.filter(list -> !list.get(0).equals(list.get(1)))
					.collect(Collectors.toList())
				
		);
//		[Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS], [Docker, Spring]]
	}

}
