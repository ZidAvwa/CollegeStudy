package backend;
import java.util.ArrayList;
import java.sql.*;

public class Product extends RoboticPart {
    private int categoryId;
    private String categoryName;
    private int stock;
    private String specs;

    public Product() {}

    @Override
    public String getVoltageRequirement() {
        return specs;
    }


    @Override
    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public String getSpecs() { return specs; }
    public void setSpecs(String specs) { this.specs = specs; }
    public void setCategoryName(String name) { this.categoryName = name; }
    
    public Product getById(int id) {
        Product p = new Product();
        String sql = "SELECT p.*, c.name as cat_name FROM products p " +
                     "LEFT JOIN categories c ON p.id_category = c.id_category " +
                     "WHERE p.id_product = " + id;
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                p.setId(rs.getInt("id_product"));
                p.setCategoryId(rs.getInt("id_category"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                p.setStock(rs.getInt("stock"));
                p.setSpecs(rs.getString("specifications"));
                p.setCategoryName(rs.getString("cat_name"));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return p;
    }

    public ArrayList<Product> getAll() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT p.*, c.name as cat_name FROM products p " +
                     "LEFT JOIN categories c ON p.id_category = c.id_category";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id_product"));
                p.setCategoryId(rs.getInt("id_category"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                p.setStock(rs.getInt("stock"));
                p.setSpecs(rs.getString("specifications"));
                p.setCategoryName(rs.getString("cat_name"));
                list.add(p);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public void save() {
        if (getById(id).getId() == 0) {
            String sql = "INSERT INTO products (id_category, name, price, stock, specifications) VALUES (" +
                         this.categoryId + ", '" + this.name + "', " + this.price + ", " + 
                         this.stock + ", '" + this.specs + "')";
            this.id = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE products SET id_category = " + this.categoryId + ", " +
                         "name = '" + this.name + "', price = " + this.price + ", " +
                         "stock = " + this.stock + ", specifications = '" + this.specs + "' " +
                         "WHERE id_product = " + this.id;
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM products WHERE id_product = " + this.id;
        DBHelper.executeQuery(sql);
    }
    
    public String toString() { return name; }
}