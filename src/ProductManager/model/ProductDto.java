package ProductManager.model;

public class ProductDto {
    private int num;
    private String name;
    private int price;

    // 등록 생성자
    public ProductDto(String name, int price){
        this.name=name;
        this.price=price;
    }

    // 수정 생성자
    public ProductDto(int num, String name, int price){
        this.num=num;
        this.name=name;
        this.price=price;
    }

    public int getNum() {return num;}
    public String getName() {return name;}
    public int getPrice() {return price;}

    public void setNum(int num) {this.num = num;}
    public void setName(String name) {this.name = name;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return "ProductDto{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
