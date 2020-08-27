/*  Created by IntelliJ IDEA.
 *  User: Kartik Kathuria
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] storeAllBooksThatAreCurrentlyAvailable;

    public Book[] getStoreAllBooksThatAreCurrentlyAvailable() {
        return storeAllBooksThatAreCurrentlyAvailable;
    }

    public void setStoreAllBooksThatAreCurrentlyAvailable(Book[] storeAllBooksThatAreCurrentlyAvailable) {
        this.storeAllBooksThatAreCurrentlyAvailable = storeAllBooksThatAreCurrentlyAvailable;
    }
}
