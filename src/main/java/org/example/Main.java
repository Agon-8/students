package org.example;

import org.example.app.db.DBConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DBConnection dbc = new DBConnection();
        dbc.connect();
        }
    }
