package com.mcrudyy.WestTrumpDialog.services;

import com.mcrudyy.WestTrumpDialog.model.Quote;
import com.mcrudyy.WestTrumpDialog.model.west.WestQuote;
import com.mcrudyy.WestTrumpDialog.services.intefaces.QuoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class WestService implements QuoteService {

    @Override
    @Async
    public CompletableFuture<Quote> getQuote(){
        RestTemplate restTemplate = new RestTemplate();

        WestQuote quote = restTemplate.getForObject("https://api.kanye.rest", WestQuote.class);

        log.debug("West's Quote is Ready");
        return CompletableFuture.completedFuture(quote);
    }
}
