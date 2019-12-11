package cybertek.Encapsulation;

public class EtsyCreateAccount {
   private String email ;
   private String password;
   private String firstname;

   public String getEmail(){

       return email;
   }
   //----------------------------------------

   public String getFirstname(){

       return firstname;
   }
   //-----------------------------------------

    public String getPassword(){   //this. -> let us verify diference between instanse varible and
       //local variable or parameter

       return password;
    }
    public String getInfo(){
       return email+"|"+firstname+" | " +password ;
    }

    // We want to create SET method in one shot for all variable in one method
    public void setInfo(String password,String firstname,String email){


        this.firstname=firstname;

        setPassword(password);
        setEmail(email);
    }
    public void setPassword(String password){ //since it has additional conditions we keep it separate

       if(password.length()<6){
            System.out.println("Pasword Must be 6 characters");
            return; // will get out the condition
        }
        this.password=password;
    }
    public void setEmail(String email){
        this.email=email;
    }

}
