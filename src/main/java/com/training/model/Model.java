package com.training.model;


public class Model {

    private Record record = new Record();
    private PhoneBook phoneBook = PhoneBook.getPhoneBook();

    public void saveCurrentRecord(){
        phoneBook.addRecordToDirectory(record);
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

}
