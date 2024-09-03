public class Course {
    static int maximumCapcity;
    String courseName;
    String enrollStudents;

    boolean isEnrolled=false;

    static {
        maximumCapcity=10;
    }
    Course(String courseName,String enrollStudents){
         this.courseName=courseName;
         this.enrollStudents=enrollStudents;
    }
    public static void setMaxCapcity(int capcity){
        maximumCapcity=capcity;
    }
    public void enrollStudent(){
        if(isEnrolled){
            System.out.println("You Are already enroll this course");
        }
        else{

            System.out.println("Enjoy you are enroll");
            isEnrolled=true;
        }
    }
    public void unEnrollStudent(){
        if(isEnrolled){
            isEnrolled=false;
            System.out.println("You are Unrolled This course");
        }
        else{
            System.out.println("You are already unrolled");
        }
    }

    public static void main(String [] args){
        Course c1 = new Course("java","Deepak singh");
         Course.setMaxCapcity(12);
         c1.enrollStudent();
         c1.enrollStudent();
         c1.unEnrollStudent();
         c1.unEnrollStudent();

    }
}
