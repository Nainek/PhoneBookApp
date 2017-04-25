package com.training.controller;


public interface GlobalRegexStrings {

    String REGEX_FIRST_NAME = "^[a-zA-Z]{2,20}?";
    String REGEX_PATRONYMIC_NAME = "^[a-zA-Z]{2,20}?";
    String REGEX_LAST_NAME = "^[a-zA-Z]{2,20}?";
    String REGEX_NICKNAME = "^[a-zA-Z][-a-zA-Z0-9_]{1,20}$";
    String REGEX_COMMENT = "^[\\w]{1,200}$";
    String REGEX_PHONE_NUMBER = "^(\\+38)?(\\()?0[0-9]{2}(\\))?[0-9]{3}-?[0-9]{2}-?[0-9]{2}$";
    String REGEX_EMAIL = "^[a-zA-Z0-9][\\w\\.-]{0,25}@[a-zA-Z]{1,10}\\.(com|net|org|ru|ua)$";
    String REGEX_POSTAL_CODE = "^[\\d]{5}$";
    String REGEX_TOWN = "^[A-Z]{1}[a-zA-Z]{1,19}$";
    String REGEX_STREET_ADDRESS = "^[A-Z]{1}[-a-z]{1,20}$";
    String REGEX_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    String REGEX_APARTMENT_NUMBER = "^[\\d]{1,3}";

}
