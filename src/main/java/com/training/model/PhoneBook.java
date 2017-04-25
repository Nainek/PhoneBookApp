package com.training.model;

import java.util.ArrayList;
import java.util.List;


public class PhoneBook {

    private PhoneBook() {
    }

    private static PhoneBook phoneBook;

    private  List <Record> directory = new ArrayList <Record>();

    public static void setPhoneBook(PhoneBook phoneBook) {
        PhoneBook.phoneBook = phoneBook;
    }

    public List<Record> getDirectory() {
        return directory;
    }

    public void addRecordToDirectory(Record record) {
        directory.add(record);
    }

    public void setDirectory(List<Record> directory) {
        this.directory = directory;
    }

    public static PhoneBook getPhoneBook(){
        if (phoneBook == null) {

            synchronized (PhoneBook.class){
                if (phoneBook == null) {
                    phoneBook = new PhoneBook();
                }
            }
        }
        return phoneBook;
    }

}
