package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public String toString() {
		return name +":" + noOfStudents + ":" + reviewScore;
				
	}
}

public class CustomClass {

	public static void main(String[] args) {
		List<Course> courses = 
		List.of(
				new Course("Spring","Framework",98,20000),
				new Course("Spring Boot","Framework",95,18000),
				new Course("API","Microservices",97,22000),
				new Course("Microservices","Microservices",96,25000),
				new Course("FullStack","Framework",91,14000),
				new Course("AWS","cloud",92,21000),
				new Course("Azure","cloud",99,21000),
				new Course("Docker","cloud",92,20000),
				new Course("Kubernetes","cloud",91,20000)
				);
		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		//All Match
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate ));
		//none Match
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate ));
		//Any Match
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate ));
		
		Comparator comparingByNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsIncreasing)
				.collect(Collectors.toList()));
		
		Comparator comparingByNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsDecreasing)
				.collect(Collectors.toList()));
		
		Comparator comparingByNoOfStudentsAndNoOfReviews 
													= Comparator.comparing(Course::getNoOfStudents)
																.thenComparing(Course::getReviewScore)
																.reversed();
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviews)
				.collect(Collectors.toList()));

	}

}
