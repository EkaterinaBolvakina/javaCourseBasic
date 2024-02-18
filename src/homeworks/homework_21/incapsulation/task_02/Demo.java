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

        System.out.println("------------CREATING A NEW PASSWORD-----------");
        String firstPassword = demo.inputPasswordFromUser();
        boolean checkFirstPassword = demo.checkPasswordFromUser(firstPassword);
        String addedFirstPassword = demo.addPassword(firstPassword, checkFirstPassword);

        //only if first password was created correct, then continue with changing password:
        if (addedFirstPassword != null){
        System.out.println();
        System.out.println("------------CHANGING PASSWORD-----------");
        System.out.println("Repeat your old password");
        String oldPassword = demo.inputPasswordFromUser();
        boolean checkOldPassword = demo.checkOldPasswordFromUser(oldPassword, addedFirstPassword);

        if (checkOldPassword==true){
        System.out.println("Enter your new password");
        String newPassword = demo.inputPasswordFromUser();
        boolean checkNewPassword = demo.checkPasswordFromUser(newPassword);
        String addedNewPassword = demo.addPassword(newPassword,checkNewPassword);}}

    }
}
