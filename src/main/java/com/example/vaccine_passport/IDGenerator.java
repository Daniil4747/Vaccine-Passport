package com.example.vaccine_passport;

import com.example.vaccine_passport.User;

public class IDGenerator {
    // Private
    private long idNum = 0;
    // Public
    private void GenerateNewIdForUser(User usr) {
        usr.setUsrId(idNum);
        idNum+=1;
    }
}
