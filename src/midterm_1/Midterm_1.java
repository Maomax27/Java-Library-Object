/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm_1;

/**
 *
 * @author Mauricio Garzon Llanos
/*
main public class to run commands and test classes
*/
public class Midterm_1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Book c1 = new Book();//creates book object
        c1.Book("Hello");//sets title for new book
        Book c2 = new Book();
        c2.Book("Goodbye");
        c1.addAuthor("Joe", "Mackdonald");//gives author to book by adding first name and last name
        Author one = c1.getAuthor(0);//gets name of the author from book object and stores in author object
        
        one.print();//prints name of author
    }
    
}

