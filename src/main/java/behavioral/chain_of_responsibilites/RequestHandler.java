package behavioral.chain_of_responsibilites;


public interface RequestHandler {
    void process(RequestHandler next);

    boolean canHandle();

    void handle();
}
