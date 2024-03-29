package models;

public class Products {
    private int productId;
    private String productName;
    private String productCreatDate;
    Category category;
    Brands brand;

    public Products() {
    }

    public Products(String productName, String productCreatDate, Category category, Brands brand) {
        this.productName = productName;
        this.productCreatDate = productCreatDate;
        this.category = category;
        this.brand = brand;
    }

    public Products(int productId, String productName, String productCreatDate, Category category, Brands brand) {
        this.productId = productId;
        this.productName = productName;
        this.productCreatDate = productCreatDate;
        this.category = category;
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCreatDate() {
        return productCreatDate;
    }

    public void setProductCreatDate(String productCreatDate) {
        this.productCreatDate = productCreatDate;
    }

    public Category getCategory() {
        return category;
    }
    public int categoryId (){
        Category category1 = getCategory();
        int ccId = category1.getCategoryId();
        return ccId;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brands getBrand() {
        return brand;
    }
    public int brandId (){
        Brands brand1 = getBrand();
        int ccId2 = brand1.getBrandId();
        return ccId2;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCreatDate='" + productCreatDate + '\'' +
                ", category_id=" + category.getCategoryId() +
                ", brand_id=" + brand.getBrandId() +
                '}';
    }
}
