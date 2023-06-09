package cz.javajitsu.judoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(JudokuGame game) throws IOException;
    JudokuGame getGameData() throws IOException;
}
