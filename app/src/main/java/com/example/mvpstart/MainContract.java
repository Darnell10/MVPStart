package com.example.mvpstart;

public interface MainContract {

    interface MvpPresenter {
        void showCorrectText(String input);
    }

    interface MVPView {
        void renderGreaterThan100();

        void renderResult(int result);
    }
}
