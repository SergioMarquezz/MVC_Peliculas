/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author SergioMarquez
 */
public class ViewPeliculas extends javax.swing.JPanel {

    /**
     * Creates new form ViewPeliculas
     */
    public ViewPeliculas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_codigo = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_formato = new javax.swing.JLabel();
        jl_duracion = new javax.swing.JLabel();
        jl_descripcion = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_formato = new javax.swing.JTextField();
        jtf_duracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtexarea_descripcion = new javax.swing.JTextArea();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();

        setLayout(null);

        jl_codigo.setText("Codigo");
        add(jl_codigo);
        jl_codigo.setBounds(30, 30, 70, 20);

        jl_nombre.setText("Nombre");
        add(jl_nombre);
        jl_nombre.setBounds(30, 90, 70, 20);

        jl_formato.setText("Formato");
        add(jl_formato);
        jl_formato.setBounds(30, 130, 80, 20);

        jl_duracion.setText("Duración");
        add(jl_duracion);
        jl_duracion.setBounds(30, 170, 80, 20);

        jl_descripcion.setText("Descripción");
        add(jl_descripcion);
        jl_descripcion.setBounds(30, 220, 100, 20);
        add(jtf_codigo);
        jtf_codigo.setBounds(100, 30, 90, 20);
        add(jtf_nombre);
        jtf_nombre.setBounds(120, 90, 100, 20);
        add(jtf_formato);
        jtf_formato.setBounds(120, 130, 100, 20);
        add(jtf_duracion);
        jtf_duracion.setBounds(120, 170, 100, 20);

        jtexarea_descripcion.setColumns(20);
        jtexarea_descripcion.setRows(5);
        jScrollPane1.setViewportView(jtexarea_descripcion);

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 210, 210, 70);

        jbtn_nuevo.setText("Nuevo");
        add(jbtn_nuevo);
        jbtn_nuevo.setBounds(20, 300, 100, 24);

        jbtn_guardar.setText("Guardar");
        add(jbtn_guardar);
        jbtn_guardar.setBounds(130, 300, 110, 24);

        jbtn_modificar.setText("Modificar");
        add(jbtn_modificar);
        jbtn_modificar.setBounds(250, 300, 100, 24);

        jbtn_eliminar.setText("Eliminar");
        add(jbtn_eliminar);
        jbtn_eliminar.setBounds(130, 340, 110, 24);

        jbtn_primero.setText("|<");
        add(jbtn_primero);
        jbtn_primero.setBounds(240, 70, 60, 24);

        jbtn_ultimo.setText(">|");
        add(jbtn_ultimo);
        jbtn_ultimo.setBounds(310, 70, 60, 24);

        jbtn_anterior.setText("<<");
        add(jbtn_anterior);
        jbtn_anterior.setBounds(240, 110, 60, 24);

        jbtn_siguiente.setText(">>");
        add(jbtn_siguiente);
        jbtn_siguiente.setBounds(310, 110, 60, 24);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_guardar;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    private javax.swing.JLabel jl_codigo;
    private javax.swing.JLabel jl_descripcion;
    private javax.swing.JLabel jl_duracion;
    private javax.swing.JLabel jl_formato;
    private javax.swing.JLabel jl_nombre;
    public javax.swing.JTextArea jtexarea_descripcion;
    public javax.swing.JTextField jtf_codigo;
    public javax.swing.JTextField jtf_duracion;
    public javax.swing.JTextField jtf_formato;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
