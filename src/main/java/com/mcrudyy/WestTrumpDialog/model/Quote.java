package com.mcrudyy.WestTrumpDialog.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Quote {
    @JsonAlias({"quote","message"})
    protected String message;


/*    public Quote() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }*/


}
