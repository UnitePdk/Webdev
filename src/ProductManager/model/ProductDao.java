package ProductManager.model;

import java.sql.*;
import java.util.ArrayList;

public class ProductDao {
    // JDBC 인터페이스 객체
    private Connection conn;

    // 싱글톤
    private static ProductDao productDao = new ProductDao();

    private ProductDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductManager", "root", "1234");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("[DB 연동 실패]");
            System.out.println(e.getMessage());
        } // try end
    } // init end

    public static ProductDao getInstance() {
        return productDao;
    }

    public boolean productAdd(ProductDto productDto) {
        try {
            // SQL 작성
            String sql = "insert into product(name, price) values(?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            // SQL 매개변수에 값 대입
            ps.setString(1, productDto.getName());
            ps.setInt(2, productDto.getPrice());
            // SQL 실행
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("DB 등록 실패");
            System.out.println(e.getMessage());
        } // try end
        return false;
    } // func end

    public ArrayList<ProductDto> productPrint() {
        ArrayList<ProductDto> list = new ArrayList<>();
        try {
            // SQL 작성
            String sql = "select * from product";
            PreparedStatement ps = conn.prepareStatement(sql);
            // 조회한 SQL 조작하는 객체 생성
            ResultSet rs = ps.executeQuery();
            // 불러온 SQL을 리스트로 정리
            while (rs.next()) {
                // 각 필드 별 데이터 호출
                int num = rs.getInt("num");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                // 객체 생성
                ProductDto productDto = new ProductDto(num, name, price);
                // 리스트에 저장
                list.add(productDto);
            } // while end
        } catch (SQLException e) {
            System.out.println("DB 출력 실패");
            System.out.println(e.getMessage());
        } // try end
        return list;
    } // func end

    public boolean productDelete(int deleteNum) {
        try {
            // SQL 작성
            String sql = "delete from product where num = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, deleteNum);
            // 삭제한 레코드 개수 반환
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            } // if end
        } catch (SQLException e) {
            System.out.println("DB 삭제 실패");
            System.out.println(e.getMessage());
        } // try end
        return false;
    } // func end

    public boolean productUpdate(ProductDto productDto) {
        try{
            // SQL 작성
            String sql="update product set name = ?, price = ? where num = ?";
            PreparedStatement ps= conn.prepareStatement(sql);
            // SQL 매개변수에 대입
            ps.setString(1, productDto.getName());
            ps.setInt(2, productDto.getPrice());
            ps.setInt(3, productDto.getNum());
            // SQL 실행
            int result=ps.executeUpdate();
            if(result==1){
                return true;
            } // if end
        } catch (SQLException e) {
            System.out.println("DB 수정 실패");
            System.out.println(e.getMessage());
        } // try end
        return false;
    } // func end
} // class end
