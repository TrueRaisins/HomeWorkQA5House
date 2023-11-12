package House;

public class House {
    private String fullName;
    private int age;

    public House(String fio, int age) {
        this.fullName = fio;
        this.age = age;
    }

    public String getFio() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}