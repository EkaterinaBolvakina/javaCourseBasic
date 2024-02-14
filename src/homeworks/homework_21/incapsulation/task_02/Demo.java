/*
#### Задача 2: Управление учетными записями пользователей
Создайте класс `User`, который инкапсулирует данные пользователя: логин, пароль и email.
Обеспечьте безопасное изменение и доступ к этим полям через геттеры и сеттеры.
Пароль должен изменяться только если старый пароль введен верно и
новый пароль соответствует определенным требованиям безопасности.

 */
package homeworks.homework_21.incapsulation.task_02;

public class Demo {
    public static void main(String[] args) {
        UserMethods demo = new UserMethods();
        String firstPassword = demo.inputPasswordFromUser();
        demo.checkFirstPasswordFromUser(firstPassword);
        demo.addFirstPassword(firstPassword);

        // change password:
        System.out.println("Repeat your old password");
        String oldPassword = demo.inputPasswordFromUser();
        System.out.println("Enter your new password");
        String newPassword = demo.inputPasswordFromUser();
        demo.checkOldNewPasswordFromUser(oldPassword,newPassword);
        demo.addNextPassword(oldPassword,newPassword);







    }
}
