package prueba4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 *
 * @author Rodrigo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView fondoNormal;
    @FXML
    private Button BotonComienzo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Comienzo(ActionEvent event) {
        
        fondoNormal.setVisible(true);
        
        BotonComienzo.setVisible(false);
        
        System.out.println("TUNAZOOOOOOO  ENE EL OCICO");
                
        
    }
    
}
