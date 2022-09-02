package homeworks.lesson04HW.task4;

public class Stock {
    private String nameProduct = "Водка";
    private int amountProduct;

    public Stock(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public boolean difAmount() {
        if (amountProduct > 0) {
            amountProduct--;
            return true;
        } else {
            System.out.println("Водка закончилась");
            return false;
        }
    }
}
