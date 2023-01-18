/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libTime;

/**
 *
 * @author mauri
/*
Library class to contain many book objects
*/
class Library
{
    private String name;
    private Book books[]=new Book[1000]; //limit of a 1000 books
    private int booknum=0;
    
    void setName(String name)
    {
        this.name = name;
    }
    void addBook(Book book)
    {
        if(booknum<1000)
        {
            books[booknum]=book;
            booknum++;
        }
    }
    Book[] searchBooks(String name)
    {
        Book[] booksfound=new Book[1000];
        int count=0;
        for(int i=0;i<booknum;i++)
        {
            String book = books[booknum].giveTitle().toLowerCase();
            name.toLowerCase();
            if(book.equals(name))
            {
                booksfound[count]=books[booknum];
                count++;
            }
        }
        
        return booksfound;
    }
    String giveName()
    {
        return name;
    }
    
}
