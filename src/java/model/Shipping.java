/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author xuank
 */
public class Shipping {
    int Shipping_ID;
    int Staff_ID;
    int OrderDetail_ID;
    String Shipping_Status;
    float Shipping_Cost;
    String Shipping_Date;
    String Created_At;
    String Updated_At;

    public Shipping(int Shipping_ID, int Staff_ID, int OrderDetail_ID, String Shipping_Status, float Shipping_Cost, String Shipping_Date, String Created_At, String Updated_At) {
        this.Shipping_ID = Shipping_ID;
        this.Staff_ID = Staff_ID;
        this.OrderDetail_ID = OrderDetail_ID;
        this.Shipping_Status = Shipping_Status;
        this.Shipping_Cost = Shipping_Cost;
        this.Shipping_Date = Shipping_Date;
        this.Created_At = Created_At;
        this.Updated_At = Updated_At;
    }

    public Shipping() {
    }

    public int getShipping_ID() {
        return Shipping_ID;
    }

    public void setShipping_ID(int Shipping_ID) {
        this.Shipping_ID = Shipping_ID;
    }

    public int getStaff_ID() {
        return Staff_ID;
    }

    public void setStaff_ID(int Staff_ID) {
        this.Staff_ID = Staff_ID;
    }

    public int getOrderDetail_ID() {
        return OrderDetail_ID;
    }

    public void setOrderDetail_ID(int OrderDetail_ID) {
        this.OrderDetail_ID = OrderDetail_ID;
    }

    public String getShipping_Status() {
        return Shipping_Status;
    }

    public void setShipping_Status(String Shipping_Status) {
        this.Shipping_Status = Shipping_Status;
    }

    public float getShipping_Cost() {
        return Shipping_Cost;
    }

    public void setShipping_Cost(float Shipping_Cost) {
        this.Shipping_Cost = Shipping_Cost;
    }

    public String getShipping_Date() {
        return Shipping_Date;
    }

    public void setShipping_Date(String Shipping_Date) {
        this.Shipping_Date = Shipping_Date;
    }

    public String getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(String Created_At) {
        this.Created_At = Created_At;
    }

    public String getUpdated_At() {
        return Updated_At;
    }

    public void setUpdated_At(String Updated_At) {
        this.Updated_At = Updated_At;
    }

    @Override
    public String toString() {
        return "Shipping{" + "Shipping_ID=" + Shipping_ID + ", Staff_ID=" + Staff_ID + ", OrderDetail_ID=" + OrderDetail_ID + ", Shipping_Status=" + Shipping_Status + ", Shipping_Cost=" + Shipping_Cost + ", Shipping_Date=" + Shipping_Date + ", Created_At=" + Created_At + ", Updated_At=" + Updated_At + '}';
    }
    
}