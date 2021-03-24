package behavioral.visitor;


public class SimpleVisitor implements Visitor {
    @Override
    public void visitPaymentRequest(PaymentRequest request) {
        System.out.println(request.getClass().getName());
    }

    @Override
    public void visitPurchaseRequest(PurchaseRequest request) {
        System.out.println(request.getClass().getName());
    }
}
