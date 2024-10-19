package org.mavenproject1.slider_javafx;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderController implements Initializable {
    @FXML
    private ImageView Exit;

    @FXML
    private Label Menu;

    @FXML
    private Label MenuBack;

    @FXML
    private VBox Slider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Exit.setOnMouseClicked(event->{System.exit(0);});

        Slider.setTranslateX(-176);

        Menu.setOnMouseClicked(event->{
            TranslateTransition Slide=new TranslateTransition();
            Slide.setDuration(Duration.seconds(0.4));
            Slide.setNode(Slider);

            Slide.setToX(0);
            Slide.play();

            Slider.setTranslateX(-176);

            Slide.setOnFinished((ActionEvent e)->{
                Menu.setVisible(false);
                MenuBack.setVisible(true);
            });
        });
        MenuBack.setOnMouseClicked(event->{
            TranslateTransition Slide=new TranslateTransition();
            Slide.setDuration(Duration.seconds(0.4));
            Slide.setNode(Slider);

            Slide.setToX(-176);
            Slide.play();

            Slider.setTranslateX(0);

            Slide.setOnFinished((ActionEvent e)->{
                Menu.setVisible(true);
                MenuBack.setVisible(false);
            });
        });

    }
}
