/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aabik
 */
class BookFactory {
  
    public static Book createBook(String title, String author) {
 
        return new Book(title, author);
    }
}
