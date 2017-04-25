package com.training.controller;

import com.training.model.Model;
import com.training.view.View;
import java.util.Scanner;

public class Controller {

    private Model model = new Model();
    private View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){

        Scanner scanner = new Scanner(System.in);

        Utility utility = new Utility(view, scanner);
        TemporaryRecord temporaryRecord = new TemporaryRecord(view, model, utility);
        temporaryRecord.getAndSetAllValues();
        temporaryRecord.transferDataIntoRecord();
        view.printMessage(model.toString());

    }
}
