/*  Created by IntelliJ IDEA.
 *  User: Kartik Kathuria
 *  Date: 22/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] allBooksThatAreCurrentlyAvailable;

    public Book[] getStoreAllBooksThatAreCurrentlyAvailable() {
        return allBooksThatAreCurrentlyAvailable;
    }

    public void setStoreAllBooksThatAreCurrentlyAvailable(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }

    public Library()  {
        this.allBooksThatAreCurrentlyAvailable = new Book[20];
        for (int index = 0; index < allBooksThatAreCurrentlyAvailable.length ; index++) {
            allBooksThatAreCurrentlyAvailable[index] = new Book("Book " + (index + 1));
        }
    }

    public Library(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }
}

