package pack.lab4.lab41.student7;


public class Tester {
    public static void main(String[] args) {

        Pupil[] array_pupil = new Pupil[5];

        array_pupil[0] = new SchoolChild("Eva", 12, 6);
        array_pupil[1] = new SchoolChild("Alex", 13, 7);

        array_pupil[2] = new Student("Andrew", 19, "MIREA");
        array_pupil[3] = new Student("Kirill", 18, "RTU");
        array_pupil[4] = new Student("Ariana", 20, "MGIMO");

        System.out.println("Школьники:");

        for (Pupil pupil : array_pupil) {
            if (pupil instanceof SchoolChild) {
                pupil.Study();
            }
        }

        System.out.println("Студенты:");

        for (Pupil pupil : array_pupil) {
            if (pupil instanceof Student) {
                pupil.Study();
            }
        }

    }
}