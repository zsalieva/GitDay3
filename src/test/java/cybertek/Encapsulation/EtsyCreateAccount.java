package cybertek.Encapsulation;

public class EtsyCreateAccount {
   private String email ;
   private String password;
   private String firstname;

   public String getEmail(){
       return email;
   }
   public void setEmail(String newEmail){
       email=newEmail;
   }
   //----------------------------------------

   public String getFirstname(){
       return firstname;
   }
   public void setFirstname(String newFirstname){
       firstname=newFirstname;
   }
   //-----------------------------------------

    public String getPassword(){
       return password;
    }
    public void setPassword(String newPasword){
       password=newPasword;
    }

}
