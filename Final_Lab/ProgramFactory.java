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
public class ProgramFactory {
    public Program createProgram(String type) {
        if ("Undergraduate".equalsIgnoreCase(type)) {
            return new UndergraduateProgram();
        } else if ("Graduate".equalsIgnoreCase(type)) {
            return new GraduateProgram();
        }
        return null;
    }
}

