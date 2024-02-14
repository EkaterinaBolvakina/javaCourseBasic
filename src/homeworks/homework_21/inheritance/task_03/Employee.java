/*
        Создайте класс `Employee`, содержащий общую информацию о сотрудниках компании.
        От него наследуйте классы `Manager` и `Developer`.
        В классе `Manager` добавьте список подчиненных - массив сотрудников (экземпляры класса Employee),
        а в классе `Developer` - список проектов, над которыми работает разработчик - массив String[].
        */
package homeworks.homework_21.inheritance.task_03;

import java.util.Date;

public abstract class Employee {
    private String surname;
    private String name;
    private String department;

    public Employee(String surname, String name, String department) {
        this.surname = surname;
        this.name = name;
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
