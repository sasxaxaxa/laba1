package pack.lab28.examples.ex2;

public class Student {
    private int number;//номер студенческого билета
    private String name;//имя студента
    private int age;//возраст

    @Override //переопределяем метод equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (number != student.number) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return true;
    }

    @Override
    public int hashCode() {//переопределяем метод hashCode
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}