package com.example.mvpstart;

public class MainPresenter implements MainContract.MvpPresenter {


    private final Calculator calculator = new Calculator();
    private final MainContract.MvpView view;

    public MainPresenter(MainContract.MvpView view){
        this.view = view;
    }

    public void showCorrectText(String input){

        int result =  calculator.featureOne(input);

        if (result > 100 ){
            view.renderGreaterThan100();
        } else {
            view.renderResult(result);
        }
    }
}
