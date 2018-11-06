package com.javadesignpatterns.bevavioral.chainofresponsibility;

public class Numbers {
    private int a;
    private int b;
    private RequestType operand;

    public Numbers(int a, int b, RequestType op) {
        this.a = a;
        this.b = b;
        this.operand = op;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public RequestType getOperand() {
        return operand;
    }
}
