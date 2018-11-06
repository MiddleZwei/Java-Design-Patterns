package com.javadesignpatterns.bevavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        OperationChain start = new Add();
        OperationChain chain2 = new Subtract();
        OperationChain chain3 = new Multiply();
        OperationChain chain4 = new Delete();

        start.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(start);

        Numbers request1 = new Numbers(2, 3, RequestType.ADD);
        Numbers request2 = new Numbers(7, 3, RequestType.SUBTRACT);
        Numbers request3 = new Numbers(4, 3, RequestType.MULTIPLY);
        Numbers request4 = new Numbers(9, 4, RequestType.DIVIDE);

        start.performOperation(request1);
        start.performOperation(request2);
        start.performOperation(request3);
        start.performOperation(request4);
    }
}
