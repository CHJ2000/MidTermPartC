/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
public class UserProfile 
{
    
    private String name; //user name
    private String genre;// the user's preferred genre of movie

    public UserProfile(String name, String genre)
    {
        this.name = name;
        this.genre = genre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getName() {
        return name;
    }

    /**
     * @param userID the userID to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String toString(){
        return "Name: " + name + ", Favourite Genre: " + genre;
    }
    
    
    
    
}//end class
