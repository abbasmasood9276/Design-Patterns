/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aabik
 */
public class Main {
    public static void main(String[] args) {
      
        Book book1 = BookFactory.createBook("Game Development", "Ibtisam Gull");
        Book book2 = BookFactory.createBook("OOP", "Usman");

      
        System.out.println(book1);
        System.out.println(book2);
    }
}
