// Student Profile Class

public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double averageScore;
    int expectedYeartoGraduate;

    // constructor 
    public StudentProfile(String firstName, String lastName, String declaredMajor, double averageScore, int expectedYeartoGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.averageScore = averageScore;
        this.expectedYeartoGraduate = expectedYeartoGraduate;

        }
    public void incrementExpectedGraduationYear(){
        this.expectedYeartoGraduate = this.expectedYeartoGraduate + 1;

    }

}
