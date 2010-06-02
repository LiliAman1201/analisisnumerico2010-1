package co.edu.eafit.analisisnumerico.GUI;

import co.edu.eafit.analisisnumerico.framework.Constantes;
import co.edu.eafit.analisisnumerico.framework.GestorAyuda;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GuiDiferenciacion.java
 *
 * Created on 29/05/2010, 03:42:17 PM
 */

/**
 *
 * @author nico
 */
public class GUIDiferenciacion extends javax.swing.JFrame {

    /** Creates new form GuiDiferenciacion */
    public GUIDiferenciacion() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtDelta = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtFuncion = new javax.swing.JTextField();
        lblTamanoMatriz = new javax.swing.JLabel();
        lblTamanoMatriz1 = new javax.swing.JLabel();
        lblTamanoMatriz2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnDosPtosRegresivo = new javax.swing.JButton();
        btnDosPtosProgresivo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTresPuntosRegresivo = new javax.swing.JButton();
        btnTresPuntosProgresivo = new javax.swing.JButton();
        btnTresPuntosCentral = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCincoPuntosRegresivo = new javax.swing.JButton();
        btnCincoPuntosProgresivo = new javax.swing.JButton();
        btnCincoPuntosCentral = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        btnAyuda = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jsalir1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        InfoGeneral = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jDosPuntos = new javax.swing.JMenuItem();
        jTresPuntos = new javax.swing.JMenuItem();
        jCincoPuntos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(Constantes.RUTAIMAGEN))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18));
        jLabel2.setText("An�lisis N�merico Solver");

        txtDelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeltaActionPerformed(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });

        lblTamanoMatriz.setText("Funcion F(x):");

        lblTamanoMatriz1.setText("Valor a interpolar:");

        lblTamanoMatriz2.setText("Delta (h):");

        btnDosPtosRegresivo.setFont(new java.awt.Font("Georgia", 0, 11));
        btnDosPtosRegresivo.setText("Dos puntos Regresivo");
        btnDosPtosRegresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosPtosRegresivoActionPerformed(evt);
            }
        });

        btnDosPtosProgresivo.setFont(new java.awt.Font("Georgia", 0, 11));
        btnDosPtosProgresivo.setText("Dos puntos Progresivo");
        btnDosPtosProgresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosPtosProgresivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDosPtosRegresivo)
                .addGap(18, 18, 18)
                .addComponent(btnDosPtosProgresivo)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDosPtosRegresivo)
                    .addComponent(btnDosPtosProgresivo))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        panel3.addTab("Diferenciacion Dos Puntos", jPanel5);

        btnTresPuntosRegresivo.setText("Tres Puntos Regresivo");
        btnTresPuntosRegresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresPuntosRegresivoActionPerformed(evt);
            }
        });

        btnTresPuntosProgresivo.setText("Tres Puntos Progresivo");
        btnTresPuntosProgresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresPuntosProgresivoActionPerformed(evt);
            }
        });

        btnTresPuntosCentral.setText("Tres Puntos Central");
        btnTresPuntosCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresPuntosCentralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTresPuntosRegresivo)
                        .addGap(18, 18, 18)
                        .addComponent(btnTresPuntosProgresivo))
                    .addComponent(btnTresPuntosCentral))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTresPuntosProgresivo)
                    .addComponent(btnTresPuntosRegresivo))
                .addGap(18, 18, 18)
                .addComponent(btnTresPuntosCentral)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        panel3.addTab("Diferenciacion Tres Puntos", jPanel1);

        btnCincoPuntosRegresivo.setText("Cinco Puntos Regresivo");
        btnCincoPuntosRegresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoPuntosRegresivoActionPerformed(evt);
            }
        });

        btnCincoPuntosProgresivo.setText("Cinco Puntos Progresivo");
        btnCincoPuntosProgresivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoPuntosProgresivoActionPerformed(evt);
            }
        });

        btnCincoPuntosCentral.setText("Cinco Puntos Central");
        btnCincoPuntosCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoPuntosCentralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCincoPuntosRegresivo)
                        .addGap(18, 18, 18)
                        .addComponent(btnCincoPuntosProgresivo))
                    .addComponent(btnCincoPuntosCentral))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCincoPuntosRegresivo)
                    .addComponent(btnCincoPuntosProgresivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCincoPuntosCentral)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        panel3.addTab("Diferenciacion Cinco Puntos", jPanel2);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("Resultado");

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 14));
        jLabel13.setText("M�todos Num�ricos");

        jMenu1.setText("Archivo");

        jsalir1.setText("Salir");
        jsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalir1ActionPerformed(evt);
            }
        });
        jMenu1.add(jsalir1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Acerca de");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        InfoGeneral.setText("Informaci�n General ");
        InfoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoGeneralActionPerformed(evt);
            }
        });
        jMenu3.add(InfoGeneral);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ayudas");

        jDosPuntos.setText("Dos Puntos");
        jDosPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDosPuntosActionPerformed(evt);
            }
        });
        jMenu2.add(jDosPuntos);

        jTresPuntos.setText("Tres Puntos");
        jTresPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTresPuntosActionPerformed(evt);
            }
        });
        jMenu2.add(jTresPuntos);

        jCincoPuntos.setText("Cinco Puntos");
        jCincoPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCincoPuntosActionPerformed(evt);
            }
        });
        jMenu2.add(jCincoPuntos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTamanoMatriz2)
                    .addComponent(lblTamanoMatriz1)
                    .addComponent(lblTamanoMatriz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(441, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textArea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(464, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTamanoMatriz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTamanoMatriz1)
                            .addComponent(btnAyuda)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTamanoMatriz2))
                    .addComponent(btnRegresar))
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void InfoGeneralActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.INFOGENERAL);
}                                           

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
}                                      

    private void jDosPuntosActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.DIFERENCIACION2PUNTOS);
}                                          

    private void jTresPuntosActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.DIFERENCIACION3PUNTOS);
}                                           

    private void jCincoPuntosActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.DIFERENCIACION5PUNTOS);
}                                            

    private void txtDeltaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
}                                        

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
}                                        

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
}                                          

    private void jsalir1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	System.exit(0);
}                                       

    private void btnDosPtosProgresivoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
}                                                    

    private void btnCincoPuntosRegresivoActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
}                                                       

    private void btnDosPtosRegresivoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void btnTresPuntosRegresivoActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void btnTresPuntosProgresivoActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void btnTresPuntosCentralActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void btnCincoPuntosProgresivoActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void btnCincoPuntosCentralActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDiferenciacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JMenuItem InfoGeneral;
    public javax.swing.JButton btnAyuda;
    public javax.swing.JButton btnCincoPuntosCentral;
    public javax.swing.JButton btnCincoPuntosProgresivo;
    public javax.swing.JButton btnCincoPuntosRegresivo;
    public javax.swing.JButton btnDosPtosProgresivo;
    public javax.swing.JButton btnDosPtosRegresivo;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnTresPuntosCentral;
    public javax.swing.JButton btnTresPuntosProgresivo;
    public javax.swing.JButton btnTresPuntosRegresivo;
    public javax.swing.JMenuItem jCincoPuntos;
    public javax.swing.JMenuItem jDosPuntos;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JMenuItem jTresPuntos;
    public javax.swing.JMenuItem jsalir1;
    public javax.swing.JLabel lblTamanoMatriz;
    public javax.swing.JLabel lblTamanoMatriz1;
    public javax.swing.JLabel lblTamanoMatriz2;
    public javax.swing.JTabbedPane panel3;
    public java.awt.TextArea textArea1;
    public javax.swing.JTextField txtDelta;
    public javax.swing.JTextField txtFuncion;
    public javax.swing.JTextField txtValor;
    // End of variables declaration                   

}