/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_1;

/**
 *
 * @author mauri
 *
    Author class contains properties of a person such as their name
 */
class Author
{
    private String fname;//first name
    private String lname;//last name
    
    
    void Author(String fname, String lname)
    {
        setFname(fname);
        setLname(lname);
    }
    
    void setFname(String fname)//sets name
    {
        this.fname = fname;
    }
    void setLname(String lname)//sets last name
    {
        this.lname = lname;
    }
    
    void print()
    {
        System.out.println(this.fname+" "+ this.lname);
    }
}
