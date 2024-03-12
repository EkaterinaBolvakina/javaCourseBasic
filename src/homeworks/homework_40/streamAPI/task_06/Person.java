package homeworks.homework_40.streamAPI.task_06;

import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private List<String> skills;

    public Person(String name, Integer age, List<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
