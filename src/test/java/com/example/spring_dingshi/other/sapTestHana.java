package com.example.spring_dingshi.other;


import java.sql.*;

public class sapTestHana {
    //private static final String DRIVER = "com.sap.db.jdbc.Driver";  //jdbc 4.0
    //private static final String URL = "jdbc:sap://10.10.10.13:30015?databaseName=DEV@HDD";
    private static final String DRIVER = "com.sap.db.jdbc.Driver";
    private static final String URL = "jdbc:sap://10.10.10.13?instanceNumber=00&databaseName=DEV";
    private static final String USER_NAME = "SGCABAPD";
    private static final String PASSWORD = "Abap@2020";
    public sapTestHana() {

    }
    public static void main(String[] args) {
        sapTestHana demo = new sapTestHana();
        try {
            demo.getSelectList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getSelectList() throws Exception {
        Connection con = this.getConnection(DRIVER, URL, USER_NAME, PASSWORD);
        PreparedStatement pstmt = con.prepareStatement("SELECT  ZTERM,  MANDT,SPRAS,TEXT1,ZTAGG\n" +
                "FROM SAPHANADB.T052U \n" +
                "where ZTERM like 'D%' AND MANDT=500 AND SPRAS='1' ");
        ResultSet rs = pstmt.executeQuery();
        try {
            this.processResult(rs);
        } finally {
            this.closeConnection(con, pstmt);
        }

    }

    private void processResult(ResultSet rs) throws Exception {
        if (rs.next()) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int colNum = rsmd.getColumnCount();
            for (int i = 1; i <= colNum; i++) {
                if (i == 1) {
                    System.out.print(rsmd.getColumnName(i));
                } else {
                    System.out.print("\t" + rsmd.getColumnName(i));
                }

            }
            System.out.print("\n");
            System.out.println("———————–");
            do {
                for (int i = 1; i <= colNum; i++) {
                    if (i == 1) {
                        System.out.print(rs.getString(i));
                    } else {
                        System.out.print("\t" + (rs.getString(i) == null ? "null" : rs.getString(i).trim()));
                    }

                }
                System.out.print("\n");
            } while (rs.next());
        } else {
            System.out.println("query not result.");
        }

    }

    private Connection getConnection(String driver, String url, String user,
                                     String password) throws Exception {
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);

    }

    private void closeConnection(Connection con, Statement stmt)
            throws Exception {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }

}

