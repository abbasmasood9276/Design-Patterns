package Iterator;

/**
 *
 * @author aabik
 */
public class IteratorPatternDemo {

   public static void main(String[] args) {
      StudentRepository studentRepository = new StudentRepository();

      // Iterate through students and print their names which start with "Muhammad"
      studentRepository.printStudentsWithNameStartingFrom("Muhammad");

      // Print all students
      studentRepository.printAllStudents();
   }
}
