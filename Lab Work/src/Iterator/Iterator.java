
package Iterator;

/**
 *
 * @author aabik
 */
interface Iterator {
   boolean hasNext();
   Student next();
   boolean hasPrevious();
   Student previous();
   void moveToFirst();
   void moveToLast();
}