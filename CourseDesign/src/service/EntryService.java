package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import configuration.DBOperation;
import model.Entry;

public class EntryService {
	 public static void insert(Entry entry) {
	        String sql = "INSERT INTO `Entry` (entryDate, good_id, price, amount, checker_id, operator_id, supplier_id, purchaser_id, note) VALUES ('"
	                + entry.getDate() + "', '" + entry.getGoodId() + "', " + entry.getPrice() + ", " + entry.getAmount()
	                + ", '" + entry.getCheckerId() + "', '" + entry.getOperatorId() + "', '" + entry.getSupplierId() + "', '"
	                + entry.getPurchaserId() + "', '" + entry.getNote() + "')";

	        DBOperation.update(sql);
	    }

	    public static void delete(int entryId) {
	        String sql = "DELETE FROM `Entry` WHERE id = " + entryId;
	        DBOperation.update(sql);
	    }

	    public static Entry find(int entryId) {
	        String sql = "SELECT * FROM `Entry` WHERE id = " + entryId;
	        ResultSet resultSet = DBOperation.query(sql);
	        Entry entry = null;
	        try {
	            while (resultSet.next()) {
	            	 int id = resultSet.getInt("id");
	                 String entryDate = resultSet.getString("entryDate");
	                 // 定义日期时间格式
	                 String pattern = "yyyy-MM-dd HH:mm:ss";
	                 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

	                 // 解析字符串为 LocalDateTime
	        
	                 LocalDateTime localDateTime = LocalDateTime.parse(entryDate, formatter);

	                 String goodId = resultSet.getString("good_id");
	                 float price = resultSet.getFloat("price");
	                 int amount = resultSet.getInt("amount");
	                 String checkerId = resultSet.getString("checker_id");
	                 String operatorId = resultSet.getString("operator_id");
	                 String supplierId = resultSet.getString("supplier_id");
	                 String purchaserId = resultSet.getString("purchaser_id");
	                 String note = resultSet.getString("note");

	                 // 创建 Entry 对象
	                 entry = new Entry(id, localDateTime, goodId, price, amount, checkerId, operatorId,
	                     supplierId, purchaserId, note);
	                 
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("查找错误");
	        }
	        return entry;
	    }

	   
}
