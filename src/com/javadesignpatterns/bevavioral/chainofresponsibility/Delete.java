package com.javadesignpatterns.bevavioral.chainofresponsibility;

public class Delete implements OperationChain {
    private OperationChain chain;

    @Override
    public void setNextChain(OperationChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void performOperation(Numbers request) {
        if (request.getOperand() == RequestType.DIVIDE) {
            System.out.println(request.getA() + " / " + request.getB() + " = " + ((double) request.getA() / request.getB()));
        } else {
            chain.performOperation(request);
        }
    }
}
