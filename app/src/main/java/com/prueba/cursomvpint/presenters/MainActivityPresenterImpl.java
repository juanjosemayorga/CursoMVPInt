package com.prueba.cursomvpint.presenters;

import com.prueba.cursomvpint.interactors.MainActivityInteractorImpl;
import com.prueba.cursomvpint.interfaces.IMainActivityInteractor;
import com.prueba.cursomvpint.interfaces.IMainActivityPresenter;
import com.prueba.cursomvpint.interfaces.IMainActivityView;

public class MainActivityPresenterImpl implements IMainActivityPresenter {

    private IMainActivityView view;
    private IMainActivityInteractor interactor;

    public MainActivityPresenterImpl(IMainActivityView view) {
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResult(String s) {

        view.showResult(s);

    }

    @Override
    public void addName(String s) {

        interactor.addName(s);

    }
}
