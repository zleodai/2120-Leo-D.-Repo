package source;

public class StringHolder {
    private String string;
    private String key;

    public StringHolder(String stringValue, String keyValue) {
        string = stringValue;
        key = keyValue;
    }

    public String getKey() {
        return key;
    }

    public String getString() {
        return string;
    }
}