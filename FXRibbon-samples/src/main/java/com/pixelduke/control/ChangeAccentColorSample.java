package com.pixelduke.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import java.net.URL;

public class ChangeAccentColorSample extends Application {
    private static final String RESOURCE = "CompleteRibbonFXML.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        URL resource = ChangeAccentColorSample.class.getResource(RESOURCE);
        Parent root = FXMLLoader.load(resource);

        Ribbon ribbon = (Ribbon) root.lookup(".ribbon");
        ribbon.setStyle("ACCENT_COLOR: #10893e"); // A green color

        Scene scene = new Scene(root);

//        ScenicView.show(scene);
        new JMetro(scene,Style.LIGHT);


        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

