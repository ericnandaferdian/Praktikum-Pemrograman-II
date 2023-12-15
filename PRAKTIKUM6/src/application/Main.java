package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> table = new TableView<>();

        TableColumn<Mahasiswa, String> nimColoum = new TableColumn<>("NIM");
        nimColoum.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaColoum = new TableColumn<>("Nama");
        namaColoum.setCellValueFactory(new PropertyValueFactory<>("nama"));

        table.getColumns().addAll(nimColoum, namaColoum);

        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
        		new Mahasiswa(1, "Eric Nanda Ferdian", "2210817210010"),
                new Mahasiswa(2, "Jordan Alfian Fahri", "2210817110008"),
                new Mahasiswa(3, "Hega Ari Perdana", "2210817111111"),
                new Mahasiswa(4, "Alfito Noor Febian", "2210817210000"),
                new Mahasiswa(5, "Enggar Ramadhan", "2210817210011"),
                new Mahasiswa(6, "Tyo Herdinan", "2210817210022"),
                new Mahasiswa(7, "Diana Febrianti", "22108117220033"),
                new Mahasiswa(8, "Syifa Aulia Maharani", "2210817220044"),
                new Mahasiswa(9, "Noor Ayida Damayanti", "2210817770000"),
                new Mahasiswa(10, "Anggun Purnama Sari", "2210834579000")
        );

        table.setItems(data);

        Scene scene = new Scene(table, 300, 275);

        primaryStage.setTitle("Data Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}