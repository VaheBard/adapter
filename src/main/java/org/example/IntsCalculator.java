package org.example;

public class IntsCalculator implements Ints {
    public final Calculator calcObject;

    public IntsCalculator() {
        this.calcObject = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double result = calcObject
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double result = calcObject
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) result;
    }

    @Override
    public int pow(int a, int b) {
        double result = calcObject
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) result;
    }
}
