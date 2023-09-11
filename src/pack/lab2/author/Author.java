package pack.lab2.author;

public class Author {
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }



    public String toString() {
        return "Author{" + "name = " + name + ", email = " + email +
                ", gender = " + gender + "}";
    }




}
