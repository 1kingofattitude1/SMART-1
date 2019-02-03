import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import java.awt.*;


public class SMART_UI_BUILT1 extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Pane pane=new Pane();
		GridPane gridpane=new GridPane();
		
				
				
		Label sym1=new Label("Symptom 1");
		TextField symt1=new TextField();		
		sym1.setStyle("-fx-label-padding:20,20,50,50");
		symt1.setPrefWidth(500);
		symt1.setPrefHeight(40);
		
		
		Label sym2=new Label("Symptom 2");
		TextField symt2=new TextField();
		sym2.setStyle("-fx-label-padding:20,20,50,50");
		symt2.setPrefWidth(500);
		symt2.setPrefHeight(40);
	
	
		Label sym3=new Label("Symptom 3");
		TextField symt3=new TextField();
		sym3.setStyle("-fx-label-padding:20,20,50,50");
		symt3.setPrefWidth(500);
		symt3.setPrefHeight(40);
		
		
		Label sym4=new Label("Symptom 4");
		TextField symt4=new TextField();
		sym4.setStyle("-fx-label-padding:20,20,50,50");
		symt4.setPrefWidth(500);
		symt4.setPrefHeight(40);
			
		Label sym5=new Label("");
		Button ok =new Button("Go");
		sym5.setStyle("-fx-label-padding:20,20,50,50");
		ok.setPrefWidth(100);
		ok.setPrefHeight(60);
		//ok.setStyle("-fx-background-color:blue");
		ok.setStyle("-fx-font-color:white");
		ok.setAlignment(Pos.CENTER);
		
		gridpane.addRow(0,sym1,symt1);
		gridpane.addRow(1,sym2,symt2);
		gridpane.addRow(2,sym3,symt3);
		gridpane.addRow(3,sym4,symt4);
		gridpane.addRow(4,sym5,ok);
		
		gridpane.setHgap(10);
		gridpane.setVgap(30);
		
		gridpane.prefHeightProperty().bind(pane.heightProperty());
		gridpane.prefWidthProperty().bind(pane.widthProperty());
		
		//gridpane.setGridLinesVisible(true);
		gridpane.setAlignment(Pos.CENTER);
		
		pane.getChildren().add(gridpane);
		
		Scene scene= new Scene(pane,dim.getWidth()/2,dim.getHeight()/2);
		//scene.setTitle("SMART BULIT v1.0");
		primaryStage.setTitle("SMART BULIT v1.0");
		primaryStage.setScene(scene);
		primaryStage.show();

		
		
		
	}
}