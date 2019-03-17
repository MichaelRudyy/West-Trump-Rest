package com.mcrudyy.WestTrumpDialog.services;

import com.mcrudyy.WestTrumpDialog.model.Dialog;
import com.mcrudyy.WestTrumpDialog.model.Quote;
import com.mcrudyy.WestTrumpDialog.services.intefaces.DialogService;
import com.mcrudyy.WestTrumpDialog.services.intefaces.QuoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
@Slf4j
public class DialogServiceImpl implements DialogService {

    private final QuoteService trumpService;
    private final QuoteService westService;

    @Autowired
    public DialogServiceImpl(@Qualifier("trumpService") QuoteService trumpService
            , @Qualifier("westService") QuoteService westService) {
        this.trumpService = trumpService;
        this.westService = westService;
    }

    public Dialog generateDialog() throws InterruptedException, ExecutionException {
        log.debug("Run West Service");
        Future<Quote> westQuoteFuture = westService.getQuote();

        log.debug("Run Trump Service");
        Future<Quote> trumpQuoteFuture = trumpService.getQuote();

        while (!westQuoteFuture.isDone() && !trumpQuoteFuture.isDone()) {
            Thread.sleep(10);
        }

        log.debug("Quotes are Ready");
        return new Dialog(westQuoteFuture.get().getMessage(),trumpQuoteFuture.get().getMessage());
    }
}
