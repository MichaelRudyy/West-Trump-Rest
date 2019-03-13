package com.mcrudyy.WestTrumpDialog;

import com.mcrudyy.WestTrumpDialog.model.Quote;
import com.mcrudyy.WestTrumpDialog.model.west.WestQuote;
import com.mcrudyy.WestTrumpDialog.services.DialogServiceImpl;
import com.mcrudyy.WestTrumpDialog.services.intefaces.DialogService;
import com.mcrudyy.WestTrumpDialog.services.intefaces.QuoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WestTrumpDialogApplicationTests {

    @Qualifier("westService")
    @Autowired
	QuoteService westService;

    @Qualifier("trumpService")
    @Autowired
    QuoteService trumpService;

    @Autowired
    DialogService dialogService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){
		System.out.println(westService.getQuote().toString());
	}

	@Test()
    public void test1(){
        WestQuote westQuote = new WestQuote();

        westQuote.setId("id");
        westQuote.setMessage("mes");
        System.out.println(westQuote);
    }

    @Test
    public void test2() throws ExecutionException, InterruptedException {
	    dialogService.generateDialog();
    }

    @Test
    public void trumpTest() throws ExecutionException, InterruptedException {
	    Future<Quote> quoteFuture= trumpService.getQuote();

	    while (true){
	        if (quoteFuture.isDone()) break;
        }

        System.out.println(quoteFuture.get().getMessage());
    }

}
