package ProductManager.view;

import ProductManager.controller.ProductController;
import ProductManager.model.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    // 싱글톤
    private static ProductView productView = new ProductView();

    private ProductView() {
    }

    public static ProductView getInstance() {
        return productView;
    }

    Scanner scan = new Scanner(System.in);

    public void mainPage() {
        System.out.println("---제품 목록 관리자---");
        while (true) {
            System.out.println();
            System.out.print("1. 제품 추가\n2. 전체 제품 출력\n3. 제품 삭제\n4. 제품 수정\n선택: ");
            int choose = scan.nextInt();
            scan.nextLine();

            if (choose == 1) {
                productAdd();
            } else if (choose == 2) {
                productPrint();
            } else if (choose == 3) {
                productDelete();
            } else if (choose == 4) {
                productUpdate();
            } // if end
        } // while end
    } // func end

    // 제품 추가 함수
    void productAdd() {
        System.out.println();
        // 데이터 입력
        System.out.print("제품명: ");
        String name = scan.nextLine();
        System.out.print("제품 가격: ");
        int price = scan.nextInt();

        // 컨트롤러에 전달
        boolean result = ProductController.getInstance().productAdd(name, price);

        // 결과 출력
        if (result) {
            System.out.println("제품 등록 성공");
        } else {
            System.out.println("제품 등록 실패");
        } // if end
    } // func end

    // 제품 목록 출력 함수
    void productPrint() {
        System.out.println();
        // 컨트롤러에 리스트 요청
        ArrayList<ProductDto> product = ProductController.getInstance().productPrint();
        // 출력
        for (int i = 0; i < product.size(); i++) {
            System.out.print("제품 번호: " + product.get(i).getNum());
            System.out.print(" 제품명: " + product.get(i).getName());
            System.out.println(" 제품 가격: " + product.get(i).getPrice());
        } // for end
    } // func end

    // 제품 삭제 함수
    void productDelete() {
        System.out.println();

        System.out.println("삭제할 제품 번호: ");
        int deleteNum = scan.nextInt();
        // 컨트롤러에 삭제할 번호 전달
        boolean result = ProductController.getInstance().productDelete(deleteNum);
        if (result) {
            System.out.println("제품 삭제 완료");
        } else {
            System.out.println("제품 삭제 실패");
        } // if end
    } // func end

    // 제품 수정 함수
    void productUpdate() {
        System.out.println();

        // 데이터 입력
        System.out.print("수정할 제품 번호: ");
        int updateNum = scan.nextInt();
        System.out.print("제품명 수정: ");
        String updateName = scan.next();
        System.out.print("제품 가격 수정: ");
        int updatePrice = scan.nextInt();

        // 객체 생성
        ProductDto productDto = new ProductDto(updateNum, updateName, updatePrice);
        // 컨트롤러에 객체 전달
        boolean result = ProductController.getInstance().productUpdate(productDto);

        if (result) {
            System.out.println("제품 수정 완료");
        } else {
            System.out.println("제품 수정 실패");
        } // if end
    } // func end
} // class end