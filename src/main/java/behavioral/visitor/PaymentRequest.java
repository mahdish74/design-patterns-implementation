package behavioral.visitor;


public class PaymentRequest implements Request {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPaymentRequest(this);
    }
}
