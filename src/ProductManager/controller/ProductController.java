package ProductManager.controller;

import ProductManager.model.ProductDao;
import ProductManager.model.ProductDto;

import java.util.ArrayList;

public class ProductController {
    // 싱글톤
    private static ProductController productController=new ProductController();
    private ProductController(){}
    public static ProductController getInstance() {return productController;}

    public boolean productAdd(String name, int price) {
        // 유효성 검사

        // 객체 생성
        ProductDto productDto=new ProductDto(name,price);

        // DAO에 객체 전달
        return ProductDao.getInstance().productAdd(productDto);
    } // func end

    public ArrayList<ProductDto> productPrint() {
        // DAO에게 받아온 리스트 전달
        ArrayList<ProductDto> result=ProductDao.getInstance().productPrint();
        return result;
    } // func end

    public boolean productDelete(int deleteNum) {
        // 유효성 검사

        // DAO에게 삭제할 번호 전달 후 결과
        boolean result=ProductDao.getInstance().productDelete(deleteNum);
        return result;
    } // func end

    public boolean productUpdate(ProductDto productDto) {
        // 유효성 검사

        // DAO에게 객체 전달
        boolean result=ProductDao.getInstance().productUpdate(productDto);
        return result;
    } // func end
} // class end
