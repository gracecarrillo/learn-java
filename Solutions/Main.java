public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Grace", "Carrillo", "Engineering", 85.5, 2022);
        StudentProfile profileTwo = new StudentProfile("Molly", "Huq", "Biomedical Sciences", 100, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYeartoGraduate);
    }

}
