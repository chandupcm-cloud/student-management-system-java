package project;


	import java.util.ArrayList;

	public class StudentService {

	    private ArrayList<Student> studentList = new ArrayList<>();

	    // Add Student
	    public void addStudent(Student student) {
	        studentList.add(student);
	        System.out.println("Student added successfully!");
	    }

	    // View All Students
	    public void viewStudents() {
	        if (studentList.isEmpty()) {
	            System.out.println("No students available.");
	        } else {
	            for (Student s : studentList) {
	                s.display();
	            }
	        }
	    }

	    // Search Student
	    public Student searchStudent(int id) {
	        for (Student s : studentList) {
	            if (s.getId() == id) {
	                return s;
	            }
	        }
	        return null;
	    }

	    // Delete Student
	    public boolean deleteStudent(int id) {
	        Student student = searchStudent(id);
	        if (student != null) {
	            studentList.remove(student);
	            return true;
	        }
	        return false;
	    }
	

}
