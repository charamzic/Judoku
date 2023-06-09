package cz.javajitsu.judoku.userinterface;

import javafx.scene.control.TextField;

public class JudokuTextField extends TextField {
    private final int x;
    private final int y;

    public JudokuTextField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public JudokuTextField(String text, int x, int y) {
        super(text);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (!text.matches("[0-9]")) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String replacement) {
        if (!replacement.matches("[0-9]")) {
            super.replaceSelection(replacement);
        }
    }
}
