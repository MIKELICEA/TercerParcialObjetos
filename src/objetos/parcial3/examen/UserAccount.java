package objetos.parcial3.examen;

public class UserAccount {
    private String email;
    private String name;
    private String zipCode;
    private String phoneNumber;

    public UserAccount(String email, String name, String zipCode, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
