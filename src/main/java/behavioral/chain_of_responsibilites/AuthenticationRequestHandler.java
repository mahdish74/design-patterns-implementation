package behavioral.chain_of_responsibilites;


public class AuthenticationRequestHandler extends BaseRequestHandler {
    @Override
    public boolean canHandle() {
        return true;
    }

    @Override
    public void handle() {

    }
}
