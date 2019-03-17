package com.mcrudyy.WestTrumpDialog.services.intefaces;

import com.mcrudyy.WestTrumpDialog.model.Dialog;

import java.util.concurrent.ExecutionException;

public interface DialogService {
    Dialog generateDialog() throws InterruptedException, ExecutionException;
}
