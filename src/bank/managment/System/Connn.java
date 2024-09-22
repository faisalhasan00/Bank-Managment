package bank.managment.System;


import  java.sql.*;

public class Connn{
        Connection connection;
        Statement statement;
        public Connn(){
            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Raj786f@");
                statement = connection.createStatement();
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }

