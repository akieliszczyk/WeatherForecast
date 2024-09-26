package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LoginData {
    VALID_USER_DATA(true,"kurszewska.anna@gmail.com", "P@ss1234"),
    INVALID_USER_DATA(false,"kKurszewskaA.anna@gmail.com", "P@ss1234123"),
    SPECIAL_CHARACTERS(false,"%$*()(*)W!~", "}{:?><");

    @Getter
    private final boolean flag;
    @Getter
    private final String username;
    @Getter
    private final String password;
}
