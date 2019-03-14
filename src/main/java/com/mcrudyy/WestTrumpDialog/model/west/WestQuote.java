package com.mcrudyy.WestTrumpDialog.model.west;


import com.mcrudyy.WestTrumpDialog.model.Quote;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@Data
@EqualsAndHashCode(callSuper = true)
public class WestQuote extends Quote implements Serializable {
    private String id;
}
