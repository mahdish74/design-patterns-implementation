package behavioral.visitor;


public interface Request {
    void accept(Visitor visitor);
}
