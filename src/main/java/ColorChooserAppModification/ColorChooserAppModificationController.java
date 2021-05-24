package ColorChooserAppModification;

        import javafx.fxml.FXML;
        import javafx.scene.control.Label;
        import javafx.scene.control.Slider;
        import javafx.scene.control.TextField;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Rectangle;

public class ColorChooserAppModificationController {

    @FXML    private Slider RSlider;
    @FXML    private Slider GSlider;
    @FXML    private Slider BSlider;
    @FXML    private Rectangle ColoredRectangle;
    @FXML    private Label RValue;
    @FXML    private Label BValue;
    @FXML    private Label GValue;
    @FXML    private TextField RText;
    @FXML    private TextField GText;
    @FXML    private TextField BText;

    int R = 0;
    int G = 0;
    int B = 0;

    public void initialize(){
        RText.textProperty().addListener((observable, oldValue, newValue) -> {
            if(Integer.parseInt(newValue)<0){
                R = 0;
            }else if(Integer.parseInt(newValue)>255){
                R =255;
            }else {
                R = Integer.parseInt(newValue);
            }
            System.out.println("R text field changed from " + oldValue + " to " + R);
            RSlider.setValue(R);
            RValue.setText(String.valueOf(R));
            ColoredRectangle.setFill(Color.rgb(R, G, B));
        });

        GText.textProperty().addListener((observable, oldValue, newValue) -> {
            if(Integer.parseInt(newValue)<0){
                G = 0;
            }else if(Integer.parseInt(newValue)>255){
                G =255;
            }else {
                G = Integer.parseInt(newValue);
            }
            System.out.println("G text field changed from " + oldValue + " to " + G);
            GSlider.setValue(G);
            GValue.setText(String.valueOf(G));
            ColoredRectangle.setFill(Color.rgb(R, G, B));
        });

        BText.textProperty().addListener((observable, oldValue, newValue) -> {
            if(Integer.parseInt(newValue)<0){
                B = 0;
            }else if(Integer.parseInt(newValue)>255){
                B =255;
            }else {
                B = Integer.parseInt(newValue);
            }
            System.out.println("B text field changed from " + oldValue + " to " + B);
            BSlider.setValue(B);
            BValue.setText(String.valueOf(B));
            ColoredRectangle.setFill(Color.rgb(R, G, B));
        });

    }

}
