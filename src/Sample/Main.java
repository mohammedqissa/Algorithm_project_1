package Sample;

/**
 * Created by mohammedissa on 4/2/16.
 */
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.IOException;



        import javafx.scene.control.Alert;
        import javafx.stage.FileChooser;

        import javax.swing.*;
        import javax.swing.table.DefaultTableModel;
        import java.awt.event.ActionEvent;
        import java.io.*;
        import java.util.ArrayList;


public class Main extends javax.swing.JFrame {

    TravelAgent[] agents;
    int nbAgents;
    int bestAgentNb;

    String[] destination;
    int[] expected;
    int max = 0;
    int nD=0;

    int[][] cost;
    int[][] B;





    public Main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        getAgents = new javax.swing.JButton();
        destinations = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 199, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Agents");
        setBounds(new java.awt.Rectangle(250, 250, 0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Travel Agents"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        getAgents.setText("Load Informaion");
        getAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    getAgentsActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        destinations.setText("Get Best Agent");
        destinations.setEnabled(false);
        destinations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationsActionPerformed(evt);
            }


        });

        jLabel1.setText("Best Agent");

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(getAgents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(destinations, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(getAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(destinations, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Xingkai SC", 1, 18)); // NOI18N
        jLabel3.setText("Powered By : Mohammed Issa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void destinationsActionPerformed(ActionEvent evt) {

        ArrayList<TravelAgent> best = new ArrayList<>();
        for (int i = 0 ; i < agents.length;i++){
            lcs(agents[i],destination);
            printPath(B,cost,agents[i].nbFlights,destination.length,i);

        }

        for (int i = 0 ; i < agents.length;i++)
            if (agents[i].m==max)
                best.add(agents[i]);

        Object[] columnsData = new Object[destination.length+1];
        Object[][] rowsData = new Object[best.size()+2][destination.length+1];


        columnsData[0] = "Agents\\City";

        for (int i = 1;i<columnsData.length;i++)
            columnsData[i] = destination[i-1];
//            columnsData[i] = "City"+i;

        for (int i = 0 ; i < best.size();i++){
            rowsData[i+1][0] = best.get(i).getName();
            for (int j = 1 ; j<destination.length+1;j++){

                if (best.get(i).getFlight(j-1) != null){
                    rowsData[i+1][j] = best.get(i).getPrice(j-1);
                    continue;
                }

                rowsData[i+1][j] = "X";

            }
        }

        rowsData[0][0] = "user expectation";

        for (int i = 0 ; i < expected.length;i++)
            rowsData[0][i+1] = expected[i];



        int min = Integer.MAX_VALUE;
        String name = "";

        for (int i = 0 ; i < best.size();i++) {

            int sum = 0;
            for (int j = 0; j<expected.length;j++){
                sum += best.get(i).getPrice(j)-expected[j];

            }
            if(sum <= min){
                min = sum;
                name = best.get(i).getName();
            }

            jLabel2.setText("     "+name);

        }


        for(int i=0;i<best.get(0).flights.length;i++){

            String minName = best.get(0).name;
            int minPrice=Integer.MAX_VALUE;

            for(int j=0;j<best.size();j++){
                if(best.get(j).prices[i] <= minPrice && best.get(j).prices[i] != 0)
                {
                    minPrice=best.get(j).prices[i];
                    minName=best.get(j).name;
                }

            }

            rowsData[rowsData.length-1][i+1]=minName;
        }

        rowsData[rowsData.length-1][0] = "Best Price";



        jTable1.setModel(new DefaultTableModel(rowsData,columnsData));


    }


    private void getAgentsActionPerformed(java.awt.event.ActionEvent evt) throws IOException {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        JFileChooser chooser = new JFileChooser();
        File f = new File(new File("filename.txt").getCanonicalPath());
        chooser.setSelectedFiles(new File[]{f});
        chooser.showDialog(new JFrame(""), null);
        File file = chooser.getSelectedFile();
        BufferedReader scanner = new BufferedReader(new FileReader(file));




        try {

            String fileName = file.getName();
            if (!fileName.endsWith("txt") && !fileName.endsWith("csv")) {
                System.out.println(fileName);
                throw new FileNotFoundException();
            }


            while (( scanner.readLine()) != null)
                nbAgents++;

            nbAgents--;
            scanner.close();

            scanner = new BufferedReader(new FileReader(file));
            agents = new TravelAgent[nbAgents];

            String d = scanner.readLine();
            String[] dd = d.split("[,:]");
            destination = new String[dd.length/2];
            expected = new int[dd.length/2];

            for (int i = 0 ; i < dd.length;i++){
                if(i%2 == 0)
                    destination[i/2] = dd[i];
                else
                    expected[i/2] = Integer.parseInt(dd[i]);
            }


            String[] tmp ;
            String[] flights ;
            int[] prices;
            String name;
            String s;

            for (int i = 0; i < agents.length; i++) {
                s = scanner.readLine();
                if(s.equals("")){
                    i--;
                    continue;
                }
                tmp = s.split("/");
                name = tmp[0];
                tmp = tmp[1].trim().split(",");
                flights = new String[tmp.length];
                prices = new int[tmp.length];
                for (int j = 0; j < tmp.length; j++) {
                    flights[j] = tmp[j].split(":")[0];
                    prices[j] = Integer.parseInt(tmp[j].split(":")[1].replace('$', ' ').trim());
                }
                agents[i] = new TravelAgent(name,flights,prices,flights.length);
            }

            scanner.close();








        }
        catch (FileNotFoundException a) {
            Alert s = new Alert(Alert.AlertType.ERROR,"Can't read the file!");
            s.show();
        } catch (IOException e) {}



        Object[] columnsData = new Object[destination.length+1];
        Object[][] rowsData = new Object[agents.length][destination.length+1];


        columnsData[0] = "Agents\\City";

        for (int i = 1;i<columnsData.length;i++)
//            columnsData[i] = destination[i-1];
            columnsData[i] = "City"+i;
        for (int i = 0 ; i < agents.length;i++){
            rowsData[i][0] = agents[i].getName();
            for (int j = 1 ; j<agents[i].nbFlights+1;j++)
                rowsData[i][j] = agents[i].getFlight(j-1);
        }


        jTable1.setModel(new DefaultTableModel(rowsData,columnsData));





        destinations.setEnabled(true);


    }







    public  void printPath(int[][] B,int[][] c,int i, int j,int index){

        String name = agents[index].getName();
        String[] filghts = new String[destination.length];
        int[] prices = new int[destination.length];
        int nb = agents[index].getNbFlights();
        int counter = 0;

//
//
//        if(B[i][j] == 0){
//
//        }
//        else if(B[i][j] == 2)
//        {
//            System.out.println(i+"  "+j);
//            printPath(B,c,i-1,j-1,index);
//        }
//        else if (B[i][j] == 3){
//
//            printPath(B,c,i,j-1,index);
//        }
//        else
//        {
//
//
//            if(c[i-1][j] == c[i][j-1])
//                printPath(B,c,i,j-1,index);
//            printPath(B,c,i-1,j,index);
//        }

        while (true){
            if(B[i][j] == 0)
                break;
            else if (B[i][j] == 2){
                filghts[j-1] = agents[index].getFlight(i-1);
                prices[j-1] = agents[index].getPrice(i-1);
                counter++;

//                    System.out.println(agents[index].getFlight(i-1));
//                    System.out.println(agents[index].getPrice(i-1));
//                    System.out.println((i-1) + "  " + (j-1));
                j = j-1;
                i=i-1;
                continue;
            }
            else if (B[i][j] == 3){
                j = j-1;
                continue;
            }
            else{
                i=i-1;
                continue;
            }

        }


        if (counter > max)
            max=counter;
        TravelAgent tA = new TravelAgent(name,filghts,prices,nb);
        tA.setM(counter);
        agents[index] = tA;

    }



    void lcs(TravelAgent x , String[] y){


        cost = new int[x.nbFlights+1][y.length+1];
        B = new int[x.nbFlights+1][y.length+1];
        for (int i = 0; i <= x.nbFlights; i++){
            cost[i][0] = 0;
            B[i][0] = 0;
        }
        for (int i = 0; i <= y.length; i++){
            B[0][i] = 0;
            cost[0][i] = 0;
        }

        int xtracker;
        int ytracker;
        for (int i = 0; i < x.nbFlights; i++) {
            xtracker = i+1;
            for (int j = 0; j < y.length; j++) {
                ytracker = j+1;
                if(x.getFlight(i).equalsIgnoreCase(y[j]))
                {
                    cost[xtracker][ytracker] = cost[xtracker-1][ytracker-1]+1 ;
                    B[xtracker][ytracker] =  2;
                }
                else if(cost[xtracker][ytracker-1] > cost[xtracker-1][ytracker])
                {
                    cost[xtracker][ytracker] = cost[xtracker][ytracker-1];
                    B[xtracker][ytracker] = 3;
                }
                else{
                    cost[xtracker][ytracker] = cost[xtracker-1][ytracker];
                    B[xtracker][ytracker] = 1;
                }
            }
        }

    }
















    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton destinations;
    private javax.swing.JButton getAgents;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}