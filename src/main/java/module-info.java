module cz.javajitsu.judoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.javajitsu.judoku to javafx.fxml;
    exports cz.javajitsu.judoku;
    exports cz.javajitsu.judoku.constants;
    opens cz.javajitsu.judoku.constants to javafx.fxml;
}