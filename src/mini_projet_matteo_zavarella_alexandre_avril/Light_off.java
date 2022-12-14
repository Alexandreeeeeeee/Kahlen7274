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
        //String[][] input = {{"0", "0", "0", "0", "1"}, {"1", "1", "0", "0", "1"}, {"0", "1", "0", "1", "0"}, {"0", "0", "0", "0", "1"}, {"0", "0", "0", "0", "1"}};
        // C'est pour faire un test.
        // on se contante pour l'instant de placer des "0" et "1" pour indiquer si éclairer ou non.
        for (int i = 0; i < 5; i++) { // remplissage de la grille avec des boutons.
            for (int j = 0; j < 5; j++) {

                lights[i][j] = new JButton();
                lights[i][j].addActionListener(this);
                add(lights[i][j]);
                if (Math.random() > 0.5) {
                    lights[i][j].setText("1");
                } else {
                    lights[i][j].setText("0");
                }
                if (lights[i][j].getText() == "0") {
                    lights[i][j].setBackground(Color.black);
                } else {
                    lights[i][j].setBackground(Color.yellow);
                }
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        // actionEvent qui sert à récupérer l'info du bouton.
        // ici si celui ci a été cliqué, on change son état.

        JButton action = (JButton) e.getSource();

        // LISTE DE CONDITIONS GERANTS LE STATUT DU BOUTON QU'ON CLIQUE // 
        if (action == lights[0][0]) {
            if ("0".equals(lights[0][0].getText())) {
                lights[0][0].setText("1");
                lights[0][0].setBackground(Color.yellow);
            } else {
                lights[0][0].setText("0");
                lights[0][0].setBackground(Color.black);
            }
            forward(0, 0);
            down(0, 0);

        } else if (action == lights[0][1]) {
            if (lights[0][1].getText() == "0") {
                lights[0][1].setText("1");
                lights[0][1].setBackground(Color.yellow);
            } else {
                lights[0][1].setText("0");
                lights[0][1].setBackground(Color.black);
            }

            backward(0, 1);
            forward(0, 1);
            down(0, 1);

        } else if (action == lights[0][2]) {
            if (lights[0][2].getText() == "0") {
                lights[0][2].setText("1");
                lights[0][2].setBackground(Color.yellow);
            } else {
                lights[0][2].setText("0");
                lights[0][2].setBackground(Color.black);
            }
            backward(0, 2);
            forward(0, 2);
            down(0, 2);
        } else if (action == lights[0][3]) {
            if (lights[0][3].getText() == "0") {
                lights[0][3].setText("1");
                lights[0][3].setBackground(Color.yellow);
            } else {
                lights[0][3].setText("0");
                lights[0][3].setBackground(Color.black);
            }

            backward(0, 3);
            forward(0, 3);
            down(0, 3);
        } else if (action == lights[0][4]) {
            if (lights[0][4].getText() == "0") {
                lights[0][4].setText("1");
                lights[0][4].setBackground(Color.yellow);

            } else {
                lights[0][4].setText("0");
                lights[0][4].setBackground(Color.black);
            }

            backward(0, 4);
            down(0, 4);
        } else if (action == lights[1][0]) {
            if (lights[1][0].getText() == "0") {
                lights[1][0].setText("1");
                lights[1][0].setBackground(Color.yellow);

            } else {
                lights[1][0].setText("0");
                lights[1][0].setBackground(Color.black);

            }

            up(1, 0);
            down(1, 0);
            forward(1, 0);

        } else if (action == lights[1][1]) {
            if (lights[1][1].getText() == "0") {
                lights[1][1].setText("1");
                lights[1][1].setBackground(Color.yellow);
            } else {
                lights[1][1].setText("0");
                lights[1][1].setBackground(Color.black);
            }

            up(1, 1);
            down(1, 1);
            backward(1, 1);
            forward(1, 1);

        } else if (action == lights[1][2]) {
            if (lights[1][2].getText() == "0") {
                lights[1][2].setText("1");
                lights[1][2].setBackground(Color.yellow);
            } else {
                lights[1][2].setText("0");
                lights[1][2].setBackground(Color.black);
            }

            up(1, 2);
            down(1, 2);
            backward(1, 2);
            forward(1, 2);

        } else if (action == lights[1][3]) {
            if (lights[1][3].getText() == "0") {
                lights[1][3].setText("1");
                lights[1][3].setBackground(Color.yellow);
            } else {
                lights[1][3].setText("0");
                lights[1][3].setBackground(Color.black);
            }

            up(1, 3);
            down(1, 3);
            backward(1, 3);
            forward(1, 3);
        } else if (action == lights[1][4]) {
            if (lights[1][4].getText() == "0") {
                lights[1][4].setText("1");
                lights[1][4].setBackground(Color.yellow);
            } else {
                lights[1][4].setText("0");
                lights[1][4].setBackground(Color.black);
            }

            up(1, 4);
            down(1, 4);
            backward(1, 4);

        } else if (action == lights[2][0]) {
            if (lights[2][0].getText() == "0") {
                lights[2][0].setText("1");
                lights[2][0].setBackground(Color.yellow);
            } else {
                lights[2][0].setText("0");
                lights[2][0].setBackground(Color.black);
            }
            up(2, 0);
            down(2, 0);
            forward(2, 0);

        } else if (action == lights[2][1]) {
            if (lights[2][1].getText() == "0") {
                lights[2][1].setText("1");
                lights[2][1].setBackground(Color.yellow);
            } else {
                lights[2][1].setText("0");
                lights[2][1].setBackground(Color.black);
            }

            up(2, 1);
            down(2, 1);
            backward(2, 1);
            forward(2, 1);

        } else if (action == lights[2][2]) {
            if (lights[2][2].getText() == "0") {
                lights[2][2].setText("1");
                lights[2][2].setBackground(Color.yellow);
            } else {
                lights[2][2].setText("0");
                lights[2][2].setBackground(Color.black);
            }
            up(2, 2);
            down(2, 2);
            backward(2, 2);
            forward(2, 2);
        } else if (action == lights[2][3]) {
            if (lights[2][3].getText() == "0") {
                lights[2][3].setText("1");
                lights[2][3].setBackground(Color.yellow);
            } else {
                lights[2][3].setText("0");
                lights[2][3].setBackground(Color.black);
            }
            up(2, 3);
            down(2, 3);
            backward(2, 3);
            forward(2, 3);
        } else if (action == lights[2][4]) {
            if (lights[2][4].getText() == "0") {
                lights[2][4].setText("1");
                lights[2][4].setBackground(Color.yellow);
            } else {
                lights[2][4].setText("0");
                lights[2][4].setBackground(Color.black);
            }
            up(2, 4);
            down(2, 4);
            backward(2, 4);
        } else if (action == lights[3][0]) {
            if (lights[3][0].getText() == "0") {
                lights[3][0].setText("1");
                lights[3][0].setBackground(Color.yellow);
            } else {
                lights[3][0].setText("0");
                lights[3][0].setBackground(Color.black);
            }
            up(3, 0);
            down(3, 0);
            forward(3, 0);
        } else if (action == lights[3][1]) {
            if (lights[3][1].getText() == "0") {
                lights[3][1].setText("1");
                lights[3][1].setBackground(Color.yellow);
            } else {
                lights[3][1].setText("0");
                lights[3][1].setBackground(Color.black);
            }
            up(3, 1);
            down(3, 1);
            backward(3, 1);
            forward(3, 1);
        } else if (action == lights[3][2]) {
            if (lights[3][2].getText() == "0") {
                lights[3][2].setText("1");
                lights[3][2].setBackground(Color.yellow);
            } else {
                lights[3][2].setText("0");
                lights[3][2].setBackground(Color.black);
            }
            up(3, 2);
            down(3, 2);
            backward(3, 2);
            forward(3, 2);
        } else if (action == lights[3][3]) {
            if (lights[3][3].getText() == "0") {
                lights[3][3].setText("1");
                lights[3][3].setBackground(Color.yellow);
            } else {
                lights[3][3].setText("0");
                lights[3][3].setBackground(Color.black);
            }
            up(3, 3);
            down(3, 3);
            backward(3, 3);
            forward(3, 3);
        } else if (action == lights[3][4]) {
            if (lights[3][4].getText() == "0") {
                lights[3][4].setText("1");
                lights[3][4].setBackground(Color.yellow);
            } else {
                lights[3][4].setText("0");
                lights[3][4].setBackground(Color.black);
            }
            up(3, 4);
            down(3, 4);
            backward(3, 4);
        } else if (action == lights[4][0]) {
            if (lights[4][0].getText() == "0") {
                lights[4][0].setText("1");
                lights[4][0].setBackground(Color.yellow);
            } else {
                lights[4][0].setText("0");
                lights[4][0].setBackground(Color.black);
            }
            up(4, 0);
            forward(4, 0);
        } else if (action == lights[4][1]) {
            if (lights[4][1].getText() == "0") {
                lights[4][1].setText("1");
                lights[4][1].setBackground(Color.yellow);
            } else {
                lights[4][1].setText("0");
                lights[4][1].setBackground(Color.black);
            }
            up(4, 1);
            forward(4, 1);
            backward(4, 1);
        } else if (action == lights[4][2]) {
            if (lights[4][2].getText() == "0") {
                lights[4][2].setText("1");
                lights[4][2].setBackground(Color.yellow);
            } else {
                lights[4][2].setText("0");
                lights[4][2].setBackground(Color.black);
            }
            up(4, 2);
            forward(4, 2);
            backward(4, 2);
        } else if (action == lights[4][3]) {
            if (lights[4][3].getText() == "0") {
                lights[4][3].setText("1");
                lights[4][3].setBackground(Color.yellow);
            } else {
                lights[4][3].setText("0");
                lights[4][3].setBackground(Color.black);

            }
            up(4, 3);
            forward(4, 3);
            backward(4, 3);
        } else if (action == lights[4][4]) {
            if (lights[4][4].getText() == "0") {
                lights[4][4].setText("1");
                lights[4][4].setBackground(Color.yellow);

            } else {
                lights[4][4].setText("0");
                lights[4][4].setBackground(Color.black);
            }

            up(4, 4);

            backward(4, 4);
        }

    }

    // methode permettant de verifier les statut des boutons adjacent
    public void forward(int a, int b) { // DEVANT 
        if ("0".equals(lights[a][b + 1].getText())) {
            lights[a][b + 1].setText("1");
            lights[a][b + 1].setBackground(Color.yellow);
        } else {
            lights[a][b + 1].setText("0");
            lights[a][b + 1].setBackground(Color.black);
        }
    }

    public void backward(int a, int b) { // DERRIERE
        if ("0".equals(lights[a][b - 1].getText())) {
            lights[a][b - 1].setText("1");
            lights[a][b - 1].setBackground(Color.yellow);
        } else {
            lights[a][b - 1].setText("0");
            lights[a][b - 1].setBackground(Color.black);
        }
    }

    public void up(int a, int b) { // EN HAUT 
        if ("0".equals(lights[a - 1][b].getText())) {
            lights[a - 1][b].setText("1");
            lights[a - 1][b].setBackground(Color.yellow);
        } else {
            lights[a - 1][b].setText("0");
            lights[a - 1][b].setBackground(Color.black);
        }
    }

    public void down(int a, int b) { // EN BAS
        if ("0".equals(lights[a + 1][b].getText())) {
            lights[a + 1][b].setText("1");
            lights[a + 1][b].setBackground(Color.yellow);
        } else {
            lights[a + 1][b].setText("0");
            lights[a + 1][b].setBackground(Color.black);
        }
    }

    public void ChangementCouleur() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lights[i][j].getText() == "0") {
                    lights[i][j].setBackground(Color.black);
                } else {
                    lights[i][j].setBackground(Color.yellow);
                }
            }
        }
    }
}
