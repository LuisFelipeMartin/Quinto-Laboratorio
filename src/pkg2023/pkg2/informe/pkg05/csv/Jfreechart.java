package pkg2023.pkg2.informe.pkg05.csv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class Jfreechart extends javax.swing.JFrame
{
    String a=null;
    int opc=0;
    public Jfreechart() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LisMenu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BotMenu = new javax.swing.JButton();
        TexImportacion = new javax.swing.JTextField();
        BotImportacion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Grafica media fea : 0");

        LisMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Grafico de \"pie\"", "Grafico de barras", "Grafico XY", "Grafico de tiempo" }));
        LisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisMenuActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane2.setEnabled(false);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setEnabled(false);
        jScrollPane2.setViewportView(Tabla);

        BotMenu.setText("Crear Grafico");
        BotMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotMenuActionPerformed(evt);
            }
        });

        TexImportacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TexImportacion.setText("Ingrese el nombre del archivo CSV");
        TexImportacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexImportacionActionPerformed(evt);
            }
        });

        BotImportacion1.setText("Importar Archivo");
        BotImportacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotImportacion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LisMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TexImportacion, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotImportacion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(446, 446, 446))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexImportacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotImportacion1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotMenu))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotImportacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotImportacion1ActionPerformed
        a=TexImportacion.getText();
        DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel();
        Importacion(a,modelo);
        TexImportacion.setText("");
    }//GEN-LAST:event_BotImportacion1ActionPerformed

    private void TexImportacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexImportacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexImportacionActionPerformed

    private void BotMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotMenuActionPerformed
        Graficos(opc);
        opc=0;
    }//GEN-LAST:event_BotMenuActionPerformed

    private void LisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisMenuActionPerformed
        if(LisMenu.getSelectedItem()=="Grafico de \"pie\"")
        {
            opc=1;
        }
        else
        {
            if(LisMenu.getSelectedItem()=="Grafico de barras")
            {
                opc=2;
            }
            else
            {
                if(LisMenu.getSelectedItem()=="Grafico XY")
                {
                    opc=3;
                }
                else
                {
                    if(LisMenu.getSelectedItem()=="Grafico de tiempo")
                    {
                        opc=4;
                    }
                }
            }
        }
    }//GEN-LAST:event_LisMenuActionPerformed
//METODO MAIN
    
    public static void main(String args[]) 
    { 
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Jfreechart().setVisible(true);
            }
        });
    }
//IMPORTACION DE ARCHIVOS CSV
    public static void Importacion(String a,DefaultTableModel modelo)
    {
        File archivo = new File(a+".csv");
        try 
        {
            BufferedReader Lector = new BufferedReader (new FileReader(archivo));
            String PrimeraLinea = Lector.readLine().trim();
            String[] NombreColumnas = PrimeraLinea.split(",");
            modelo.setColumnIdentifiers(NombreColumnas);
            Object[] Linea = Lector.lines().toArray();
            for(int i=0;i<Linea.length;i++)
            {
               String Lineas = Linea[i].toString().trim();
               String[] filaDatos = Lineas.split(",");
               modelo.addRow(filaDatos);
            }
            
        }catch (Exception ex) 
        {
            Logger.getLogger(Jfreechart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
//CREACION DE GRAFICOS
    public static void Graficos(int opc)
    {
        switch(opc)
        {
        case 1: // GRAFICO DE PIE
            DefaultPieDataset Pie = new DefaultPieDataset();
            Pie.setValue("A1", Integer.valueOf(50));
            Pie.setValue("B1", Integer.valueOf(15));
            Pie.setValue("C1", Integer.valueOf(15));
            Pie.setValue("D1", Integer.valueOf(20));
            JFreeChart chart0 = ChartFactory.createPieChart("Hola",Pie,true,true,false);
            try 
            {
                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\USUARIO\\Desktop\\ArchivosCSV0.jpg"), chart0, 500, 300);
            }catch (IOException e)
            {
                System.out.println("Problemas creando el archivo :0");
            }
        break;
        case 2: // GRAFICO DE XY       
            XYSeries XY = new XYSeries("XYGraph");
            XY.add(1, 1);
            XY.add(1, 2);
            XY.add(2, 1);
            XY.add(3, 9);
            XY.add(4, 10);
            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(XY);
            JFreeChart chart1 = ChartFactory.createXYLineChart(
            "Hola","eje x","eje y",dataset,PlotOrientation.VERTICAL,true,true,false);
            try 
            {
                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\USUARIO\\Desktop\\ArchivosCSV1.jpg"), chart1, 500, 300);
            } catch (IOException e) 
            {
                System.out.println("Problemas creando el archivo :0");
            }
        break;
        case 3: // GRAFICO DE BARRAS
            DefaultCategoryDataset Barras = new DefaultCategoryDataset();
            Barras.setValue(6, "Profit", "Jane");
            Barras.setValue(7, "Profit", "Tom");
            Barras.setValue(8, "Profit", "Jill");
            Barras.setValue(5, "Profit", "John");
            Barras.setValue(12, "Profit", "Fred");
            JFreeChart chart2 = ChartFactory.createBarChart("Comparison between Salesman","Salesman", "Profit", Barras, PlotOrientation.VERTICAL,false, true, false);
            try 
            {
                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\USUARIO\\Desktop\\ArchivosCSV2.jpg"), chart2, 500, 300);
            } catch (IOException e) 
            {
                System.out.println("Problemas creando el archivo :0");
            }
        break;
        case 4: // GRAFICO DE TIEMPO
            TimeSeries Tiempo = new TimeSeries("Population", Day.class);
            Tiempo.add(new Day(10, 1, 2004), 100);
            Tiempo.add(new Day(10, 2, 2004), 150);
            Tiempo.add(new Day(10, 3, 2004), 250);
            Tiempo.add(new Day(10, 4, 2004), 275);
            Tiempo.add(new Day(10, 5, 2004), 325);
            Tiempo.add(new Day(10, 6, 2004), 425);
            TimeSeriesCollection dataset1 = new TimeSeriesCollection();
            dataset1.addSeries(Tiempo);
            JFreeChart chart3 = ChartFactory.createTimeSeriesChart("Population of CSC408 Town","Date","Population",dataset1,true,true, false);
            try 
            {
                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\USUARIO\\Desktop\\ArchivosCSV3.jpg"), chart3, 500, 300);
            } catch (IOException e) 
            {
                System.out.println("Problemas creando el archivo :0");
            }
        break;
        default:
            System.out.println("Elige una opcion");
        break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotImportacion1;
    private javax.swing.JButton BotMenu;
    private javax.swing.JComboBox<String> LisMenu;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TexImportacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
