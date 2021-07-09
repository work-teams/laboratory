/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio05;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krypt97
 */
public class InterfazGrafica extends javax.swing.JFrame {

    Instituto miInstitutoLineal = new Instituto();
    Instituto miInstitutoCuadratica = new Instituto();
    Instituto miInstitutoDobleDireccion = new Instituto();
    Instituto miInstitutoAnidados = new Instituto();
    Instituto miInstitutoEncadenamineto = new Instituto();

    int codigo[] = {100820, 100120, 200110, 204530, 100150, 100012, 100213, 100250, 100540, 100420};
    String nombre[] = {"Juan Rosales", "Ana Ramirez", "Rosa Huapaya", "Carlos Arana", "Raul Gonzales", "Pedro Mamani", "Rosario Paredes", "Martha Huaman", "Saul Espino", "Karen Mendiola"};
    float pension[] = {320, 400, 300, 400, 350, 320, 450, 320, 450, 300};

    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();

        for (int i = 0; i < codigo.length; i++) {
            //REASIGNACION LINEAL
            miInstitutoLineal.insertarLineal(codigo[i], nombre[i], pension[i]);
            
            //REASIGNACION CUADRATICA
            miInstitutoCuadratica.insertarCuadratica(codigo[i], nombre[i], pension[i]);
            
            //miInstitutoDobleDireccion.insertar(codigo[i], nombre[i], pension[i]);
            
            //REASIGNACION ANIDADOS
            miInstitutoAnidados.insertarAnidados(codigo[i], nombre[i], pension[i]);
            
            //miInstitutoEncadenamineto.insertar(codigo[i], nombre[i], pension[i]);
        }

        //REASIGNACION LINEAL
        tablaLineal.setModel(setearTabla(miInstitutoLineal));
        
        //REASIGNACION CUADRATICA
        tablaCuadratica.setModel(setearTabla(miInstitutoCuadratica));
        
        //tablaDobleDireccion.setModel(setearTabla(miInstitutoDobleDireccion));
        tablaAnidados.setModel(setearTablaAnidados(miInstitutoAnidados));
        //tablaEncadenamiento.setModel(setearTabla(miInstitutoEncadenamineto));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        LINEAL = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaLineal = new javax.swing.JTable();
        CUADRATICA = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCuadratica = new javax.swing.JTable();
        ANIDADOS = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaAnidados = new javax.swing.JTable();
        DOBLEDIRECCION = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaDobleDireccion = new javax.swing.JTable();
        ENCADENAMIENTO = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaEncadenamiento = new javax.swing.JTable();
        FORMULARIO = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPension = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LABORATORIO 05 - HASHES");

        jPanel1.setLayout(new java.awt.BorderLayout());

        LINEAL.setPreferredSize(new java.awt.Dimension(455, 426));
        LINEAL.setLayout(new java.awt.BorderLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel15.setLayout(new java.awt.BorderLayout());

        tablaLineal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaLineal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICION", "CODIGO", "NOMBRE", "PENSION"
            }
        ));
        tablaLineal.setRowHeight(21);
        jScrollPane5.setViewportView(tablaLineal);

        jPanel15.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        LINEAL.add(jPanel15, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("LINEAL", LINEAL);

        CUADRATICA.setPreferredSize(new java.awt.Dimension(455, 426));
        CUADRATICA.setLayout(new java.awt.BorderLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel17.setLayout(new java.awt.BorderLayout());

        tablaCuadratica.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaCuadratica.setForeground(new java.awt.Color(255, 0, 51));
        tablaCuadratica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICION", "CODIGO", "NOMBRE", "PENSION"
            }
        ));
        tablaCuadratica.setRowHeight(21);
        jScrollPane6.setViewportView(tablaCuadratica);

        jPanel17.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        CUADRATICA.add(jPanel17, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("CUADRATICA", CUADRATICA);

        ANIDADOS.setPreferredSize(new java.awt.Dimension(455, 426));
        ANIDADOS.setLayout(new java.awt.BorderLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel19.setLayout(new java.awt.BorderLayout());

        tablaAnidados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaAnidados.setForeground(new java.awt.Color(51, 102, 0));
        tablaAnidados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICION", "CODIGO 01", "CODIGO 02", "CODIGO 03"
            }
        ));
        tablaAnidados.setRowHeight(21);
        jScrollPane8.setViewportView(tablaAnidados);

        jPanel19.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        ANIDADOS.add(jPanel19, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("ANIDADOS", ANIDADOS);

        DOBLEDIRECCION.setPreferredSize(new java.awt.Dimension(455, 426));
        DOBLEDIRECCION.setLayout(new java.awt.BorderLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel18.setLayout(new java.awt.BorderLayout());

        tablaDobleDireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaDobleDireccion.setForeground(new java.awt.Color(51, 153, 255));
        tablaDobleDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICION", "CODIGO", "NOMBRE", "PENSION"
            }
        ));
        tablaDobleDireccion.setRowHeight(21);
        jScrollPane7.setViewportView(tablaDobleDireccion);

        jPanel18.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        DOBLEDIRECCION.add(jPanel18, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("DOBLE DIRECCIÓN", DOBLEDIRECCION);

        ENCADENAMIENTO.setPreferredSize(new java.awt.Dimension(455, 426));
        ENCADENAMIENTO.setLayout(new java.awt.BorderLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel20.setLayout(new java.awt.BorderLayout());

        tablaEncadenamiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaEncadenamiento.setForeground(new java.awt.Color(204, 0, 204));
        tablaEncadenamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICION", "CODIGO", "NOMBRE", "PENSION"
            }
        ));
        tablaEncadenamiento.setRowHeight(21);
        jScrollPane9.setViewportView(tablaEncadenamiento);

        jPanel20.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        ENCADENAMIENTO.add(jPanel20, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("ENCADENAMIENTO", ENCADENAMIENTO);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        FORMULARIO.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel13.setText("CODIGO:");

        jLabel14.setText("NOMBRE:");

        jLabel15.setText("PENSIÓN:");

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar(evt);
            }
        });

        javax.swing.GroupLayout FORMULARIOLayout = new javax.swing.GroupLayout(FORMULARIO);
        FORMULARIO.setLayout(FORMULARIOLayout);
        FORMULARIOLayout.setHorizontalGroup(
            FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FORMULARIOLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addComponent(txtPension))
                .addGap(35, 35, 35)
                .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        FORMULARIOLayout.setVerticalGroup(
            FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FORMULARIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FORMULARIOLayout.createSequentialGroup()
                        .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCodigo))
                        .addGap(6, 6, 6))
                    .addComponent(btnInsertar))
                .addGap(22, 22, 22)
                .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(23, 23, 23)
                .addGroup(FORMULARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(23, 23, 23))
        );

        jPanel1.add(FORMULARIO, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar
        // TODO add your handling code here:
        try {
            String cod = txtCodigo.getText();
            String cad = miInstitutoLineal.convertirEntero(cod);
            int codigo = Integer.parseInt(cad);
            String nombre = txtNombre.getText().toUpperCase();
            float pension = Float.parseFloat(txtPension.getText());
            
            //REASIGNACION LINEAL
            miInstitutoLineal.insertarLineal(codigo, nombre, pension);
            tablaLineal.setModel(setearTabla(miInstitutoLineal));
            
            //REASIGNACION CUADRATICA
            miInstitutoCuadratica.insertarCuadratica(codigo, nombre, pension);
            tablaCuadratica.setModel(setearTabla(miInstitutoCuadratica));
            
            //REASIGNACION ANIDADOS
            miInstitutoAnidados.insertarAnidados(codigo, nombre, pension);
            tablaAnidados.setModel(setearTablaAnidados(miInstitutoAnidados));
            
        } catch (Exception e) {
            limpiarTodosLosCampos();
            errorOcurrido();
        }
        limpiarManteniendoCampoCodigo();
    }//GEN-LAST:event_insertar

    private void buscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            
            //REASIGNACION LINEAL
            int pos1 = miInstitutoLineal.buscarLineal(codigo);
            if (pos1 != -1) {
                String code1 = "" + miInstitutoLineal.getCodigoDelAlumno(pos1);
                String name1 = "" + miInstitutoLineal.getNombreDelAlumno(pos1);
                String money1 = "" + miInstitutoLineal.getPensionDelAlumno(pos1);
                JOptionPane.showMessageDialog(null, "ENCONTRADO EN LA POSICIÓN: " + pos1 + "\nUTILIZANDO REASINGNACIÓN POR PRUEBA LINEAL\n"
                        + "\nCodigo: " + code1 + "\nNombre: " + name1 + "\nPension: " + money1);
            } else {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }
            
            //REASIGNACION CUADRATICA
            int pos2 = miInstitutoCuadratica.buscarCuadratica(codigo);
            if (pos2 != -1) {
                String code2 = "" + miInstitutoCuadratica.getCodigoDelAlumno(pos2);
                String name2 = "" + miInstitutoCuadratica.getNombreDelAlumno(pos2);
                String money2 = "" + miInstitutoCuadratica.getPensionDelAlumno(pos2);
                JOptionPane.showMessageDialog(null, "ENCONTRADO EN LA POSICIÓN: " + pos2 + "\nUTILIZANDO REASINGNACIÓN CUADRÁTICA\n"
                        + "\nCodigo: " + code2 + "\nNombre: " + name2 + "\nPension: " + money2);
            } else {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }
            
            //REASIGNACION ANIDADOS
            int[] pos3 = miInstitutoAnidados.buscarAnidados(codigo);
            if (pos3[0] != -1) {
                String code3 = "" + miInstitutoAnidados.getCodigoDelAlumnoMatriz(pos3[0], pos3[1]);
                String name3 = "" + miInstitutoAnidados.getNombreDelAlumnoMatriz(pos3[0], pos3[1]);
                String money3 = "" + miInstitutoAnidados.getPensionDelAlumnoMatriz(pos3[0], pos3[1]);
                JOptionPane.showMessageDialog(null, "ENCONTRADO EN LA POSICIÓN: [" + pos3[0] + " , " + (pos3[1]+1) + "]\nUTILIZANDO REASINGNACIÓN  POR ARREGLOS ANIDADOS\n"
                        + "\nCodigo: " + code3 + "\nNombre: " + name3 + "\nPension: " + money3);
            } else {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }
            
        } catch (Exception e) {
            errorOcurrido();
        }
    }//GEN-LAST:event_buscar

    private void eliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            
            //REASIGNACION LINEAL
            int pos1 = miInstitutoLineal.buscarLineal(codigo);
            miInstitutoLineal.eliminarUniversal(pos1);
            tablaLineal.setModel(setearTabla(miInstitutoLineal));
            
            //REASIGNACION CUADRATICA
            int pos2 = miInstitutoCuadratica.buscarCuadratica(codigo);
            miInstitutoCuadratica.eliminarUniversal(pos2);
            tablaCuadratica.setModel(setearTabla(miInstitutoCuadratica));
            
            //REASIGNACION ANIDADOS
            int[] pos3 = miInstitutoAnidados.buscarAnidados(codigo);
            miInstitutoAnidados.eliminarAnidados(pos3);
            tablaAnidados.setModel(setearTablaAnidados(miInstitutoAnidados));

        } catch (Exception e) {
            errorOcurrido();
        }
        limpiarTodosLosCampos();
    }//GEN-LAST:event_eliminar

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    private DefaultTableModel setearTabla(Instituto miInstituto) {
        String[] columnas = {"POSICION", "CÓDIGO", "NOMBRE", "PENSION"};
        Object[][] misDatos = new Object[miInstituto.getNumeroDeAlumnos()][4];
        for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++) {
            misDatos[i][0] = i;
            misDatos[i][1] = miInstituto.getCodigoDelAlumno(i);
            misDatos[i][2] = miInstituto.getNombreDelAlumno(i);
            misDatos[i][3] = miInstituto.getPensionDelAlumno(i);
        }
        return new DefaultTableModel(misDatos, columnas);
    }
    
    private DefaultTableModel setearTablaAnidados(Instituto miInstituto) {
        String[] columnas = {"POSICION", "CÓDIGO 01", "CÓDIGO 02", "CÓDIGO 03"};
        Object[][] misDatos = new Object[miInstituto.getNumeroDeAlumnos()][4];
        for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++) {
            misDatos[i][0] = i;
            misDatos[i][1] = miInstituto.getCodigoDelAlumnoMatriz(i, 0);
            misDatos[i][2] = miInstituto.getCodigoDelAlumnoMatriz(i, 1);
            misDatos[i][3] = miInstituto.getCodigoDelAlumnoMatriz(i, 2);
        }
        return new DefaultTableModel(misDatos, columnas);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ANIDADOS;
    private javax.swing.JPanel CUADRATICA;
    private javax.swing.JPanel DOBLEDIRECCION;
    private javax.swing.JPanel ENCADENAMIENTO;
    private javax.swing.JPanel FORMULARIO;
    private javax.swing.JPanel LINEAL;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaAnidados;
    private javax.swing.JTable tablaCuadratica;
    private javax.swing.JTable tablaDobleDireccion;
    private javax.swing.JTable tablaEncadenamiento;
    private javax.swing.JTable tablaLineal;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPension;
    // End of variables declaration//GEN-END:variables

    private void limpiarTodosLosCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPension.setText("");
        txtCodigo.requestFocus();
    }
    
    private void limpiarManteniendoCampoCodigo() {
        txtNombre.setText("");
        txtPension.setText("");
        txtCodigo.requestFocus();
    }
    
    private void errorOcurrido() {
        JOptionPane.showMessageDialog(null, "ALGÚN PARAMETRO ENVIADO NO ES CORRECTO\n POR FAVOR VUELVA A INTENTAR");
    }
}
