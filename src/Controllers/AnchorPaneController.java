/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AnchorPaneController implements Initializable {

    @FXML
    private Rectangle rect1;
    @FXML
    private Rectangle rect2;
    @FXML
    private Rectangle rect3;
    @FXML
    private Rectangle rect4;
    @FXML
    private Rectangle rect5;
    @FXML
    private Rectangle rect6;
    @FXML
    private Rectangle rect7;
    @FXML
    private Rectangle rect8;
    @FXML
    private Rectangle rect9;
/////
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label label6;
    @FXML
    private Label label7;
    @FXML
    private Label label8;
    @FXML
    private Label label9;

    /**
     * Initializes the controller class.
     */
    @FXML
    void click1(MouseEvent event) {
        if (label1.getText() == " ") {
            label1.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click2(MouseEvent event) {
        if (label2.getText() == " ") {
            label2.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click3(MouseEvent event) {
        if (label3.getText() == " ") {
            label3.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click4(MouseEvent event) {
        if (label4.getText() == " ") {
            label4.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click5(MouseEvent event) {
        if (label5.getText() == " ") {
            label5.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click6(MouseEvent event) {
        if (label6.getText() == " ") {
            label6.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click7(MouseEvent event) {
        if (label7.getText() == " ") {
            label7.setText("O");
            computerMove();
        }
    }

    @FXML
    void click8(MouseEvent event) {
        if (label8.getText() == " ") {
            label8.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @FXML
    void click9(MouseEvent event) {
        if (label9.getText() == " ") {
            label9.setText("O");
            computerMove();
        } else {
            alert();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label1.setText(" ");
        label2.setText(" ");
        label3.setText(" ");
        label4.setText(" ");
        label5.setText(" ");
        label6.setText(" ");
        label7.setText(" ");
        label8.setText(" ");
        label9.setText(" ");
    }

    private void computerMove() {
        
               
        //konczenie po prawej stronie
        if (label7.getText() == "X" && label8.getText() == "X" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }

        if (label4.getText() == "X" && label5.getText() == "X" && label6.getText() == " ") {
            label6.setText("X");
            return;
        }

        if (label1.getText() == "X" && label2.getText() == "X" && label3.getText() == " ") {
            label3.setText("X");
            return;
        }
        //konczenie na srodku
        if (label7.getText() == "X" && label8.getText() == " " && label9.getText() == "X") {
            label8.setText("X");
            return;
        }
        
        if (label4.getText() == "X" && label5.getText() == " " && label6.getText() == "X") {
            label5.setText("X");
            return;
        }
        
        if (label1.getText() == "X" && label2.getText() == " " && label3.getText() == "X") {
            label2.setText("X");
            return;
        }
        //konczenie po prawej stronie
        if (label7.getText() == " " && label8.getText() == "X" && label9.getText() == "X") {
            label7.setText("X");
            return;
        }
        
        if (label4.getText() == " " && label5.getText() == "X" && label6.getText() == "X") {
            label4.setText("X");
            return;
        }
        
        if (label1.getText() == " " && label2.getText() == "X" && label3.getText() == "X") {
            label1.setText("X");
            return;
        }
        
        
        //Sprawdzamy po kolumnach
        //Dol
        if (label7.getText() == "X" && label4.getText() == "X" && label1.getText() == " ") {
            label1.setText("X");
            return;
        }
        
        if (label8.getText() == "X" && label5.getText() == "X" && label2.getText() == " ") {
            label2.setText("X");
            return;
        }
        
        if (label9.getText() == "X" && label6.getText() == "X" && label3.getText() == " ") {
            label3.setText("X");
            return;
        }
        //Srodek
        
        if (label7.getText() == "X" && label1.getText() == "X" && label4.getText() == " ") {
            label4.setText("X");
            return;
        }
        
        if (label8.getText() == "X" && label2.getText() == "X" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        if (label9.getText() == "X" && label3.getText() == "X" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        //Gora
        if (label1.getText() == "X" && label4.getText() == "X" && label7.getText() == " ") {
            label7.setText("X");
            return;
        }
        
        if (label2.getText() == "X" && label5.getText() == "X" && label8.getText() == " ") {
            label8.setText("X");
            return;
        }
        
        if (label3.getText() == "X" && label6.getText() == "X" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }
        
        
        //sprawdzanie po skosie
        if (label7.getText() == "X" && label5.getText() == "X" && label3.getText() == " ") {
            label3.setText("X");
            return;
        }
        
        if (label7.getText() == "X" && label3.getText() == "X" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        if (label5.getText() == "X" && label3.getText() == "X" && label9.getText() == " ") {
            label7.setText("X");
            return;
        }
        
        if (label1.getText() == "X" && label5.getText() == "X" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }
        
        if (label1.getText() == "X" && label9.getText() == "X" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        if (label1.getText() == "X" && label5.getText() == "X" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }
        ////////
        ////////
        ////////
        
        //Blokowanie przeciwnika po wierszach
        if (label7.getText() == "O" && label8.getText() == "O" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }

        if (label4.getText() == "O" && label5.getText() == "O" && label6.getText() == " ") {
            label6.setText("X");
            return;
        }

        if (label1.getText() == "O" && label2.getText() == "O" && label3.getText() == " ") {
            label3.setText("X");
            return;
        }
        //konczenie na srodku
        if (label7.getText() == "O" && label8.getText() == " " && label9.getText() == "O") {
            label8.setText("X");
            return;
        }
        
        if (label4.getText() == "O" && label5.getText() == " " && label6.getText() == "O") {
            label5.setText("X");
            return;
        }
        
        if (label1.getText() == "O" && label2.getText() == " " && label3.getText() == "O") {
            label2.setText("X");
            return;
        }
        //konczenie po prawej stronie
        if (label7.getText() == " " && label8.getText() == "O" && label9.getText() == "O") {
            label7.setText("X");
            return;
        }
        
        if (label4.getText() == " " && label5.getText() == "O" && label6.getText() == "O") {
            label4.setText("X");
            return;
        }
        
        if (label1.getText() == " " && label2.getText() == "O" && label3.getText() == "O") {
            label1.setText("X");
            return;
        }
        
        //Blokowanie po kolumnach
        //Dol
        if (label7.getText() == "O" && label4.getText() == "O" && label1.getText() == " ") {
            label1.setText("X");
            return;
        }
        
        if (label8.getText() == "O" && label5.getText() == "O" && label2.getText() == " ") {
            label2.setText("X");
            return;
        }
        
        if (label9.getText() == "O" && label6.getText() == "O" && label3.getText() == " ") {
            label3.setText("X");
            return;
        }
        //Srodek
        
        if (label7.getText() == "O" && label1.getText() == "O" && label4.getText() == " ") {
            label4.setText("X");
            return;
        }
        
        if (label8.getText() == "O" && label2.getText() == "O" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        if (label9.getText() == "O" && label3.getText() == "O" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        //Gora
        if (label1.getText() == "O" && label4.getText() == "O" && label7.getText() == " ") {
            label7.setText("X");
            return;
        }
        
        if (label2.getText() == "O" && label5.getText() == "O" && label8.getText() == " ") {
            label8.setText("X");
            return;
        }
        
        if (label3.getText() == "O" && label6.getText() == "O" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }
        ///
        ///
        ///
        //blokowanie po skosie
        if (label7.getText() == "O" && label5.getText() == "O" && label3.getText() == " ") {
            label3.setText("X");
            return;
        }
        
        if (label7.getText() == "O" && label3.getText() == "O" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        if (label5.getText() == "O" && label3.getText() == "O" && label7.getText() == " ") {
            label7.setText("X");
            return;
        }
        
        if (label1.getText() == "O" && label5.getText() == "O" && label9.getText() == " ") {
            label9.setText("X");
            return;
        }
        
        if (label1.getText() == "O" && label9.getText() == "O" && label5.getText() == " ") {
            label5.setText("X");
            return;
        }
        
        if (label9.getText() == "O" && label5.getText() == "O" && label9.getText() == " ") {
            label1.setText("X");
            return;
        }
        
        if(label5.getText()==" ")
        {
            label5.setText("X");
            return;
        }
        
        //jezeli srodek nie pusty na starcie wstaw w jeden rog
        if(label5.getText()!= " " && label7.getText()== " ")
        {
            label7.setText("X");
            return;
        }
        
        //blokowanie jezeli w dwoch naprzeciwnych rogach
        if((label7.getText()== "O" && label3.getText()== "O") || (label1.getText()== "O" && label9.getText()== "O"))
        {
            label4.setText("X");
            return;
        }
        
        if(label3.getText()!= " " && label5.getText()!= " " && label6.getText()!= " " && label2.getText()!= " "  &&label9.getText()== " ")
        {
            label9.setText("X");
            return;
        }
        
        //B
        
        if(label9.getText()== "O" && label2.getText()== "O")
        {
            label3.setText("X");
            return;
        }
        
        if(label6.getText()== "O" && label2.getText()== "O")
        {
            label3.setText("X");
            return;
        }
        
        if(label6.getText()== "O" && label1.getText()== "O")
        {
            label3.setText("X");
            return;
        }
        
        

    }
    
    public void sprawdzWynik()
    {
        if
    }

    public void alert() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Uwaga");
        alert.setHeaderText("To pole jest zajete, wybierz inne");
        alert.showAndWait();
    }
}
