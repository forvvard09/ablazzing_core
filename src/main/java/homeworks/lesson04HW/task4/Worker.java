package homeworks.lesson04HW.task4;

public class Worker {
    private Stock stock;
    private String nameWorker;
    private int countDamagedProduct;

    public Worker(Stock stock, String nameWorker) {
        this.stock = stock;
        this.nameWorker = nameWorker;
        // можно не инициализировать, по умолчанию запишется 0 для int
        countDamagedProduct = 0;
    }

    public String getNameWorker() {
        return nameWorker;
    }

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public int getCountDamagedProduct() {
        return countDamagedProduct;
    }

    public void setCountDamagedProduct(int countDamagedProduct) {
        this.countDamagedProduct = countDamagedProduct;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void takeProduct() {
        if (stock.difAmount()) {
            countDamagedProduct++;
            System.out.println("Ура я испортил водку!");
        }
    }

    public void printLogWorks() {
        System.out.println("Работник " + "'" + this.nameWorker + "'" + " испортил водки в количестве:" + this.countDamagedProduct + " штук");
    }
}
