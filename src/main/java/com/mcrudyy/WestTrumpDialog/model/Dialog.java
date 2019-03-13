package com.mcrudyy.WestTrumpDialog.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dialog {
    @JsonProperty("Kanye West")
    private String westQuote;

    @JsonProperty("Donald Trump")
    private String trumpQuote;
}
