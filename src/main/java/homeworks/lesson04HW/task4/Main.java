package homeworks.lesson04HW.task4;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock(99);
        Workers workers = new Workers(10, stock);

        while (stock.getAmountProduct() > 0) {
            for (Worker worker : workers.getWorkers()) {
                worker.takeProduct();
            }
        }
        for (Worker worker : workers.getWorkers()) {
            worker.printLogWorks();
        }
    }
}
