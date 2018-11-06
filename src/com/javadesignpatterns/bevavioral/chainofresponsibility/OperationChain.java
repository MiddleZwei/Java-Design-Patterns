package com.javadesignpatterns.bevavioral.chainofresponsibility;

public interface OperationChain {
    void setNextChain(OperationChain nextChain);
    void performOperation(Numbers nnumbers);
}
