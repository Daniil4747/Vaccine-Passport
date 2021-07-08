package com.example.vaccine_passport;

import com.example.vaccine_passport.Age;

public class User {
    // Private
    private Age UsrAge;

    private String UsrName;
    private String UsrFullName;
    private String UsrMiddleName;

    private String UsrVaccine; // Vaccine name

    private boolean UsrStatus;  // Shows whether the user is sick [True - is sick | False - not sick]
    private boolean UsrPCR; // User PCR test result. [True - positive result | False - negative result]

    private long UsrPolis; // Polis id
    private long UsrID;
    private String UsrIDString;
    // Public
    public void setUsrId (long id) {
        UsrID = id;
        UsrIDString = "id" + id;
    }
}
