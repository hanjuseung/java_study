package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;

public class MidFcstDAO {

	/*
	 * CREATE TABLE MID_TA ( --no tm_fc VARCHAR2(16), --2,4,8,16,32 2배수 reg_id
	 * VARCHAR2(8), ta_min4 NUMBER, ta_max4 NUMBER, ta_min5 NUMBER, ta_max5 NUMBER
	 * CONSTRAINT MID_TA_PK PRIMARY KEY (tm_fc,reg_id) );
	 */

	// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체

	// insert
	public int saveMidTa(MidTaDTO midTaDTO) {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "INSERT INTO mid_ta VALUES ( ?, ?, ?, ?, ?, ? ) ";

		int result = 0;

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			// 파라미터 세팅
			psmt.setString(1, midTaDTO.getTmFc());
			psmt.setString(2, midTaDTO.getRegId());
			psmt.setInt(3, midTaDTO.getTaMin4());
			psmt.setInt(4, midTaDTO.getTaMax4());
			psmt.setInt(5, midTaDTO.getTaMin5());
			psmt.setInt(6, midTaDTO.getTaMax5());

			// psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

}
