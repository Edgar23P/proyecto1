import java.awt.*;
import javax.swing.*;

public EjercicioGrid{
  public static void main(String args[]){
    JFrame frame =new JFrame("hecho por edgar");
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    //crear layout
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridBagLayout());

    GridBagConstraints gbc =new GridBagConstraints();

    gbc.gridx=0;
    gbc.gridy=0;
    contaner.add(new JButton("boton 1"),gbc);


    frame.pack();
    frame.setVisible(true);

  }






}
