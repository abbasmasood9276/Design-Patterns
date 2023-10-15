/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aabik
 */
class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(int num1, int num2, int range) {
        if (num1 >= 0 && num1 <= 100) {
            System.out.println("Add: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else {
            nextHandler.handleRequest(num1, num2, range);
        }
    }
}
