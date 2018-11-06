package com.javadesignpatterns.bevavioral.chainofresponsibility;

public class Subtract implements OperationChain {
    private OperationChain chain;

    @Override
    public void setNextChain(OperationChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void performOperation(Numbers request) {
        if(request.getOperand() == RequestType.SUBTRACT){
            System.out.println(request.getA() + " - " + request.getB() + " = " + (request.getA()-request.getB()));
        }else{
            chain.performOperation(request);
        }
    }
}
