package objetos.parcial3.examen;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class TravelAgency {

    private List<UserAccount> accountsList = new LinkedList<>();

    private int accountCount;



    public String addUserAccount(UserAccount userAccount) {


        if ((userAccount.getEmail() == null || (userAccount.getEmail() == ""))) {
            throw new EmailRequiredException("Null string not allowed for email");
        }if ((userAccount.getPhoneNumber() == null || (userAccount.getPhoneNumber() == ""))){
            throw new PhoneNumberRequiredException("Null string not allowed for email");
        }

       accountsList.add(userAccount);

    }

    public void findAccountByEmail(String s) {

    }

    public void findAccountByPhoneNumber(String s) {
    }

    public void findAccount(String s) {
    }

    public UserAccount removeAccount(String id1) {
    }
}
