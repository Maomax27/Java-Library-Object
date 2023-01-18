/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libTime;

/**
 *
 * @author mauri
 * 
 *
Book class contains properties of a book
*/
class Book
{
    private static int id=0;
    private String name;
    private Author authors[] = new Author[10];//Author array for authors
    private int authornum=0;//numbers to keep track of number of authors of one book
    
    void Book(String name)
    {
        if(name.length()<50&&name.length()>5)
        {
        Setname(name);
        }
        else
        {
        Setname("No Title");    
        }
        this.id++;
    }
    void Setname(String name)
    {
        this.name = name;
    }
    int getID()
    {
        return id;
    }
    void addAuthor(String fname, String lname)
    {
        if(authornum<11)
        {
        this.authors[authornum] = new Author();
        this.authors[authornum].Author(fname, lname);
        this.authornum++;
        }
    }
    Author getAuthor(int num)
    {
        return authors[num];
    }
    String giveTitle()
    {
        return name;
    }
}
