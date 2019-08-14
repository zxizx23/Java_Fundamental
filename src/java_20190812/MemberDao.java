package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Dao(Data Access Object)
public class MemberDao {
	
	//1.singleton 코딩
	private static MemberDao single;
	private MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static MemberDao getInstance() {
		if(single == null) {
			single = new MemberDao();
		}
		return single;
	}
	//Dto : Data Transfer Object
	public boolean insert(MemberDto m){
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic",
					"root",
					"kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr)");
			sql.append("values(?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, m.getNum());
			pstmt.setString(index++, m.getName());
			pstmt.setString(index++, m.getAddr());
			
			pstmt.executeUpdate();
			isSuccess = true;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		return isSuccess;
		
	}
	public boolean update(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ? , addr = ? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setString(index++, m.getName());
			pstmt.setString(index++, m.getAddr());
			pstmt.setInt(index, m.getNum());

			pstmt.executeUpdate();
			isSuccess = true;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	public ArrayList<MemberDto> select(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num,NAME,addr ");
			sql.append("FROM member ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				index = 1;
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index);
				list.add(new MemberDto(num,name,addr));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			//e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				if(rs != null) rs.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
