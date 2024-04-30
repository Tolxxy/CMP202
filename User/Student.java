public class Student extends User{
    String matricNo;
    String admissionNo;
    String checkResult(){
        return "Results are below; "
    }
    String registerCourse(String courseName){
        return "Course registered succesfully, " + courseName
    }
}