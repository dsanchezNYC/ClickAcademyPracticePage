package com.silverline.MavenProject.Helpers;

import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.GetUserInfoResult;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class SalesforceSoap {

    private String query;
    private EnterpriseConnection connection;

    //---End Point
    private static  String authEndPoint = "https://test.salesforce.com/services/Soap/c/41";

    //---Sl Dev
    private static String login = "";
    private static String password = "";

    //---Methods
    public static void main() {
        SalesforceSoap sample = new SalesforceSoap(authEndPoint, login, password);
        sample.deleteTestData("PETER H WONG-009");
    }

    private void deleteTestData(String name) {
        // Make a login call
        if (login()) {
            // Do a describe global
            System.out.println("[INFO]: Delete test data - .");
            deleteTestLoans(name);
            // Log out
            logout();
            System.out.println("[INFO]: Test data successfully deleted from Salesforce ✔.");
        }
    }

    // Constructor
    private SalesforceSoap(String authEndPoint, String login, String password) {

        SalesforceSoap.authEndPoint = authEndPoint;
        SalesforceSoap.login = login;
        SalesforceSoap.password = password;
    }

    private boolean login() {
        boolean success = false;
        String username = login;
        String password = SalesforceSoap.password;

        try {
            ConnectorConfig config = new ConnectorConfig();
            config.setUsername(username);
            config.setPassword(password);

            config.setAuthEndpoint(authEndPoint);
            connection = new EnterpriseConnection(config);
            printUserInfo(config);

            success = true;
        } catch (ConnectionException ce) {
            ce.printStackTrace();
        }
        return success;
    }

    private void printUserInfo(ConnectorConfig config) {
        try {
            GetUserInfoResult userInfo = connection.getUserInfo();
            System.out.println("Logging in ...");
        } catch (ConnectionException ce) {
            ce.printStackTrace();
        }
    }

    private void logout() {
        try {
            connection.logout();
            System.out.println("Logged out.");
        } catch (ConnectionException ce) {
            ce.printStackTrace();
        }
    }

    private void deleteTestLoans(String name) {
        try {
            QueryResult q = connection.query("SELECT Name, Id FROM LLC_BI__Loan__c WHERE Name like '"+ name +"%' LIMIT 200" ); //, Test User
            String[] loans = new String[q.getRecords().length];
            for (int i = 0; i < q.getRecords().length; i++) {
                loans[i] = q.getRecords()[i].getId();
            }
            System.out.println(loans);
            connection.delete(loans);
            System.out.println("[NOTE]:"+ q.getRecords().length +" Test Records have been removed ✔.");

        } catch (ConnectionException ce) {
            ce.printStackTrace();
        }
    }

}
