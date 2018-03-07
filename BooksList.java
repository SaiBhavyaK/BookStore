/**
 * 
 */
package com.pack;

/**
 * @author bhavya
 *
 */
public interface BooksList {

	public Book[] list(String searchString);

	public boolean add(Book book, int quantity);

	public int[] buy(Book... books);

}
