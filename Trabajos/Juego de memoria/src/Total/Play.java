package Total;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Play {

    JFrame ventana;
    JPanel ppresentar;
    JLabel fpresentacion;
    JLabel fjuego;
    JLabel bjugar;
    JLabel njugador;
    Random ale;
    JPanel pjuego;
    JLabel cro;
    JLabel mtrz[][];
    int mat[][];
    int matAux[][];
    int panu;
    int pasa;
    int pasb;

    int fnu;
    int fasa;
    int fasb;

    int conts;
    int min;
    int seg;
    int conta;
    int arr;
    int arr1;
    String player;
    Timer tiempo;
    Timer tiempoes;
    Timer tiempoes1;

    public Play() {
        ventana = new JFrame("Juego de cartas de memoria");
        ventana.setSize(800, 800);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setResizable(false);

        ppresentar = new JPanel();
        ppresentar.setSize(ventana.getWidth(), ventana.getHeight());
        ppresentar.setLocation(0, 0);
        ppresentar.setLayout(null);
        ppresentar.setVisible(true);

        fpresentacion = new JLabel();
        fpresentacion.setSize(ventana.getWidth(), ventana.getHeight());
        fpresentacion.setLocation(0, 0);
        fpresentacion.setIcon(new ImageIcon("Imagenes/Tablero.jpg"));
        fpresentacion.setVisible(true);
        ppresentar.add(fpresentacion, 0);

        bjugar = new JLabel();
        bjugar.setSize(300, 300);
        bjugar.setLocation(250, 240);
        bjugar.setIcon(new ImageIcon("Imagenes/boton2.png"));
        bjugar.setVisible(true);
        ppresentar.add(bjugar, 0);

        pjuego = new JPanel();
        pjuego.setSize(ventana.getWidth(), ventana.getHeight());
        pjuego.setLocation(0, 0);
        pjuego.setLayout(null);
        pjuego.setVisible(true);

        //fondo
        fjuego = new JLabel();
        fjuego.setSize(ventana.getWidth(), ventana.getHeight());
        fjuego.setLocation(0, 0);
        fjuego.setIcon(new ImageIcon("Imagenes/inicio.jpg"));
        fjuego.setVisible(true);
        pjuego.add(fjuego, 0);

        //Nombre player
        njugador = new JLabel();
        njugador.setSize(100, 50);
        njugador.setLocation(100, 25);
        njugador.setForeground(Color.BLUE);
        njugador.setVisible(true);
        pjuego.add(njugador, 0);

        cro = new JLabel();
        cro.setSize(100, 50);
        cro.setLocation(ventana.getWidth() - 175, 25);
        cro.setForeground(Color.BLACK);
        cro.setVisible(true);
        pjuego.add(cro, 0);

   
        mat = new int[4][5];
        matAux = new int[4][5];
        ale = new Random();
        this.numberandom();

        mtrz = new JLabel[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mtrz[i][j] = new JLabel();
                mtrz[i][j].setBounds(100 + (j * 116), 75 + (i * 164), 116, 164);
                mtrz[i][j].setIcon(new ImageIcon("Imagenes/" + matAux[i][j] + ".png"));
                mtrz[i][j].setVisible(true);
                pjuego.add(mtrz[i][j], 0);

            }
        }

        min = 0;
        seg = 0;
        tiempo = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                seg++;
                if (seg == 60) {
                    min++;
                    seg = 0;
                }
                cro.setText("Tiempo " + min + ":" + seg);
            }

        });

        //Espera
        conts = 0;
        tiempoes = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                conts++;
            }
        });
        tiempoes.start();
        tiempoes.stop();
        conts = 0;

        arr = 0;
        arr1 = 0;

        conta = 0;
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                mtrz[i][j].addMouseListener(new MouseAdapter() {

                    @Override
                    public void mousePressed(MouseEvent e) {
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 5; l++) {
                                if (e.getSource() == mtrz[k][l]) {
                                    //System.out.println(k+""+l);
                                    if (matAux[k][l] == 0 && conta != 2) {

                                        matAux[k][l] = mat[k][l];
                                        mtrz[k][l].setIcon(new ImageIcon("Imagenes/" + matAux[k][l] + ".png"));
                                        conta++;

                                        fnu = mat[k][l];
                                        fasa = k;
                                        fasb = l;

                                        if (conta == 1) {
                                            panu = mat[k][l];
                                            pasa = k;
                                            pasb = l;

                                        }
                                        tiempoes1 = new Timer(500, new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {

                                                // if(conta==2 && conts==3) {     
                                                if (conta == 2 && arr1 == 0) {
                                                    tiempoes.restart();
                                                    arr1 = 1;
                                                }

                                                if (conta == 2 && conts == 2) {
                                                    tiempoes.stop();
                                                    conts = 0;

                                                    if (matAux[fasa][fasb] == matAux[pasa][pasb]) {
                                                        matAux[fasa][fasb] = -1;
                                                        matAux[pasa][pasb] = -1;
                                                        mtrz[fasa][fasb].setIcon(new ImageIcon("Imagenes/" + matAux[fasa][fasb] + ".png"));
                                                        mtrz[pasa][pasb].setIcon(new ImageIcon("Imagenes/" + matAux[pasa][pasb] + ".png"));
                                                        conta = 0;

                                                        //mensaje
                                                        int contb = 0;
                                                        for (int m = 0; m < 4; m++) {
                                                            for (int n = 0; n < 5; n++) {
                                                                if (matAux[m][n] == -1) {
                                                                    contb++;
                                                                }
                                                            }

                                                        }
                                                        if (contb == 20) {
                                                            tiempo.stop();
                                                            JOptionPane.showMessageDialog(ventana, "Ganaste y tu tiempo empleado es de:" + min + ":" + seg);
                                                            //Vuelvo a iniciar el game
                                                            //numberandom();

                                                            for (int m = 0; m < 4; m++) {
                                                                for (int n = 0; n < 5; n++) {
                                                                    mat[m][n] = 0;
                                                                    matAux[m][n] = 0;
                                                                    mtrz[m][n].setIcon(new ImageIcon("Imagenes/" + matAux[m][n] + ".png"));

                                                                }

                                                            }
                                                            numberandom();

                                                        }

                                                    }

                                                    for (int m = 0; m < 4; m++) {
                                                        for (int n = 0; n < 5; n++) {
                                                            if (matAux[m][n] != 0 && matAux[m][n] != -1) {
                                                                matAux[m][n] = 0;
                                                                mtrz[m][n].setIcon(new ImageIcon("Imagenes/" + matAux[m][n] + ".png"));
                                                                conta = 0;

                                                            }

                                                        }

                                                    }

                                                    tiempoes.stop();
                                                    arr1 = 0;
                                                }
                                            }
                                        });
                                        if (arr == 0) {
                                            tiempoes.start();
                                            arr = 1;
                                        }
                                        if (conta == 2) {
                                            tiempoes1.restart();
                                        }
                                        // }

                                    }

                                }

                            }

                        }

                    }

                });
            }
        }

        bjugar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            
                player = JOptionPane.showInputDialog(ventana, "Jugador:", "Ingrese");
                while (player == null || player.compareTo("Escribe raqui") == 0 || player.compareTo(" ") == 0) {
                    player = JOptionPane.showInputDialog(ventana, "Necesitas ingresar usuariio", "Escribelo");
                }
                njugador.setText("JUGADOR: " + player);
                tiempo.start();
                ppresentar.setVisible(false);
                ventana.add(pjuego);
                pjuego.setVisible(true);
            }
        }
        );

        ventana.add(ppresentar);
        ventana.setVisible(true);

    }

    public void numberandom() {
        int ac = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = 0;

                matAux[i][j] = 0;

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = ale.nextInt(10) + 1;
                do {
                    ac = 0;
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 5; l++) {
                            if (mat[i][j] == mat[k][l]) {
                                ac += 1;
                            }

                        }

                    }

                    if (ac == 3) {
                        mat[i][j] = ale.nextInt(10) + 1;

                    }
                } while (ac == 3);
            }

        }
    }

}
