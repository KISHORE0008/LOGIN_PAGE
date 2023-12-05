import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo= new HashMap<>();
    IDandPasswords(){
        logininfo.put("kishore","12345");
        logininfo.put("kumar","1234");
        logininfo.put("k","123");
    }
    public HashMap getLogininfo(){
        return logininfo;
    }
}
