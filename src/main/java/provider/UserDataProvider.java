package provider;

import model.ProgramData;

public class UserDataProvider {

    public static ProgramData specialCharactersData() {
        ProgramData programData = new ProgramData();
        programData.setInvalidUsername("!@#$%^&");
        programData.setInvalidPassword(")(*&^%$#");
        return programData;

    }
}
