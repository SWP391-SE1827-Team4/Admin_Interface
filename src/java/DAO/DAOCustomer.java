/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.User_Account;

/**
 *
 * @author Admin
 */
public class DAOCustomer extends DBContext {

    public List<User_Account> getAllAccount() {
        List<User_Account> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Customers";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User_Account account = new User_Account();
                account.setUser_ID(rs.getInt(1));
                account.setUser_Name(rs.getString(2));
                account.setUser_Password(rs.getString(3));
                account.setUser_Email(rs.getString(4));
                account.setUser_PhoneNum(rs.getString(5));
                account.setUser_PhoneNum(rs.getString(6));
                account.setUser_Address(rs.getString(7));
                account.setUser_Gender(rs.getString(8));
                account.setRole_ID(rs.getInt(9));
                account.setCreated_At(rs.getString(10));
                account.setUpdated_At(rs.getString(11));
                list.add(account);
            }
        } catch (Exception ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public User_Account login(String email, String pass) {
        try {
            String sql = "SELECT * FROM Customers where [User_Email] = ? and [User_Password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, pass);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User_Account account = new User_Account();
                account.setUser_ID(rs.getInt(1));
                account.setUser_Name(rs.getString(2));
                account.setUser_Password(rs.getString(3));
                account.setUser_Email(rs.getString(4));
                account.setUser_PhoneNum(rs.getString(5));
                account.setUser_PhoneNum(rs.getString(6));
                account.setUser_Address(rs.getString(7));
                account.setUser_Gender(rs.getString(8));
                account.setRole_ID(rs.getInt(9));
                account.setCreated_At(rs.getString(10));
                account.setUpdated_At(rs.getString(11));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public User_Account checkAccountCExist(String user) {
        try {
            String sql = "SELECT * FROM Customers where [User_Name] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User_Account account = new User_Account();
                account.setUser_ID(rs.getInt(1));
                account.setUser_Name(rs.getString(2));
                account.setUser_Password(rs.getString(3));
                account.setUser_Email(rs.getString(4));
                account.setUser_PhoneNum(rs.getString(5));
                account.setUser_PhoneNum(rs.getString(6));
                account.setUser_Address(rs.getString(7));
                account.setUser_Gender(rs.getString(8));
                account.setRole_ID(rs.getInt(9));
                account.setCreated_At(rs.getString(10));
                account.setUpdated_At(rs.getString(11));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    public void insertUser_Account(User_Account u) {
//        int n = 0;
//        try {
//            String sql = "INSERT INTO [dbo].[User_Account]\n"
//                    + "           ([AccountID]\n"
//                    + "           ,[Name]\n"
//                    + "           ,[Gender]\n"
//                    + "           ,[Email]\n"
//                    + "           ,[Phone]\n"
//                    + "           ,[Address]\n"
//                    + "           ,[IsGuest]\n"
//                    + "           ,[IsCustomer]\n"
//                    + "           ,[CreatedDate]\n"
//                    + "           ,[LastUpdated])\n"
//                    + "     VALUES\n"
//                    + "           (?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?)";
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setString(1, user);
//            stm.setString(2, pass);
//            stm.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public int addProduct2(Products p) {
//        int n = 0;
//        String sql = "INSERT INTO Products\n"
//                + "           ([ProductName],[SupplierID],[CategoryID],[QuantityPerUnit],[UnitPrice]\n"
//                + "           ,[UnitsInStock],[UnitsOnOrder],[ReorderLevel],[Discontinued])\n"
//                + "     VALUES(?,?,?,?,?,?,?,?,?) ";
//        try {
//
//            PreparedStatement prestate = conn.prepareStatement(sql);
//            prestate.setString(1, p.getProductName());
//            prestate.setInt(2, p.getSupplierID());
//            prestate.setInt(3, p.getCategoryID());
//            prestate.setString(4, p.getQuantityPerUnit());
//            prestate.setDouble(5, p.getUnitPrice());
//            prestate.setInt(6, p.getUnitsInStock());
//            prestate.setInt(7, p.getUnitsOnOrder());
//            prestate.setInt(8, p.getReorderLevel());
//            prestate.setInt(9, p.isDiscontinued() == true ? 1 : 0);
//
//            n = prestate.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return n;
//    }
    public User_Account getAccountCById(int accountId) {
        try {
            String sql = "select *  from Customers where User_ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User_Account account = new User_Account();
                account.setUser_ID(rs.getInt(1));
                account.setUser_Name(rs.getString(2));
                account.setUser_Password(rs.getString(3));
                account.setUser_Email(rs.getString(4));
                account.setUser_PhoneNum(rs.getString(5));
                account.setUser_PhoneNum(rs.getString(6));
                account.setUser_Address(rs.getString(7));
                account.setUser_Gender(rs.getString(8));
                account.setRole_ID(rs.getInt(9));
                account.setCreated_At(rs.getString(10));
                account.setUpdated_At(rs.getString(11));
                return account;
            }
        } catch (Exception ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateAccountC(User_Account account) {

        try {
            String sql = "UPDATE [dbo].[Customers]\n"
                    + "   SET [User_Name] = ?\n"
                    + "      ,[User_Password] = ?\n"
                    + "      ,[User_Email] = ?\n"
                    + "      ,[User_PhoneNum] = ?\n"
                    + "      ,[User_Address] = ?\n"
                    + "      ,[User_Gender] = ?\n"
                    + "      ,[Role_ID] = ?\n"
                    + "      ,[Created_At] = ?\n"
                    + "      ,[Updated_At] = ?\n"
                    + " WHERE User_ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, account.getUser_Name());
            stm.setString(2, account.getUser_Password());
            stm.setString(3, account.getUser_Email());
            stm.setString(4, account.getUser_PhoneNum());
            stm.setString(5, account.getUser_Address());
            stm.setString(6, account.getUser_Gender());
            stm.setInt(7, account.getRole_ID());
            stm.setString(8, account.getCreated_At());
            stm.setString(9, account.getUpdated_At());
            stm.setInt(10, account.getUser_ID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteAccount(int uid) {
        try {
            String sql = "DELETE FROM [Customers]\n"
                    + "WHERE UserID = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, uid);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategories.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static void main(String[] args) {
//        try {
//            System.out.println(new AccountDBContext().getAccountById(4));
//
//        } catch (Exception e) {
//        }
//    }
}
