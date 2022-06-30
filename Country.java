

public class Country {
    // Definition of private variables
    private String CountryCode;
    private String name;
    // Constructor Standard
    public Country() {
    }
    // Parametrized Constructor
    public Country(String CountryCode, String name) {
        this.CountryCode = CountryCode;
        this.name = name;
    }
    // Getters and Setters
    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
