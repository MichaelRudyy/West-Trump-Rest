package com.mcrudyy.WestTrumpDialog.services.intefaces;

import com.mcrudyy.WestTrumpDialog.model.Quote;

import java.util.concurrent.CompletableFuture;

public interface QuoteService {
    CompletableFuture<Quote> getQuote();
}
