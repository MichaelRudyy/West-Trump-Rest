package com.mcrudyy.WestTrumpDialog.controllers;

import com.mcrudyy.WestTrumpDialog.model.Dialog;
import com.mcrudyy.WestTrumpDialog.services.intefaces.DialogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping
public class Controller {

    private final DialogService service;

    @Autowired
    public Controller(DialogService service) {
        this.service = service;
    }

    @GetMapping("/about")
    private String hello() {
        return "hello";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    private Dialog talk() throws ExecutionException, InterruptedException {
        return service.generateDialog();
    }
}
