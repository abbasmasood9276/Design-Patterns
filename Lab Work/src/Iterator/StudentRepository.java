
package Iterator;

/**
 *
 * @author aabik
 */
class StudentRepository implements Container {
   Student[] students = {
         new Student("1", "Muhammad Umar", "Male", "123453437890"),
         new Student("2", "Muhammad Yaseen", "Male", "1234567891"),
         new Student("3", "Kashan", "Male", "1234567892"),
         new Student("4", "Dua", "Female", "1234567893")
   };

   @Override
   public Iterator getIterator() {
      return new StudentIterator();
   }

   private class StudentIterator implements Iterator {
      int index;

      @Override
      public boolean hasNext() {
         if (index < students.length) {
            return true;
         }
         return false;
      }

      @Override
      public Student next() {
         if (this.hasNext()) {
            return students[index++];
         }
         return null;
      }

      @Override
      public boolean hasPrevious() {
         if (index > 0) {
            return true;
         }
         return false;
      }

      @Override
      public Student previous() {
         if (this.hasPrevious()) {
            return students[--index];
         }
         return null;
      }

      @Override
      public void moveToFirst() {
         index = 0;
      }

      @Override
      public void moveToLast() {
         index = students.length - 1;
      }
   }

   public void printStudentsWithNameStartingFrom(String anyStartingValue) {
      Iterator iterator = this.getIterator();
      while (iterator.hasPrevious()) {
         iterator.previous();
      }
      System.out.println("Students with name starting from " + anyStartingValue + ":");
      while (iterator.hasNext()) {
         Student student = iterator.next();
         if (student.name.startsWith(anyStartingValue)) {
            System.out.println(student);
         }
      }
   }

   public void printAllStudents() {
      Iterator iterator = this.getIterator();
      System.out.println("All students:");
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
