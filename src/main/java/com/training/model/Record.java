package com.training.model;



public class Record {

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
    private String fullAddress;

    private String dateOfCreation;
    private String dateOfModification;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHomeTelephoneNumber() {
        return homeTelephoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Record{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", fullName='" + fullName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", homeTelephoneNumber='" + homeTelephoneNumber + '\'' +
                ", mobileNumberObligatory='" + mobileNumberObligatory + '\'' +
                ", mobileNumberOptional='" + mobileNumberOptional + '\'' +
                ", email='" + email + '\'' +
                ", skypeNickname='" + skypeNickname + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", townName='" + townName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", dateOfModification='" + dateOfModification + '\'' +
                '}';
    }

    public void setHomeTelephoneNumber(String homeTelephoneNumber) {
        this.homeTelephoneNumber = homeTelephoneNumber;
    }

    public String getMobileNumberObligatory() {
        return mobileNumberObligatory;
    }

    public void setMobileNumberObligatory(String mobileNumberObligatory) {
        this.mobileNumberObligatory = mobileNumberObligatory;
    }

    public String getMobileNumberOptional() {
        return mobileNumberOptional;
    }

    public void setMobileNumberOptional(String mobileNumberOptional) {
        this.mobileNumberOptional = mobileNumberOptional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkypeNickname() {
        return skypeNickname;
    }

    public void setSkypeNickname(String skypeNickname) {
        this.skypeNickname = skypeNickname;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDateOfModification() {
        return dateOfModification;
    }

    public void setDateOfModification(String dateOfModification) {
        this.dateOfModification = dateOfModification;
    }

}
