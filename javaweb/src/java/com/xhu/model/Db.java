
package com.xhu.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
   private String driver;
   private String url;
   private String username;
   private String userpass;
    
    public Db(){
    driver ="com.mysql.jdbc.Driver";
    url="jdbc:mysql://localhost:3306/book?characterEncoding=utf-8";
    username ="root";
    userpass ="TANGqi0924";
    
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
   
   public Connection getConnection(){
   Connection con =null;
   try{
   Class.forName(driver);
   }catch( ClassNotFoundException ex ){
   System.out.print("驱动加载失败");
   return null;
   }
    try{
   con =DriverManager.getConnection(url,username,userpass);
   }catch(SQLException ex ){
   System.out.print("数据库连接失败");
   }
   return con;
   
   }
    
    
}
