package lk.ijse.dep11;

import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.awt.event.ActionEvent;
import java.io.*;

public class MainFormController {
    public AnchorPane root;
    public TextField txtSource;
    public Button btnBrowseSource;
    public TextField txtTarget;
    public Button btnTarget;
    public Button btnCopy;
    public ProgressBar pbProgress;
    public Label lblCopyBytes;
    public Label lblProgress;

    public void initialize(){

    }

    public void btnBrowseSourceOnAction(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select the file");
        File file = fileChooser.showOpenDialog(root.getScene().getWindow());
        if(file!=null){
            txtSource.setText(file.getAbsolutePath());
        }else {
            txtSource.clear();
        }
        btnCopy.setDisable(txtSource.getText().isBlank() || txtTarget.getText().isBlank());
    }

    public void btnTargetOnAction(){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select the Target folder");
        File file = directoryChooser.showDialog(root.getScene().getWindow());
        if(file != null){
            txtTarget.setText(file.getAbsolutePath());

        }else {
            txtTarget.clear();
        }
        btnCopy.setDisable(txtSource.getText().isBlank() || txtTarget.getText().isBlank());
    }


    public void txtTargetOnAction(){

    }
    public  void txtSourceOnAction(){

    }

    public void btnCopyOnAction(javafx.event.ActionEvent actionEvent) throws FileNotFoundException {
        File sourceFile = new File(txtSource.getText());
        File targetFile = new File(txtTarget.getText(),sourceFile.getName());
        System.out.println(targetFile);

        try {
            targetFile.createNewFile();
        }catch (IOException e){
            System.out.println("Failed to copy");
            e.printStackTrace();
            return;
        }
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

       try {
           int read =0;
           while ((read = fis.read())!=-1){
               fos.write(read);
           }

            fos.close();
            fis.close();
           Platform.runLater(()-> new Alert(Alert.AlertType.INFORMATION,"Copied Scucessfully").show());
        }catch (IOException e){
           Platform.runLater(()-> new Alert(Alert.AlertType.INFORMATION,"Copy fail,try Again").show());
           e.printStackTrace();
       }
    }
}
