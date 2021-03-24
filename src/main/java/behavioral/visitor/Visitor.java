package behavioral.visitor;


public interface Visitor {
    void visitPaymentRequest(PaymentRequest request);

    void visitPurchaseRequest(PurchaseRequest request);
}
