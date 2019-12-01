package com.prueba.cursomvpint.interactors;

import com.prueba.cursomvpint.interfaces.IMainActivityInteractor;
import com.prueba.cursomvpint.interfaces.IMainActivityPresenter;
import com.prueba.cursomvpint.presenters.MainActivityPresenterImpl;

public class MainActivityInteractorImpl implements IMainActivityInteractor {

    private IMainActivityPresenter presenter;
    private String modifyText;

    public MainActivityInteractorImpl(MainActivityPresenterImpl presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addName(String s) {

        modifyText = "Texto modificado: " + s;
        presenter.showResult(modifyText);

    }
}
