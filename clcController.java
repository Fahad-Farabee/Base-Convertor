package CLC;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class clcController {

    private Stage stage;
    private Parent root;
    private Scene scene;
    @FXML
    private Button exitButton;
    @FXML
    private TextField txtField;

    @FXML
    private Label txtLabel;

    private String input;//takes the input from the textfield.


    //first we will convert the decimal.
    @FXML
    void convertToBin(ActionEvent event)  {
           try {
               input = txtField.getText();//this method is used to take the input from the txtfield.
               String binrayNumber = Integer.toBinaryString(Integer.parseInt(input));//shows the binary of the integer in a string form.
               txtLabel.setText(binrayNumber);//sets the label with the binaryNumber.
           }
           catch (Exception e){
               if (input.matches("[a-zA-Z - 32]+")){
                   txtLabel.setText("Not a Number");
               }
               else {
                   txtLabel.setText("No Input Given");
               }
           }
    }

    @FXML
    void convertToHexa(ActionEvent event) {
        try
        {
            input = txtField.getText();//this method is used to take the input from the txtfield.
            String hexaNumber = Integer.toHexString(Integer.parseInt(input));//shows the Hexa of the integer in a string form.
            txtLabel.setText(hexaNumber);//sets the label with the hexaNumber.
        }
        catch (Exception e){
            if (input.matches("[a-zA-Z - 32]+")){
                txtLabel.setText("Not a Number");
            }
            else {
                txtLabel.setText("No Input Given");
            }
        }
        }


    @FXML
    void convertToOct(ActionEvent event) {
       try {
           input = txtField.getText();//this method is used to take the input from the txtfield.
           String octNumber = Integer.toOctalString(Integer.parseInt(input));//shows the octal of the integer in a string form.
           txtLabel.setText(octNumber);//sets the label with the octNumber.
       }
       catch (Exception e) {
           if (input.matches("[a-zA-Z - 32]+")){
               txtLabel.setText("Not a Number");
           }
           else {
               txtLabel.setText("No Input Given");
           }

       }

    }
    //next i will make the clear work
    @FXML
    void clearTxtField(ActionEvent event) {
        txtLabel.setText("No Input");
        txtField.setText("Please Decimal Input Here");
    }

    //next is the close button. this will clos the stage.
    @FXML
    void closeStage(ActionEvent event) {
        stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }


    //lastly i will do the scene shifting/switching
    //going to the Next SCENE
    @FXML
    void switchScene(ActionEvent event) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource("NextScene.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
    }

}
