package behavioral.visitor;


public class PurchaseRequest implements Request {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPurchaseRequest(this);
    }
}
