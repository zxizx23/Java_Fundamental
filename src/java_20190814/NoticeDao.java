package java_20190814;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoticeDao {
	private static NoticeDao single;
	private NoticeDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static NoticeDao getInstance() {
		if(single == null) {
			single = new NoticeDao();
		}
		return single;
	}
	
	public boolean insert(NoticeDto n) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO notice(writer,title,content,regdate) VALUES(?,?,?,NOW()) ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(index++, n.getWriter());
			pstmt.setString(index++, n.getTitle());
			pstmt.setString(index++, n.getContent());
			//pstmt.setString(index, n.getRegdate());
			
			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	
		return isSuccess;
	}
	public boolean update(NoticeDto n,int no) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE notice SET num = ?, writer= ? ,title= ? ,content= ? ,regdate= NOW() WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, n.getNum());
			pstmt.setString(index++, n.getWriter());
			pstmt.setString(index++, n.getTitle());
			pstmt.setString(index++, n.getContent());
			//pstmt.setString(index++, n.getRegdate());
			pstmt.setInt(index, no);
			
			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
				
		return isSuccess;
	}
	public boolean delete(int num) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM notice WHERE num =? ");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index, num);
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
	public ArrayList<NoticeDto> select(){
		ArrayList<NoticeDto> list = new ArrayList<NoticeDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","root","kic1234");
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * from notice ");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String wri = rs.getString(index++);
				String title = rs.getString(index++);
				String content = rs.getString(index++);
				String date = rs.getString(index++);
				list.add(new NoticeDto(num,wri,title,content,date));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				if(rs != null) rs.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		return list;
	}
	
}
