/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuPrincipal.java
 *
 * Created on 17/04/2010, 05:47:11 PM
 */

package co.edu.eafit.analisisnumerico.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.eafit.analisisnumerico.framework.Constantes;
import co.edu.eafit.analisisnumerico.framework.GestorAyuda;
import co.edu.eafit.analisisnumerico.framework.GestorInterfazPrincipal;

/**
 *
 * @author nico
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /** Creates new form MenuPrincipal */
    public MenuPrincipal() {
        initComponents();
        btnEcuacionesNolineales.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GestorInterfazPrincipal.iniciarUnidad1();
			}
		});
        btnSistemasdeEcuaciones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GestorInterfazPrincipal.iniciarSistemasEcuaciones();
			}
		});
        btnGraficador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GestorInterfazPrincipal.iniciarGraficador();
			}
		});
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	panelFondo = new JPanelConFondo();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEcuacionesNolineales = new javax.swing.JButton();
        btnSistemasdeEcuaciones = new javax.swing.JButton();
        btnInterpolacion = new javax.swing.JButton();
        btnDiferenciacion = new javax.swing.JButton();
        btnIntegracion = new javax.swing.JButton();
        btnEcuacionesDiferenciales = new javax.swing.JButton();
        btnGraficador = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jsalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jecuacionesnolineales = new javax.swing.JMenuItem();
        jsistemasdeecuaciones = new javax.swing.JMenuItem();
        jinterpolacion = new javax.swing.JMenuItem();
        jdiferenciacion = new javax.swing.JMenuItem();
        jintegracion = new javax.swing.JMenuItem();
        jecuacionesdiferenciales = new javax.swing.JMenuItem();
        jgraficador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        InfoGeneral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setText("An�lisis N�merico ");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione el tipo de ecuaci�n a solucionar.");

        btnEcuacionesNolineales.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnEcuacionesNolineales.setText("Ecuaciones No Lineales");
        btnEcuacionesNolineales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEcuacionesNolinealesActionPerformed(evt);
            }
        });

        btnSistemasdeEcuaciones.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnSistemasdeEcuaciones.setText("Sistemas de Ecuaciones");
        btnSistemasdeEcuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemasdeEcuacionesActionPerformed(evt);
            }
        });

        btnInterpolacion.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnInterpolacion.setText("Interpolacion");
        btnInterpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolacionActionPerformed(evt);
            }
        });

        btnDiferenciacion.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnDiferenciacion.setText("Diferenciacion");
        btnDiferenciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiferenciacionActionPerformed(evt);
            }
        });

        btnIntegracion.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnIntegracion.setText("Integracion");
        btnIntegracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegracionActionPerformed(evt);
            }
        });

        btnEcuacionesDiferenciales.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnEcuacionesDiferenciales.setText("Ecuaciones Diferenciales");
        btnEcuacionesDiferenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEcuacionesDiferencialesActionPerformed(evt);
            }
        });

        btnGraficador.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnGraficador.setText("Graficador");
        btnGraficador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficadorActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");
        
        
        jsalir.setText("Salir");
        jsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalirActionPerformed(evt);
            }
        });
        jMenu1.add(jsalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jecuacionesnolineales.setText("Ecuaciones No Lineales");
        jecuacionesnolineales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jecuacionesnolinealesActionPerformed(evt);
            }
        });
        jMenu2.add(jecuacionesnolineales);

        jsistemasdeecuaciones.setText("Sistemas de Ecuaciones");
        jsistemasdeecuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsistemasdeecuacionesActionPerformed(evt);
            }
        });
        jMenu2.add(jsistemasdeecuaciones);

        jinterpolacion.setText("Interpolacion");
        jinterpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinterpolacionActionPerformed(evt);
            }
        });
        jMenu2.add(jinterpolacion);

        jdiferenciacion.setText("Diferenciacion");
        jdiferenciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdiferenciacionActionPerformed(evt);
            }
        });
        jMenu2.add(jdiferenciacion);

        jintegracion.setText("Integracion");
        jintegracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jintegracionActionPerformed(evt);
            }
        });
        jMenu2.add(jintegracion);

        jecuacionesdiferenciales.setText("Ecuaciones Diferenciales");
        jecuacionesdiferenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jecuacionesdiferencialesActionPerformed(evt);
            }
        });
        jMenu2.add(jecuacionesdiferenciales);

        jgraficador.setText("Graficador");
        jgraficador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jgraficadorActionPerformed(evt);
            }
        });
        
        jMenu2.add(jgraficador);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de");

        InfoGeneral.setText("Informaci�n General ");
        InfoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoGeneralActionPerformed(evt);
            }
        });
        jMenu3.add(InfoGeneral);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
        		panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)        
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInterpolacion,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGraficador,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEcuacionesNolineales,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSistemasdeEcuaciones,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEcuacionesDiferenciales,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIntegracion,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDiferenciacion,javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
        		panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiferenciacion)
                    .addComponent(btnEcuacionesNolineales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSistemasdeEcuaciones)
                    .addComponent(btnIntegracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInterpolacion)
                    .addComponent(btnEcuacionesDiferenciales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGraficador)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        
        ////////////////////////////////////////////////////////////////////////////////
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
)))
  ))
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)    
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)    
            )
        );
       
        ((JPanelConFondo) panelFondo).setImagen("/co/edu/eafit/analisisnumerico/GUI/Logo.JPG");
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalirActionPerformed
        System.exit(0);
}//GEN-LAST:event_jsalirActionPerformed

    private void InfoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoGeneralActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.INFOGENERAL);
}//GEN-LAST:event_InfoGeneralActionPerformed

    private void jecuacionesdiferencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jecuacionesdiferencialesActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.ECUACIONESDIFERENCIALES);
}//GEN-LAST:event_jecuacionesdiferencialesActionPerformed

    private void jintegracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jintegracionActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.INTEGRACION);
}//GEN-LAST:event_jintegracionActionPerformed

    private void jdiferenciacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdiferenciacionActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.DIFERENCIACION);
}//GEN-LAST:event_jdiferenciacionActionPerformed

    private void jinterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinterpolacionActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.INTERPOLACION);
}//GEN-LAST:event_jinterpolacionActionPerformed

    private void jsistemasdeecuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsistemasdeecuacionesActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.SISTEMASDEECUACIONES);
}//GEN-LAST:event_jsistemasdeecuacionesActionPerformed

    private void jecuacionesnolinealesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jecuacionesnolinealesActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.ECUACIONESNOLINEALES);
}//GEN-LAST:event_jecuacionesnolinealesActionPerformed

    private void jgraficadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jecuacionesnolinealesActionPerformed
    	GestorAyuda.getInstance().mostrarAyudaMetodo(Constantes.GRAFICADOR);
}//GEN-LAST:event_jecuacionesnolinealesActionPerformed

    private void btnEcuacionesNolinealesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEcuacionesNolinealesActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnEcuacionesNolinealesActionPerformed

    private void btnSistemasdeEcuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemasdeEcuacionesActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnSistemasdeEcuacionesActionPerformed

    private void btnInterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolacionActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnInterpolacionActionPerformed

    private void btnDiferenciacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiferenciacionActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnDiferenciacionActionPerformed

    private void btnIntegracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegracionActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnIntegracionActionPerformed

    private void btnEcuacionesDiferencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEcuacionesDiferencialesActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnEcuacionesDiferencialesActionPerformed

    private void btnGraficadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficadorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnGraficadorActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InfoGeneral;
    private javax.swing.JButton btnDiferenciacion;
    private javax.swing.JButton btnEcuacionesDiferenciales;
    private javax.swing.JButton btnEcuacionesNolineales;
    private javax.swing.JButton btnGraficador;
    private javax.swing.JButton btnIntegracion;
    private javax.swing.JButton btnInterpolacion;
    private javax.swing.JButton btnSistemasdeEcuaciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jdiferenciacion;
    private javax.swing.JMenuItem jecuacionesdiferenciales;
    private javax.swing.JMenuItem jecuacionesnolineales;
    private javax.swing.JMenuItem jgraficador;
    private javax.swing.JMenuItem jintegracion;
    private javax.swing.JMenuItem jinterpolacion;
    private javax.swing.JMenuItem jsalir;
    private javax.swing.JMenuItem jsistemasdeecuaciones;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables

}
