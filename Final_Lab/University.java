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
public class University {
    private static University instance;
    private ProgramFactory programFactory;

    private University() {
        this.programFactory = new ProgramFactory();
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public ProgramFactory getProgramFactory() {
        return programFactory;
    }
}

