package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

/**
 * @author Chhin_Hua - 15/02
 **/

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private String favoriteLanguage;
    private LinkedHashMap<String, String> operatingSystemOptions;
    private String[] operatingSystems;

    public void setCountry(String country) {
        this.country = country;
    }

    public Student() {

        // popular country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("GE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("USA", "United States of America");

        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public LinkedHashMap<String, String> getOperatingSystemOptions() {
        return operatingSystemOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
