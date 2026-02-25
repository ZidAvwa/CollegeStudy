package backend;
import java.util.ArrayList;
import java.sql.*;

public class Category {
    private int idCategory;
    private String name;
    private String description;

    public Category() {}

    public int getIdCategory() { return idCategory; }
    public void setIdCategory(int idCategory) { this.idCategory = idCategory; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Category> getAll() {
        ArrayList<Category> list = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM categories");
        try {
            while (rs.next()) {
                Category cat = new Category();
                cat.setIdCategory(rs.getInt("id_category"));
                cat.setName(rs.getString("name"));
                cat.setDescription(rs.getString("description"));
                list.add(cat);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
}