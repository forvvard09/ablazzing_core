package homeworks.lesson04HW.task4;

public class Workers {
    private final static int DEFAULT_COUNT_WORKERS = 3;
    private Worker[] workers;
    private Stock stock;

    public Workers(int countWorkers, Stock stock) {
        this.stock = stock;
        if (countWorkers < 3) {
            System.out.println("Ошибка. Минимальное количество работников 3.");
            this.workers = new Worker[DEFAULT_COUNT_WORKERS];
            for (int i = 1; i <= this.workers.length; i++) {
                this.workers[i - 1] = new Worker(this.stock, "Работник " + i);
            }
        } else {
            this.workers = new Worker[countWorkers];
            for (int i = 1; i <= this.workers.length; i++) {
                this.workers[i - 1] = new Worker(this.stock, "Работник " + i);
            }
        }
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
}
