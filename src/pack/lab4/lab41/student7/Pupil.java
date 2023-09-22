package pack.lab4.lab41.student7;

class Pupil {
    private String name;
    private int age;

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Study() {
        System.out.println(name + " учится.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class SchoolChild extends Pupil {
    private int course;

    public SchoolChild(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    public void Study() {
        System.out.println(getName() + " учится в " + course + " классе.");
    }
}

class Student extends Pupil {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public void Study() {
        System.out.println(getName() + " учится в университете " + university + ".");
    }
}
