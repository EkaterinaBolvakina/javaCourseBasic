package homeworks.homework_21.incapsulation.task_02;

import homeworks.homework_08.ScannerUserInput;

public class UserMethods {

    public String inputPasswordFromUser() {
        ScannerUserInput ui = new ScannerUserInput();
        String password = ui.inputText("Please enter a password ( min.6 sings incl. Capital letter and special sings : ");
   return password;
    }
        public Boolean checkFirstPasswordFromUser(String firstPassword){
                if ((firstPassword.length()>=6)
                        && !firstPassword.equals(firstPassword.toLowerCase()) //contains Uppercase
                        && !firstPassword.equals(firstPassword.toUpperCase())  //contains Lowercase
                        && firstPassword.matches(".*\\d.*")           //contains Digit
                        && !firstPassword.matches("[A-Za-z0-9]*")) {  //contains Special Character

                    return true;
                }
                     return  false;
        }
    public Boolean checkOldNewPasswordFromUser(String oldPassword, String newPassword) {
        User user = new User();
        if (oldPassword.equals(user.getPassword())) {  // if password = old
            if ((newPassword.length() >= 6)
                    && !newPassword.equals(newPassword.toLowerCase()) //contains Uppercase
                    && !newPassword.equals(newPassword.toUpperCase())  //contains Lowercase
                    && newPassword.matches(".*\\d.*")           //contains Digit
                    && !newPassword.matches("[A-Za-z0-9]*")) {  //contains Special Character

                return true;
            } else {
                System.out.println("The new password does not meet the security requirements");
                return false;
            }
        } else {
            System.out.println("The old password was entered incorrectly");
            return false;
        }
    }


        public void addFirstPassword(String password){
            User user = new User();
        if (checkFirstPasswordFromUser(password)==true){
            user.setPassword(password);
            System.out.println("You created a new password");
        }else {
            System.out.println("Your new password is not correct");

        }
        }
    public void addNextPassword(String oldPassword, String newPassword){
        User user = new User();
        if (checkOldNewPasswordFromUser(oldPassword,newPassword)==true){
            user.setPassword(newPassword);
            System.out.println("You created a new password"+user.getPassword());
        }else {
            System.out.println("Your new password is not correct");
        }
    }
}
