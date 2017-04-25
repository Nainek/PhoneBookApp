package com.training.controller;

import com.training.view.View;
import java.util.Scanner;

public class Utility {

    private View view;
    private Scanner scanner;

    public Utility(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputValueStringWithRegex(String regex) {
        String value = scanner.next();
        while(!(value.matches(regex))) {
            view.printWrongInput();
            value = scanner.next();
        }
        return value;
    }

}