package com.training.view;


public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongInput() {
        printMessage(StringConstants.WRONG_INPUT_DATA);
    }

    public void inputName() { printMessage(StringConstants.INPUT_FIRST_NAME); }

    public void inputLastname() {
        printMessage(StringConstants.INPUT_LAST_NAME);
    }

    public void inputPatronymic() {
        printMessage(StringConstants.INPUT_PATRONYMIC);
    }

    public void inputNickname() {
        printMessage(StringConstants.INPUT_NICKNAME);
    }

    public void inputComment() {
        printMessage(StringConstants.INPUT_COMMENT);
    }

    public void inputHomeTelephoneNumber() {
        printMessage(StringConstants.INPUT_HOME_TELEPHONE_NUMBER);
    }

    public void inputMobileNumberOblogatary() {
        printMessage(StringConstants.INPUT_MOBILE_NUMBER_OBLIGATORY);
    }

    public void inputMobileNumberOptional() {
        printMessage(StringConstants.INPUT_MOBILE_NUMBER_OPTIONAL);
    }

    public void inputEmail() {
        printMessage(StringConstants.INPUT_EMAIL);
    }

    public void inputSkype() {
        printMessage(StringConstants.INPUT_SKYPE_NICKNAME);
    }

    public void inputPostalCode() {
        printMessage(StringConstants.INPUT_POSTAL_CODE);
    }

    public void inputTown() {
        printMessage(StringConstants.INPUT_TOWN_NAME);
    }

    public void inputStreetAddress() {
        printMessage(StringConstants.INPUT_STREET_ADDRESS);
    }

    public void inputHouseNumber() {
        printMessage(StringConstants.INPUT_HOUSE_NUMBER);
    }

    public void inputApartmentNumber() {
        printMessage(StringConstants.INPUT_APARTMENT_NUMBER);
    }
}
