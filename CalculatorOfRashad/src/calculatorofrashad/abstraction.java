/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorofrashad;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author pc
 */
public class abstraction {

    public void put(TextField T1, TextField data, String y1) {
        if (T1.getText().equals(" ( ") || T1.getText().equals(" ) ") || T1.getText().equals("") || T1.getText().equals(" * ") || T1.getText().equals(" / ") || T1.getText().equals(" % ") || T1.getText().equals(" + ") || T1.getText().equals(" - ")) {

            if (T1.getText().equals(" ( ") || T1.getText().equals(" ) ") || T1.getText().equals(" * ") || T1.getText().equals(" / ") || T1.getText().equals(" % ") || T1.getText().equals(" + ") || T1.getText().equals(" - ")) {
                data.setText(data.getText() + T1.getText());
                T1.setText(y1);
            } else {
                T1.setText(y1);
            }
        } else {
            String x = T1.getText();
            int y = Integer.valueOf(x);
            int y2 = Integer.valueOf(y1);
            y = y * 10 + y2;
            String z = String.valueOf(y);
            T1.setText(z);

        }

    }

    public void zero(TextField T1, TextField data, String y1) {
        if (T1.getText().equals(" ( ") || T1.getText().equals(" ) ") || T1.getText().equals("") || T1.getText().equals(" * ") || T1.getText().equals(" / ") || T1.getText().equals(" % ") || T1.getText().equals(" + ") || T1.getText().equals(" - ")) {

            T1.setText("0");
        } else {
            String x = T1.getText();
            int y = Integer.valueOf(x);
            y = y * 10 + 0;
            String z = String.valueOf(y);
            T1.setText(z);

        }

    }
     public void eshara(TextField T1, TextField data, String y1) {
     data.setText(data.getText()+T1.getText());
                    T1.setText(y1);

    }
     
     
         public void delete(TextField T1, TextField data){
                    if(T1.getText().equals("  ")||T1.getText().equals(" ( ")||T1.getText().equals(" ) ")||T1.getText().equals(" * ")||T1.getText().equals(" / ")||T1.getText().equals(" % ")||T1.getText().equals(" + ")||T1.getText().equals(" - "))
                    {
                        T1.setText(" ");
                    }
                    else
                    {String x = T1.getText();
                int y = Integer.valueOf(x);

                y = y / 10;

                String z = String.valueOf(y);
                T1.setText(z);
                if (y == 0) {
                    T1.setText("");
                }
                    }
         }
}
