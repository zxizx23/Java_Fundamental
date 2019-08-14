package java_20190813;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	private static DeptDao single;

	private DeptDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}
	public boolean insert(DeptDto d) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept VALUES(?,?,?) ");
			//sql.append("VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, d.getNo());
			pstmt.setString(index++, d.getName());
			pstmt.setString(index, d.getLoc());
			
			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return isSuccess;
	}
	public boolean update(DeptDto d) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept ");
			sql.append("SET DNAME = ? , LOC = ? ");
			sql.append("WHERE DEPTNO = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(index++, d.getName());
			pstmt.setString(index++, d.getLoc());
			pstmt.setInt(index, d.getNo());
			
			pstmt.executeUpdate();
			isSuccess = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return isSuccess;
		
	}
	public boolean delete(int no) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("delete from dept ");
			sql.append("where deptno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index, no);
			pstmt.executeUpdate();
			
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		return isSuccess;
		
	}
	public ArrayList<DeptDto> select(){
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("select deptno,dname,loc ");
			sql.append("from dept ");
			
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				int no = rs.getInt(index++);
				String name = rs.getNString(index++);
				String loc = rs.getString(index);
				list.add(new DeptDto(no,name,loc));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return list;
	}
}
