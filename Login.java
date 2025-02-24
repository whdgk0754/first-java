
public class Login {

    public boolean LoginFunction(String id, String pw, User user){
    

        if (id.equals(user.getId())  && pw.equals(user.getPw()))
        {
            System.out.println("Login was successfully.");
            return true;
        }
        else 
        System.out.println("Your ID or Password is incorret. Please try again. ");
        return false;
    }
    
}

