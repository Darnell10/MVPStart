package com.example.mvpstart;

public class Presenter {

    private final MVPView view;
    private final Calculator calculator = new Calculator();

    public Presenter(MVPView view){
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
