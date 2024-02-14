/*
Создайте класс `Employee`, содержащий общую информацию о сотрудниках компании.
От него наследуйте классы `Manager` и `Developer`.
В классе `Manager` добавьте список подчиненных - массив сотрудников (экземпляры класса Employee),
а в классе `Developer` - список проектов, над которыми работает разработчик - массив String[].
 */
package homeworks.homework_21.inheritance.task_03;

public class DemoList {
    public static void main(String[] args) {
        Subordinates subordinates = new Subordinates();
        Manager manager = new Manager("Csepi","Hajnalka","CEO",subordinates);
        manager.print();

        Projects projects = new Projects();
        Developer developer = new Developer("Otto","Paul","IT",projects);
        developer.print();


    }






}
