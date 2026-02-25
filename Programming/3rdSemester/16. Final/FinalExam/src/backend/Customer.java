package backend;
import java.sql.*;
import java.util.ArrayList;

public class Customer {
    private int idCustomer;
    private String name;
    private String address;
    private String phone;

    // Constructor
    public Customer() {}

    // Getters and Setters
    public int getIdCustomer() { return idCustomer; }
    public void setIdCustomer(int idCustomer) { this.idCustomer = idCustomer; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    // Helper: Search Customer by ID
    public Customer getById(int id) {
        Customer c = new Customer();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customers WHERE id_customer = " + id);
        try {
            while (rs.next()) {
                c.setIdCustomer(rs.getInt("id_customer"));
                c.setName(rs.getString("name"));
                c.setAddress(rs.getString("address"));
                c.setPhone(rs.getString("phone"));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return c;
    }
    
    // Helper: Get All (Optional, but good for testing)
    public ArrayList<Customer> getAll() {
        ArrayList<Customer> list = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customers");
        try {
            while (rs.next()) {
                Customer c = new Customer();
                c.setIdCustomer(rs.getInt("id_customer"));
                c.setName(rs.getString("name"));
                c.setAddress(rs.getString("address"));
                c.setPhone(rs.getString("phone"));
                list.add(c);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
}