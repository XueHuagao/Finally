package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
public class ProductDAO {
	public static void main(String[]args) {
		System.out.println(new ProductDAO().ListProdut().size());
	}
	public List<Product> ListProduct(){
		List<Product> products=new ArrayList<Product>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cart?characterEncoding=UTF-8","root","admin");
			String sql="select * from product order by id desc";
			PreparedStatement ps=c.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Product product=new Product();
				int id=rs.getInt(1);
			}
		}
	}
}
