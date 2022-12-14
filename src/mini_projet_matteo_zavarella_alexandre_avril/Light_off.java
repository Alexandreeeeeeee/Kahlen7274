package mini_projet_matteo_zavarella_alexandre_avril;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Light_off extends JFrame implements ActionListener {

    // attribut de la class
    public static final int W = 400; // taille des bouton.
    public static final int H = 400;
    JButton[][] lights = new JButton[5][5]; // grille de 5 par 5 
    int COLS = 5, ROWS = 5;

    public Light_off() {
        super("Light Off");
        setSize(W, H);
        setLayout(new GridLayout(5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner kb = new Scanner(System.in);
        String[][] input = {{"0", "0", "0", "0", "1"}, {"1", "1", "0", "0", "1"}, {"0", "1", "0", "1", "0"}, {"0", "0", "0", "0", "1"}, {"0", "0", "0", "0", "1"}};
        // on se contante pour l'instant de placer des "0" et "1" pour indiquer si éclairer ou non.
        for (int i = 0; i < 5; i++) { // remplissage de la grille avec des boutons.
            for (int j = 0; j < 5; j++) {
                lights[i][j] = new JButton();
                lights[i][j].addActionListener(this);
                lights[i][j].setText(input[i][j]); // on ajout les "0" et "1".
                add(lights[i][j]);
            }
        }
    }

    public void actionPerformed(ActionEvent e) { // actionEvent qui sert à récupérer l'info du bouton.
        // ici si celui ci a été cliqué.
        JButton action = (JButton) e.getSource();
        if (action == lights[0][0]) {
            if ("0".equals(lights[0][0].getText())) {
                lights[0][0].setText("1");
            } else {
                lights[0][0].setText("0");
            }
            // edgeToggle(0,0,action);
            forward(0, 0);
            down(0, 0);

        } else if (action == lights[0][1]) {
            if (lights[0][1].getText() == "0") {
                lights[0][1].setText("1");
            } else {
                lights[0][1].setText("0");
            }

            backward(0, 1);
            forward(0, 1);
            down(0, 1);
        } else if (action == lights[0][2]) {
            if (lights[0][2].getText() == "0") {
                lights[0][2].setText("1");
            } else {
                lights[0][2].setText("0");
            }
            // edgeToggle(0,2,action);
            backward(0, 2);
            down(0, 2);
        } else if (action == lights[1][0]) {
            if (lights[1][0].getText() == "0") {
                lights[1][0].setText("1");
            } else {
                lights[1][0].setText("0");
            }

            up(1, 0);
            down(1, 0);
            forward(1, 0);
        } else if (action == lights[1][1]) {
            if (lights[1][1].getText() == "0") {
                lights[1][1].setText("1");
            } else {
                lights[1][1].setText("0");
            }

            up(1, 1);
            down(1, 1);
            backward(1, 1);
            forward(1, 1);
        } else if (action == lights[1][2]) {
            if (lights[1][2].getText() == "0") {
                lights[1][2].setText("1");
            } else {
                lights[1][2].setText("0");
            }

            up(1, 2);
            down(1, 2);
            backward(1, 2);
        } else if (action == lights[2][0]) {
            if (lights[2][0].getText() == "0") {
                lights[2][0].setText("1");
            } else {
                lights[2][0].setText("0");
            }
            // edgeToggle(2,0,action);
            up(2, 0);
            forward(2, 0);

        } else if (action == lights[2][1]) {
            if (lights[2][1].getText() == "0") {
                lights[2][1].setText("1");
            } else {
                lights[2][1].setText("0");
            }

            up(2, 1);
            backward(2, 1);
            forward(2, 1);
        } else if (action == lights[2][2]) {
            if (lights[2][2].getText() == "0") {
                lights[2][2].setText("1");
            } else {
                lights[2][2].setText("0");
            }
            // edgeToggle(2,2,action);
            up(2, 2);
            backward(2, 2);
        }
    }

    // methode permettant de verifier les statut des boutons adjacent
    public void forward(int a, int b) {
        if ("0".equals(lights[a][b + 1].getText())) {
            lights[a][b + 1].setText("1");
        } else {
            lights[a][b + 1].setText("0");
        }
    }

    public void backward(int a, int b) {
        if ("0".equals(lights[a][b - 1].getText())) {
            lights[a][b - 1].setText("1");
        } else {
            lights[a][b - 1].setText("0");
        }
    }

    public void up(int a, int b) {
        if ("0".equals(lights[a - 1][b].getText())) {
            lights[a - 1][b].setText("1");
        } else {
            lights[a - 1][b].setText("0");
        }
    }

    public void down(int a, int b) {
        if ("0".equals(lights[a + 1][b].getText())) {
            lights[a + 1][b].setText("1");
        } else {
            lights[a + 1][b].setText("0");
        }
    }

}
