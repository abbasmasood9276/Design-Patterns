/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Lab;

/**
 *
 * @author aabik
 */
public class Teacher implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Teacher received update: " + message);
    }
}

