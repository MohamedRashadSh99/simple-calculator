/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorofrashad;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author pc
 */
public class guiNumbers {
   abstraction a=new abstraction();
     ///////// scene 1 //////////////////
     public void getRoot(Stage primaryStage) {
        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bd;
       Button subtract, multibly,division, mod,kos1,kos2,eqal,bn,blus;
        TextField T1 =new TextField();
       
        TextField data =new TextField();
        b1 = new Button();
        b2 = new Button();
        b3 = new Button();
        b4 = new Button();
        b5 = new Button();
         kos1 = new Button();
        kos2 = new Button();
        eqal = new Button();
        subtract = new Button();
        multibly = new Button();
        b6 = new Button();
        b7 = new Button();
        b8 = new Button();
        b9 = new Button();
        b0 = new Button();
        bd = new Button();
        blus = new Button();
        division = new Button();
        mod = new Button();
      
        Image i1 = new Image(getClass().getResourceAsStream("plus.jpg"), 45,45, false, false);
       
        blus.setGraphic(new ImageView(i1));
        Image i0 = new Image(getClass().getResourceAsStream("naes.jpg"), 45,45, false, false);
       
        subtract.setGraphic(new ImageView(i0));
         Image i2 = new Image(getClass().getResourceAsStream("ala.jpg"), 45,45, false, false);
       
        division.setGraphic(new ImageView(i2));
       Image i3 = new Image(getClass().getResourceAsStream("mood.jpg"), 45,45, false, false);
        
        mod.setGraphic(new ImageView(i3));
       Image i4 = new Image(getClass().getResourceAsStream("eq.jpg"), 45,45, false, false);
       //  eqal = new Button();
        eqal.setGraphic(new ImageView(i4));
         Image i5 = new Image(getClass().getResourceAsStream("mult.png"), 45,45, false, false);
        multibly.setGraphic(new ImageView(i5));
         Image i6 = new Image(getClass().getResourceAsStream("k1.jpg"), 45,45, false, false);
        kos1.setGraphic(new ImageView(i6));
         Image i7 = new Image(getClass().getResourceAsStream("k2.jpg"), 45,45, false, false);
        kos2.setGraphic(new ImageView(i7));
         Image i8 = new Image(getClass().getResourceAsStream("1.png"), 45,45, false, false);
        b1.setGraphic(new ImageView(i8));
         Image i9 = new Image(getClass().getResourceAsStream("2.png"), 45,45, false, false);
        b2.setGraphic(new ImageView(i9));
         Image i10 = new Image(getClass().getResourceAsStream("3.jpg"), 45,45, false, false);
        b3.setGraphic(new ImageView(i10));
         Image i11 = new Image(getClass().getResourceAsStream("4.png"),45,45, false, false);
        b4.setGraphic(new ImageView(i11));
         Image i12 = new Image(getClass().getResourceAsStream("5.png"), 45,45, false, false);
        b5.setGraphic(new ImageView(i12));
        Image i13 = new Image(getClass().getResourceAsStream("6.png"), 45,45, false, false);
         b6.setGraphic(new ImageView(i13));
        Image i14 = new Image(getClass().getResourceAsStream("7.jpg"), 45,45, false, false);
         b7.setGraphic(new ImageView(i14));
        Image i15 = new Image(getClass().getResourceAsStream("8.jpg"), 45,45, false, false);
         b8.setGraphic(new ImageView(i15));
        Image i16 = new Image(getClass().getResourceAsStream("9.jpg"), 45,45, false, false);
         b9.setGraphic(new ImageView(i16));
        Image i17 = new Image(getClass().getResourceAsStream("0.jpg"), 45,45, false, false);
         b0.setGraphic(new ImageView(i17));
        Image i18 = new Image(getClass().getResourceAsStream("de.png"), 45,45, false, false);
         bd.setGraphic(new ImageView(i18));
    
        Image image = new Image(getClass().getResourceAsStream("b.jpg"), 1200, 1200, false, false);
        ImageView BackGround = new ImageView(image);
        BackGround.setX(0);
        BackGround.setY(0);
        BackGround.setFitHeight(600);
        BackGround.setFitWidth(600);
        BackGround.setPreserveRatio(true);
        Image image1 = new Image(getClass().getResourceAsStream("b.jpg"), 1200, 1200, false, false);

        ImageView BackGround1 = new ImageView(image1);
        BackGround1.setX(0);
        BackGround1.setY(0);
        BackGround1.setFitHeight(800);
        BackGround1.setFitWidth(800);
        BackGround1.setPreserveRatio(true);
         StackPane root = new StackPane();
    // root.setMargin(bn, new Insets(210, 30, 10, 20));
     //   root.setMargin(data, new Insets(300, 180, 10, 0));
        root.setMargin(b1, new Insets(0, 520, 10, 0));
        root.setMargin(b2, new Insets(0, 390, 10, 0));
        root.setMargin(b3, new Insets(0, 260, 10, 0));
        root.setMargin(b4, new Insets(150, 520, 10, 0));
        root.setMargin(b5, new Insets(150, 390, 10, 0));
        root.setMargin(b6, new Insets(150, 260, 10, 0));
        root.setMargin(b7, new Insets(300, 520, 10, 0));
        root.setMargin(b8, new Insets(300, 390, 10, 0));
        root.setMargin(b9, new Insets(300, 260, 10, 0));
        root.setMargin(b0, new Insets(450, 520, 10, 0));
        root.setMargin(bd, new Insets(450, 390, 10, 0));
        root.setMargin(blus, new Insets(0, 130, 10, 0));
        root.setMargin(multibly, new Insets(300, 130, 10, 0));
        root.setMargin(eqal, new Insets(450, 130, 0, 0));
        root.setMargin(mod, new Insets(0, 0, 10, 0));
        root.setMargin(subtract, new Insets(150, 130, 10, 0));
        root.setMargin(T1, new Insets(20, 20, 200, 200));
        root.setMargin(data, new Insets(10, 120, 110, 120));
        root.setMargin(kos1, new Insets(150, 0, 10, 0));
        root.setMargin(kos2, new Insets(300, 0, 10, 0));
        root.setMargin(division, new Insets(450, 260, 0, 0));
       // root.setMargin(showMyArray, new Insets(100, 180, 300, 0));
       // root.setMargin(back, new Insets(0, 300, 10, 0));//150, 80, 200, 0
         root.getChildren().addAll(BackGround1, BackGround);

        root.getChildren().addAll( b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bd, blus,subtract,multibly,division,mod,T1,data,kos1,kos2,eqal);
         Scene scene = new Scene(root, 600, 600);
 b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                    a.put(T1, data, "1");
         
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

               a.put(T1, data, "2");

            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               
              a.put(T1, data, "3");

            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
                a.put(T1, data, "4");

            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
               a.put(T1, data, "5");

            }
        });
        b6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             
               a.put(T1, data, "6");
            }
        });
        b7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            
               a.put(T1, data, "7");

            }
        });
        b8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
         
               a.put(T1, data, "8");

            }
        });
        b9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            
                a.put(T1, data, "9");

            }
        });
         b0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  
			a.put(T1, data, "0");
                        }});
        bd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

            a.delete(T1, data);
            }

        });
         blus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
                
               a.eshara(T1, data, " + ");
               
            }
        });
          division.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             
                
                   a.eshara(T1, data, " / ");
               
            }
        });
           mod.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a.eshara(T1, data, " % ");
               
            }
        });
            multibly.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             
                
                    a.eshara(T1, data, " * ");
               
            }
        });
             subtract.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               a.eshara(T1, data, " - ");
               
            }
        });
               kos1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             
                
                   a.eshara(T1, data, " ( ");
               
            }
        });
                 kos2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               a.eshara(T1, data, " ) ");
            }
        });
                 
                   eqal.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
      
               // resultNumber.setText("");
                    String infix=data.getText()+T1.getText();
                     data.setText(data.getText()+T1.getText());
                      
                     tesst convert =new tesst(infix,20);
                     String x[]= convert.conToPos();
                     String dataa=x[0];
               for(int y=1;y<x.length;y++){
                        dataa+=" "+x[y];
                    }
               
                     T1.setText(dataa);
                     evaluatingPostfix eva=new evaluatingPostfix(x);
                     int r=eva.evaluating();
                  System.out.println(r);
                    String z = String.valueOf(r);
                    T1.setText(z);

            }
        });
                   
      
        primaryStage.setTitle("Calculator of Rasahd");
        primaryStage.setScene(scene);
        primaryStage.show();
}
}
/* Image imageLevel1 = new Image(getClass().getResourceAsStream("level1.png"), 150, 150, false, false);
        Button level1 = new Button();
        level1.setGraphic(new ImageView(imageLevel1));

        Image imageLevel2 = new Image(getClass().getResourceAsStream("level2.png"), 150, 150, false, false);
        Button level2 = new Button();
        level2.setGraphic(new ImageView(imageLevel2));

        Image imageLevel3 = new Image(getClass().getResourceAsStream("Level3.png"), 150, 150, false, false);
        Button level3 = new Button();
        level3.setGraphic(new ImageView(imageLevel3));

        Image imageArcade = new Image(getClass().getResourceAsStream("arcade.png"), 150, 150, false, false);
        Button arcadeB = new Button();
        arcadeB.setGraphic(new ImageView(imageArcade));
 String x[]= convert.conToPos();
                    String dataa=x[0];
                    for(int y=1;y<x.length;y++){
                        dataa+=" "+x[y];
                    }
                   resultNumber.setText(dataa);
                   data.setText("");*/