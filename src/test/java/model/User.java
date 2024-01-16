package model;

/**
 * @author Erofeevskiy Yuriy on 16.01.2024
 */


public class User {
    private String name;
    private String lastName;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 100)
            throw new IllegalArgumentException("Возраст слишком большой");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
