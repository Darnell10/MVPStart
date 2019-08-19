package com.example.mvpstart;

public interface MainContract {

    interface MvpPresenter {
        void showCorrectText(String input);
    }

    interface MvpView {
        void renderGreaterThan100();

        void renderResult(int result);
    }
}
