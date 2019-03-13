package com.mcrudyy.WestTrumpDialog.model.west;


import com.mcrudyy.WestTrumpDialog.model.Quote;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@Data
@EqualsAndHashCode(callSuper = true)
public class WestQuote extends Quote implements Serializable {
    private String id;

/*    public WestQuote() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WestQuote{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }*/
}
