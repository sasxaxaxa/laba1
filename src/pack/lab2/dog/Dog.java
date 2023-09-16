package pack.lab2.dog;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int toHumanAge() {
        return age * 7;
    }

    public String toString(Dog dog) {
        return "Собака по кличке " + dog.getName() + ", возраст: "
                + dog.getAge() + ", возраст в человеческих годах: " + dog.toHumanAge();
    }
}

