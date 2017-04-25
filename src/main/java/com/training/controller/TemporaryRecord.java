package com.training.controller;

import com.training.model.Model;
import com.training.view.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TemporaryRecord {

    private View view;
    private Model model;
    private Utility utility;

    private String firstName;
    private String lastName;
    private String patronymic;
    private String fullName;
    private String nickname;
    private String comment;

    private String homeTelephoneNumber;
    private String mobileNumberObligatory;
    private String mobileNumberOptional;

    private String email;
    private String skypeNickname;

    private String postalCode;
    private String townName;
    private String streetAddress;
    private String houseNumber;
    private String apartmentNumber;
    private String fullAddress; // Renew

    private String dateOfCreation;
    private String dateOfModification;


    public TemporaryRecord(View view, Model model, Utility utility) {
        this.view = view;
        this.model = model;
        this.utility = utility;
        setDateOfCreation();
    }


    public void getAndSetAllValues() {
        getAndSetFullname();
        getAndSetNickname();
        getAndSetComment();
        getAndSetPhoneNumbers();
        getAndSetEmailAndSkype();
        getAndSetAddress();
        setDateOfModification();
    }

    public void getAndSetFullname() {
        view.inputLastname();
        lastName = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_FIRST_NAME);
        view.inputName();
        firstName = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_LAST_NAME);
        view.inputPatronymic();
        patronymic = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_PATRONYMIC_NAME);
        fullName = getShortName();
    }
    public void getAndSetComment() {
        view.inputComment();
        comment = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_COMMENT);
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder();

        sb.append(lastName)
                .append(StringConstants.SPACE_SYMBOL)
                .append(firstName.charAt(0))
                .append(StringConstants.DOT_SYMBOL)
                .append(StringConstants.SPACE_SYMBOL)
                .append(patronymic.charAt(0))
                .append(StringConstants.DOT_SYMBOL);
        return sb.toString();
    }

    public void getAndSetNickname() {

        view.inputNickname();
        nickname = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_NICKNAME);
    }

    public void getAndSetPhoneNumbers() {
        view.inputHomeTelephoneNumber();
        homeTelephoneNumber = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_PHONE_NUMBER);
        view.inputMobileNumberOblogatary();
        mobileNumberObligatory = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_PHONE_NUMBER);
        view.inputMobileNumberOptional();
        mobileNumberOptional = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_PHONE_NUMBER);
    }

    public void getAndSetEmailAndSkype() {

        view.inputEmail();
        email = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_EMAIL);
        view.inputSkype();
        skypeNickname = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_NICKNAME);
    }

    public void getAndSetAddress() {

        view.inputPostalCode();
        postalCode = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_POSTAL_CODE);
        view.inputTown();
        townName = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_TOWN);
        view.inputStreetAddress();
        streetAddress = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_STREET_ADDRESS);
        view.inputHouseNumber();
        houseNumber = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_HOUSE_NUMBER);
        view.inputApartmentNumber();
        apartmentNumber = utility.inputValueStringWithRegex(GlobalRegexStrings.REGEX_APARTMENT_NUMBER);
        fullAddress = getFullAddress();
    }



    public String getFullAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append(townName).append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(streetAddress)
                .append(StringConstants.SPACE_SYMBOL).append(StringConstants.STREET_STRING)
                .append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(houseNumber)
                .append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL)
                .append(StringConstants.APT_STRING).append(StringConstants.SPACE_SYMBOL).append(apartmentNumber)
                .append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(postalCode);
        return sb.toString();
    }

    public void transferDataIntoRecord() {
        model.getRecord().setFirstName(firstName);
        model.getRecord().setLastName(lastName);
        model.getRecord().setPatronymic(patronymic);
        model.getRecord().setFullName(getShortName());
        model.getRecord().setNickname(nickname);
        model.getRecord().setFullName(fullName);
        model.getRecord().setComment(comment);

        model.getRecord().setHomeTelephoneNumber(homeTelephoneNumber);
        model.getRecord().setMobileNumberObligatory(mobileNumberObligatory);
        model.getRecord().setMobileNumberOptional(mobileNumberOptional);

        model.getRecord().setEmail(email);
        model.getRecord().setSkypeNickname(skypeNickname);

        model.getRecord().setPostalCode(postalCode);
        model.getRecord().setTownName(townName);
        model.getRecord().setStreetAddress(streetAddress);
        model.getRecord().setHouseNumber(houseNumber);
        model.getRecord().setApartmentNumber(apartmentNumber);
        model.getRecord().setFullAddress(fullAddress);

        model.getRecord().setDateOfCreation(dateOfCreation);
        model.getRecord().setDateOfModification(dateOfModification);
        view.printMessage(model.getRecord().toString());
    }

    public void setDateOfCreation() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringConstants.DATE_PATTERN);
        dateOfCreation = simpleDateFormat.format(date);
    }

    public void setDateOfModification() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringConstants.DATE_PATTERN);
        dateOfModification = simpleDateFormat.format(date);
    }
}
