/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author danic
 */
public class NodeBook {
    private String title ;
     private String author ;
      private Boolean isAvailable ;
       private int ISBN ;
        private String genre ;
        private String index;
          NodeBook next;
  
          
            
    NodeBook (String title, String author, int ISBN, String genre, boolean isAvailable){
     this.ISBN = ISBN;
     this.author= author;
     this.title = title;
     this.genre = genre;
      this.isAvailable = isAvailable;
        this.next = null;
        
    }
      public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public NodeBook getNext() {
        return next;
    }

    // Setter methods for modifying book properties
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setNext(NodeBook next) {
        this.next = next;
    }

   

}