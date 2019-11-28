package cybertek.interview_Java_Q;

public class Password_Amzn {
    public static void main(String[] args) {
//        Password Validation
//        1. Write a return method that can verify if a password is valid or not.
//
//        requirements:
//
//        1. Password MUST be at least have 6 characters and should not contain space
//
//        2. PassWord should at least contain one upper case letter
//
//        3. PassWord should at least contain one lowercase letter
//
//        4. Password should at least contain one special characters
//
//        5. Password should at least contain a digit
//
//        if all requirements above are met, the method returns true, otherwise returns  false
//        Solution 1:
//
//        Easiest way to solve this task in time sensitive environment is to use Regular Expression (Links to an external site.)
//
//        You may go here (Links to an external site.) and practice patter matching.
        String pswd ="1Lowerer!";
        System.out.println(PasswordValidation(pswd));
    }
    public static boolean PasswordValidation(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase);

        boolean HasUpper = password.matches(uppercase);

        boolean HasDigits = password.matches(numbers);

        boolean HasSpecial = password.matches(specialchars);

        boolean Valid = false;

        if(password.length() >= 6 && !password.contains(" ")) {
            if( HasLower && HasUpper && HasDigits && HasSpecial){
                Valid = true;
            }
        }
        return Valid;

    }

}
