/**
 * 
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.bean.TaiSan;

/**
 * @author HCD-Fresher163
 *
 */
public class TaiSanDAO {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=quanlycamdo_van";
	String userName = "sa";
	String password = "12345678";
	Connection connection;
	
	void connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		}
	}

	public ArrayList<TaiSan> hienThiDanhSachTaiSan() {
		connect();
		String sql=	"SELECT * FROM TaiSan";
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<TaiSan> danhSachTaiSan = new ArrayList<TaiSan>();
		TaiSan taiSan;
		try {
			while(rs.next()){
				taiSan = new TaiSan();
				taiSan.setTenTaiSan(rs.getString("TenTaiSan"));
				taiSan.setTinhTrang(rs.getInt("TinhTrang"));
				taiSan.setUrlHinhAnh(rs.getString("UrlHinhAnh"));
				taiSan.setMoTa(rs.getString("MoTa"));
				danhSachTaiSan.add(taiSan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachTaiSan;
	}
}
