package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Constant {
    URL("https://openweathermap.org/");

    @Getter
    private final String url;

}
