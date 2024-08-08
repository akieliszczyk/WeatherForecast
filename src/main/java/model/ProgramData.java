package model;

public class ProgramData {

    private String invalidUsername;
    private String invalidPassword;

    public void setInvalidUsername(String username) {
        this.invalidUsername = username;
    }

    public void setInvalidPassword(String password) {
        this.invalidPassword = password;
    }

    public String getInvalidUsername() {
        return invalidUsername;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }
}