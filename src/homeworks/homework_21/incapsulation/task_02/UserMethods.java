package homeworks.homework_21.incapsulation.task_02;

import homeworks.homework_08.ScannerUserInput;

public class UserMethods {

    public String inputPasswordFromUser() {
        ScannerUserInput ui = new ScannerUserInput();
        String password = ui.inputText("Please enter a password ( min.6 sings incl. Capital letter and special sings) : ");
   return password;
    }
        public boolean checkPasswordFromUser(String firstPassword){
                if ((firstPassword.length()>=6)
                        && !firstPassword.equals(firstPassword.toLowerCase()) //contains Uppercase
                        && !firstPassword.equals(firstPassword.toUpperCase())  //contains Lowercase
                        && firstPassword.matches(".*\\d.*")           //contains Digit
                        && !firstPassword.matches("[A-Za-z0-9]*")) {  //contains Special Character

                    return true;
                }
                System.out.println("The new password does not meet the security requirements");
                     return  false;
        }
    boolean checkOldPasswordFromUser(String oldRepeatPassword, String oldPassword) {
        if (oldRepeatPassword.equals(oldPassword)) {  // if password = old
            return true;
        } else {
            System.out.println("The old password was entered incorrectly");

        }return false;
    }

    public String addPassword(String password, Boolean check){
        User user = new User();
        if (check==true){
            user.setPassword(password);
            System.out.println("You created a new password ");
            //System.out.println(user.getPassword());
            return user.getPassword();
        }else {
            System.out.println("Your new password is not created");
            //System.out.println(user.getPassword());
        }return user.getPassword();
    }

}
