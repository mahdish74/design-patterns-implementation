package behavioral.chain_of_responsibilites;


public class LogRequestHandler extends BaseRequestHandler {
    @Override
    public boolean canHandle() {
        return true;
    }

    @Override
    public void handle() {
        System.out.println(this.toString());
    }
}
