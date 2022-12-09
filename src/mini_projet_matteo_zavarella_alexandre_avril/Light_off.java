/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet_matteo_zavarella_alexandre_avril;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author matte
 */
public class Light_off extends JFrame{
  
  // attribut de la class
  public static final int W = 400;
  public static final int H = 400;
  JButton[][] lights = new JButton[5][5];
  int COLS = 5, ROWS = 5;
  
  public Light_off()
  {
      super("Light Off"); 
      setSize(W,H);
      setLayout(new GridLayout(5,5));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Scanner kb = new Scanner(System.in);
      String[][] input = {{"0","0","0","0","1"},{"1","1","0","0","1"},{"0","1","0","1","0"},{"0","0","0","0","1"},{"0","0","0","0","1"}};
      for(int i=0;i<5;i++)
       {
         for(int j=0;j<5;j++)
          {

            lights[i][j] = new JButton(); // Initializing all JButton
            //lights[i][j].addActionListener(this); // Registering listener 

            lights[i][j].setText(input[i][j]); // setting text of each 
                                               // button as per input String
            add(lights[i][j]);  // adding JButton to the JFrame

          }
       }

     }

   
}
