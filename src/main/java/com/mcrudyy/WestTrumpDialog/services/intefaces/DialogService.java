package com.mcrudyy.WestTrumpDialog.services.intefaces;

import com.mcrudyy.WestTrumpDialog.model.Dialog;

import java.util.concurrent.ExecutionException;

public interface DialogService {
    public Dialog generateDialog() throws InterruptedException, ExecutionException;
}
