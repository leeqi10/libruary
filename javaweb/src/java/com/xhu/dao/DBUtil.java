
package com.xhu.dao;
import com.xhu.model.book;
import com.xhu.model.Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtil {
    //插入 根据图书对象插入
    public static int InsertBook(book b){
    int k=0;  //表示导入失败
    String sql ="insert into book (bname,bauthor,bpublish,bprice) values(?,?,?,?) ";//动态生成
    
    Db db =new Db();//得到属性的初值
    Connection cn =db.getConnection();
    if(cn==null){
    System.out.print("连接对象为空！");
    return k;
    }
    
    try{
    PreparedStatement psm =cn.prepareStatement(sql);
    psm.setString(1, b.getBname());
    psm.setString(2, b.getBauthor());
    psm.setString(3, b.getBpublish());
    psm.setFloat(4, b.getBprice());
    k=psm.executeUpdate();
    
    psm.close();
    cn.close();
    
    }catch(Exception ex){
    System.out.println("插入失败！"+sql);
    }
    return k;
    }
    
    
    //删除，根据bid删除
    public static int DelBook(int id){
    int k=0;
    String sql ="delete from book where bid="+id;
     Db db =new Db();//得到属性的初值
    Connection cn =db.getConnection();
    if(cn==null){
    System.out.print("连接对象为空！");
    return k;
    }
    try{
 
    Statement st =cn.createStatement();
    k=st.executeUpdate(sql);
    cn.close();
   
    }catch(SQLException ex){
    System.out.println("删除失败！"+sql);
    }
    return k;
    }
    
    //修改
    public static int ModifyBook(book b){
    int k=0;
    String sql ="update book set bname=?,bauthor=?,bpublish=?,bprice=?"+"where bid =?";
    Db db =new Db();//得到属性的初值
    Connection cn =db.getConnection();
    if(cn==null){
    System.out.print("连接对象为空！");
    return k;
    }
    
    try{
    PreparedStatement psm =cn.prepareStatement(sql);
    psm.setString(1, b.getBname());
    psm.setString(2, b.getBauthor());
    psm.setString(3, b.getBpublish());
    psm.setFloat(4, b.getBprice());
    psm.setInt(5, b.getBid());
    
    k=psm.executeUpdate();
    psm.close();
    cn.close();
    }catch(SQLException ex){
    System.out.println("插入失败！"+sql);
    }
    return k;
    }
    
    //查询 得到所有图书，所有图书对象存入集合中，以集合作为方法返回
    
    public static ArrayList<book> SearchBookAll(){
    
    ArrayList<book> br = new ArrayList<book>() ;
    String sql ="select * from book";
    Db db =new Db();//得到属性的初值
    Connection cn =db.getConnection();
    if(cn==null){
    System.out.print("连接对象为空！");
    return br; 
    }
     try{   
         Statement st =cn.createStatement();
         ResultSet rs =st.executeQuery(sql);
         while(rs.next()){
         book b1 =new book();
         b1.setBid(rs.getInt("bid"));
         b1.setBname(rs.getString("bname"));
         b1.setBauthor(rs.getString("bauthor"));
         b1.setBpublish(rs.getString("bpublish"));
         b1.setBprice(rs.getFloat("bprice"));
         br.add(b1);
         }
         st.close();
         cn.close();
        }catch(Exception ex){
        System.out.println("插入失败！"+sql);
        }
        return br;
        }
    
    
    
    //查询 得到图书
    
    public static book SearchBook(int id){
    
   book b1 =null ;
    String sql ="select * from book where bid= "+id;
    Db db =new Db();//得到属性的初值
    Connection cn =db.getConnection();
    if(cn==null){
    System.out.print("连接对象为空！");
    return b1; 
    }
     try{   
         Statement st =cn.createStatement();
         ResultSet rs =st.executeQuery(sql);
         while(rs.next()){
         b1 =new book();
         b1.setBid(rs.getInt("bid"));
         b1.setBname(rs.getString("bname"));
         b1.setBauthor(rs.getString("bauthor"));
         b1.setBpublish(rs.getString("bpublish"));
         b1.setBprice(rs.getFloat("bprice"));
         
         }
         st.close();
         cn.close();
        }catch(Exception ex){
        System.out.println("插入失败！"+sql);
        }
        return b1;
        }
    
    }
    
       
    

