package com.example.vaccine_passport;

public class Age {
    // Private
    private int age = 0;
    // Public
    public Age(int _age) {
        age = _age;
    }

    public void setAge(int _age) { age = _age; };
    public int getAge() { return age; };
    public String getFormatedAgeRus() {
        return age + "лет";
    };
}
