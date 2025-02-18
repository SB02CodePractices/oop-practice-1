package sb02.oop.pr7.local_class;

public class LocalClass {

    public void executeTask() {
        final int taskId = 999;

        class LocalWorker {
            public void run() {
                System.out.println("LocalWorker started with taskId = " + taskId);
            }
        }

        LocalWorker worker = new LocalWorker();
        worker.run();
    }
}
