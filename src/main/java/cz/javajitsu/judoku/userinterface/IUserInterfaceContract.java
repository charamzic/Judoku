package cz.javajitsu.judoku.userinterface;

import cz.javajitsu.judoku.problemdomain.JudokuGame;

public interface IUserInterfaceContract {
    interface EventListener {
        void onJudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(JudokuGame game);
        void showDialog(String message);
        void showError(String message);
    }
}
