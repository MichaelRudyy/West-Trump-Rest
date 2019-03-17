package com.mcrudyy.WestTrumpDialog.services;

import com.mcrudyy.WestTrumpDialog.model.Quote;
import com.mcrudyy.WestTrumpDialog.model.trump.TrumpQuote;
import com.mcrudyy.WestTrumpDialog.services.intefaces.QuoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class TrumpService implements QuoteService {

    @Value("${trump.api.url}")
    private String url;

    @Override
    @Async
    public CompletableFuture<Quote> getQuote() {
        RestTemplate restTemplate = new RestTemplate();

        TrumpQuote quote = restTemplate.getForObject(url, TrumpQuote.class);

        log.debug("Trump's Quote is Ready");
        return CompletableFuture.completedFuture(quote);
    }
}
