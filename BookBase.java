/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Project;
import java.util.ArrayList;
import java.util.LinkedList;

public interface BookBase { 
    static ArrayList<String> title = new ArrayList<>();
    static ArrayList<String> author = new ArrayList<>();
    static ArrayList<Integer> ISBN = new ArrayList<>();
    static ArrayList<Boolean> availability = new ArrayList<>();
    static ArrayList<String> bookGenres = new ArrayList<>();
   public static Object[][] data = {
    {"1001", "Book One", "Author One", "Fiction", "Available"},
    {"1002", "Book Two", "Author Two", "Non-Fiction", "Checked Out"},
    {"1003", "Book Three", "Author Three", "Science", "Available"},
    {"1004", "Book Three", "Author Three", "Science", "Available"},
    {"1005", "Book Three", "Author Three", "Science", "Available"},
    {"1006", "Book Three", "Author Three", "Science", "Available"}
            
};
     public static Object [] header = {"ISBN","Title","Author","Genre","Availability"};
        public static Object [] header1 = {"ISBN","BorrowDate","DueDate","UserID"};
        
        public static Object[][] date = {
    {"1001", "10/11/2024", "15/11/2024", "1"},
    {"1002", "10/9/2024", "20/9/2024", "1"},
    {"1003", "10/2/2024", "15/2/2024", "2"},
    {"1004", "10/3/2024", "15/3/2024e", "3"},
    {"1005", "10/1/2024", "15/2/2024", "4"},
    {"1006", "10/3/2023", "10/3/2023", "5"}
            
        };
  
     static void initializeData() {
        for (Object[] row : data) {
            ISBN.add(Integer.parseInt((String) row[0])); // Convert String to Integer for ISBN
            title.add((String) row[1]); // Title
            author.add((String) row[2]); // Author
            bookGenres.add((String) row[3]); // Genre
            availability.add("Available".equals(row[4])); // True if "Available", false otherwise
        }
    
    }

    
    
    
   
    
    
}
//
//    static ArrayList<String> title = new ArrayList<>();
//    static ArrayList<String> author = new ArrayList<>();
//    static ArrayList<Integer> ISBN = new ArrayList<>();
//    static ArrayList<Boolean> availability = new ArrayList<>();
//    static ArrayList<String> bookGenres = new ArrayList<>();
//   public static Object[][] data = {
//    {"1001", "Book One", "Author One", "Fiction", "Available"},
//    {"1002", "Book Two", "Author Two", "Non-Fiction", "Checked Out"},
//    {"1003", "Book Three", "Author Three", "Science", "Available"},
//    {"1004", "Book Three", "Author Three", "Science", "Available"},
//    {"1005", "Book Three", "Author Three", "Science", "Available"},
//    {"1006", "Book Three", "Author Three", "Science", "Available"}
//            
//};
//     public static Object [] Hheader = {"ISBN", "AUTHOR", "TITLE", "GENRE", "DATE BORROWED", "DUE DATE", "DATE RETURN"};
//     public static Object [] header = {"ISBN","Title","Author","Genre","Availability"};
//        public static Object [] header1 = {"ISBN","BorrowDate","DueDate","UserID"};
//        
//        public static Object[][] date = {
//    {"1001", "10/11/2024", "15/11/2024", "1"},
//    {"1002", "10/9/2024", "20/9/2024", "1"},
//    {"1003", "10/2/2024", "15/2/2024", "2"},
//    {"1004", "10/3/2024", "15/3/2024e", "3"},
//    {"1005", "10/1/2024", "15/2/2024", "4"},
//    {"1006", "10/3/2023", "10/3/2023", "5"}
//                
//                
//            
//        };
//  
//     static void initializeData() {
//        for (Object[] row : data) {
//            ISBN.add(Integer.parseInt((String) row[0])); // Convert String to Integer for ISBN
//            title.add((String) row[1]); // Title
//            author.add((String) row[2]); // Author
//            bookGenres.add((String) row[3]); // Genre
//            availability.add("Available".equals(row[4])); // True if "Available", false otherwise
//        }
//    
//    }   
//}
