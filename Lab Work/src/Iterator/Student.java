package Iterator;

/**
 *
 * @author aabik
 */
class Student {
   String regNo;
   String name;
   String gender;
   String phoneNumber;

   public Student(String regNo, String name, String gender, String phoneNumber) {
      this.regNo = regNo;
      this.name = name;
      this.gender = gender;
      this.phoneNumber = phoneNumber;
   }

   @Override
   public String toString() {
      return "Student{" +
            "regNo='" + regNo + '\'' +
            ", name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
   }
}