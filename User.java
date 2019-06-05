package appLayer;

/**
 * Created by Boss on 4/25/2019.
 */
public class User {
    public boolean validateUser(String username, String password){
        if(username.equals("edi") && password.equals("123456")){
            return true;
        }
        return false;
    }
}


