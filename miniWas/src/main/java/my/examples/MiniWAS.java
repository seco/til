package my.examples;

public class MiniWAS extends Thread{
    @Override
    public void run() {
        Connector connector = new Connector(8888);
        connector.run();
    }
}
