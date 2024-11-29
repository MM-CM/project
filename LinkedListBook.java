
  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author danic
 */
public class LinkedListBook {
    public  static   NodeBook head;
    private int size;

    // Constructor to initialize and add some default books
    public LinkedListBook() {
        head = null;
        size = 0;
        
        addBook("The Great Gatsby", "F. Scott Fitzgerald", 1001, "Fiction", false);
        addBook("1984", "George Orwell", 1002, "Fiction", true);
        addBook("Introduction to Algorithms", "Thomas H. Cormen", 1003, "Education", true);
        addBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 1004, "Non-Fiction", true);
        addBook("Educated", "Tara Westover", 1005, "Non-Fiction", true);
    }

    // Method to add a book
    public void addBook(String title, String author, int ISBN, String genre, boolean isAvailable) {
        NodeBook newNode = new NodeBook(title, author, ISBN, genre, isAvailable);
        
        if (head == null) {
            head = newNode;
        } else {
            NodeBook current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
     public void addAtBeginning(String title, String author, int ISBN, String genre, boolean isAvailable) {
    NodeBook newNode = new NodeBook(title, author, ISBN, genre, isAvailable);
    newNode.next = head; // Point the new node's next to the current head
    head = newNode;      // Update head to the new node
    size++;              // Increment the size of the list
}
  public void addAtPosition(int position, String title, String author, int ISBN, String genre, boolean isAvailable) {
    if (position < 0 || position > size) {
        System.out.println("Invalid position");
        return;
    }

    NodeBook newNode = new NodeBook(title, author, ISBN, genre, isAvailable);

    // Special case: adding at the beginning
    if (position == 0) {
        newNode.next = head;
        head = newNode;
    } else {
        NodeBook current = head;
        // Traverse to the node just before the specified position
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next; // Link the new node to the next node
        current.next = newNode;     // Link the previous node to the new node
    }

    size++; // Increment the size of the list
}

    // Method to remove a book by ISBN
    public void removeBook(int ISBN) {
        if (head == null) return; // List is empty

        // Special case: the book to remove is the head
        if (head.getISBN() == ISBN) {
            head = head.next;
            size--;
            return;
        }

        NodeBook current = head;
        while (current.next != null && current.next.getISBN() != ISBN) {
            current = current.next;
        }

        // If the book is found, remove it
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }
       public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 0) {
            head = head.next;
        } else {
            NodeBook current = head;
            for (int i = 0; i < position - 1; i++) {
                if (current == null || current.next == null) {
                    return;
                }
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
        public void deleteAtBeginning(int ISBN){
            if (head == null) {
                return; // List is empty
            }
            head = head.next;
            size--;
        }


 

    // Convert the list to a 2D array for displaying in a table
    public Object[][] getBookData() {
        Object[][] bookData = new Object[size][5];  // Assuming 5 columns: Title, Author, ISBN, Genre, Availability
        NodeBook current = head;
        int index = 0;
        while (current != null) {
            bookData[index][0] = current.getTitle();
            bookData[index][1] = current.getAuthor();
            bookData[index][2] = current.getISBN();
            bookData[index][3] = current.getGenre();
            bookData[index][4] = current.getIsAvailable();
            current = current.next;
            index++;
        }
        return bookData;
    }

    // Update the availability of a book by ISBN
    public static void updateAvailability(int ISBN, boolean isAvailable) {
        NodeBook current = head;
        while (current != null) {
            if (current.getISBN() == ISBN) {
                current.setIsAvailable(isAvailable);
                System.out.println("Updated ISBN: " + ISBN + " | Available: " + current.getIsAvailable());
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    
    public NodeBook LinearSearch(int ISBN) {
        NodeBook current = head;
        while (current != null) {
            if (current.getISBN() == ISBN) {
                return current;
            }
            
            current = current.next;
        }
        return null;  // Book not found
    }

    // Delete a book at a specific position
 

    // Method to convert linked list to array for other operations
   public NodeBook[] toArray() {
    // First, find the size of the LinkedList to create the array
    int size = 0;
    NodeBook current = head;  // head is the first book in the list

    // Traverse the linked list to calculate its size
    while (current != null) {
        size++;
        current = current.getNext();
    }
    
    // Create an array to hold the books
    NodeBook[] booksArray = new NodeBook[size];

    // Now, fill the array with data from the LinkedList
    current = head;  // Start again from the head
    int index = 0;
    while (current != null) {
        booksArray[index] = current;  // Copy the book node into the array
        index++;
        current = current.getNext();  // Move to the next node in the linked list
    }

    return booksArray;
}
    //method to sort books by title(alphabetical order)
   public static void quickSortByTitle(NodeBook[] booksArray, int low, int high) {  
    if (low >= high) {
        return;
    }

    NodeBook pivot = booksArray[high]; // Use the last element as the pivot
    int leftPointer = low; 
    int rightPointer = high;

    while (leftPointer < rightPointer) {//2 pointers to traverse array
        
        // Move left pointer right as long as title is less than or equal to pivot title
        while (booksArray[leftPointer].getTitle().compareTo(pivot.getTitle()) <= 0 && leftPointer < rightPointer) {//compareTo method compares 2 strings alphabeticallu
            leftPointer++;
        }
         // Move right pointer until element smaller than th pivot 
        while (booksArray[rightPointer].getTitle().compareTo(pivot.getTitle()) >= 0 && leftPointer < rightPointer) {
            rightPointer--;
        }
        //swap left & right pointer if kailangan
        swap(booksArray, leftPointer, rightPointer);
    }
    //swap pivot sa correct position
    swap(booksArray, leftPointer, high);

    // Recursively sort the partitions
    quickSortByTitle(booksArray, low, leftPointer - 1);
    quickSortByTitle(booksArray, leftPointer + 1, high);
}
        // A method that swaps two elements in array of NodeBook
     private static void swap(NodeBook[] arr, int i, int j) {
         NodeBook temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
   
    // method to sort the book in the table based on title
    public Object[][] sortByTitle() {
    // Convert to array
    NodeBook[] booksArray = toArray();

    // Sort the array using quicksort, sorting by title
    quickSortByTitle(booksArray, 0, booksArray.length - 1);

    // Update the LinkedList (optional, if you want to keep it sorted)
    head = null;
    size = 0;
    for (NodeBook book : booksArray) {
        addBook(book.getTitle(), book.getAuthor(), book.getISBN(), book.getGenre(), book.getIsAvailable());
    }

    // Return sorted data for the table
    Object[][] sortedBooks = new Object[booksArray.length][5];
    for (int i = 0; i < booksArray.length; i++) {
        sortedBooks[i][0] = booksArray[i].getTitle();
        sortedBooks[i][1] = booksArray[i].getAuthor();
        sortedBooks[i][2] = booksArray[i].getISBN();
        sortedBooks[i][3] = booksArray[i].getGenre();
        sortedBooks[i][4] = booksArray[i].getIsAvailable();
    }

    return sortedBooks;
}
     // method to get genre of selected ISBN
      static public String getGenre(int ISBN){
     NodeBook  current = head;
     while(current!=null){
         if (current.getISBN() == ISBN){
             return current.getGenre();
         }
         current = current.getNext();
     }
     return null;
 }

  public void add(NodeBook book) {
    if (head == null) {
        head = book;  // Set the first book as head if the list is empty
    } else {
        NodeBook current = head;
        // Traverse to the last node in the list
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // Set the next node of the last node to the new book
        current.setNext(book);
    }
}
 
         public boolean updateBook(int isbn, String title, String author, String genre) {
    // Iterate through the linked list to find the book by ISBN and update its details
    NodeBook current = head;
    while (current != null) {
        if (current.getISBN() == isbn) {
            current.setTitle(title);
            current.setAuthor(author);
            current.setGenre(genre);
            return true; // Book updated successfully
        }
        current = current.getNext();
    }
    return false; // Book not found
}
         //to retrieve nodeBook at specific index
    public NodeBook getAtIndex(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Invalid index.");
    }
    NodeBook current = head;
    for (int i = 0; i < index; i++) {
        current = current.getNext();
    }
    return current;
}
    
  
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    





























//    NodeBook head;
//      private int size;
//    
//    LinkedList(){
//        head = null;
//        size =0;
//         addBook("The Great Gatsby", "F. Scott Fitzgerald", 1001, "Fiction", true);
//        addBook("1984", "George Orwell", 1002, "Fiction", true);
//        addBook("Introduction to Algorithms", "Thomas H. Cormen", 1003, "Education", true);
//        addBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 1004, "Non-Fiction", true);
//        addBook("Educated", "Tara Westover", 1005, "Non-Fiction", true);
//    }
//      
//    public void addBook(String title, String author, int ISBN, String genre,boolean isAvailable){
//        NodeBook newNode = new NodeBook(title,author,ISBN,genre, isAvailable);
//        if(head == null){
//            head = newNode;
//        }
//        else{
//        NodeBook current = head;
//        while(current.next != null){
//           current = current.next;
//    }
//        current.next = newNode;
//    }
//    size++;
//}
//
////        public void deleteAtBeginning(int ISBN){
////            if (head == null) {
////                return; // List is empty
////            }
////            head = head.next;
////            size--;
////        }
////    
////    public void deleteAtEnd(){
////        if(head == null){
////            return;
////        }
////        if(head.next == null){
////            head = null;
////            size--;
////            return;
////        }
////        NodeBook current = head;
////        while(current.next.next != null){
////            current = current.next;
////        }
////        current.next = null;
////        size--;
////    }
////        public void deleteAtPosition(int position){
////            if(position < 0 || position >= size){
////                System.out.println("Invalid Position");
////                return;
////            }
////            if(position == 0){
////                head = head.next;
////            }else{
////                // Traverse the list to find the second-to-last node
////                NodeBook current = head;
////            for(int i = 0; i < position - 1; i++){
////                if(current == null || current.next == null){
////                    return;
////                }
////                // Remove the last node
////                current = current.next;
////            }
////            size--;
////        }
////        }
//           public void removeBook(int ISBN) {
//        if (head == null) {
//            return; // List is empty
//        }
//
//        // Special case: the book to remove is the head
//        if (head.getISBN() == ISBN) {
//            head = head.next;
//            size--;
//            return;
//        }
//
//        // Search for the book in the list
//        NodeBook current = head;
//        while (current.next != null && current.next.getISBN() != ISBN) {
//            current = current.next;
//        }
//
//        // If the book is found, remove it
//        if (current.next != null) {
//            current.next = current.next.next;
//            size--;
//        }
//    }
//  
//    //traversing
//   public Object[][] getBookData() {
//       
//     //int size = getSize();
//    Object[][] bookData = new Object[size][5];  // Assuming 5 columns: Title, Author, ISBN, Genre, Availability
//    
//    NodeBook current = head;
//    int index = 0;
//       System.out.println("Mag add na");
//    while (current != null) {
//        bookData[index][0] = current.getTitle();
//        bookData[index][1] = current.getAuthor();
//        bookData[index][2] = current.getISBN();
//        bookData[index][3] = current.getGenre();
//        bookData[index][4] = current.getIsAvailable();
//        System.out.println(bookData[index][0] = current.getTitle());
//        current = current.next;
//        index++;
//        
//    }
//       System.out.println("Na add na");
//    return bookData;
//}
//     public boolean updateAvailability(int ISBN, boolean isAvailable) {
//        NodeBook current = head;
//        while (current != null) {
//            if (current.getISBN() == ISBN) {
//                current.setIsAvailable(isAvailable);
//                return true;
//            }
//            current = current.next;
//        }
//
//        return false; // Book not found
//    }
//     
// 
//   public static void quickSort(String[] arr, int low, int high) {
//        if (low >= high) {
//            return;
//        }
//        String pivot = arr[high];
//        int leftPointer = low;
//        int rightPointer = high;
//
//        try {
//            while (leftPointer < rightPointer) {
//                while (arr[leftPointer].compareTo(pivot) <= 0 && leftPointer < rightPointer) {
//                    leftPointer++;
//                }
//                while (arr[rightPointer].compareTo(pivot) >= 0 && leftPointer < rightPointer) {
//                    rightPointer--;
//                }
//                swap(arr, leftPointer, rightPointer);
//            }
//            swap(arr, leftPointer, high);
//            quickSort(arr, low, leftPointer - 1);
//            quickSort(arr, leftPointer + 1, high);
//        } catch (Exception e) {
//            System.out.println("Error during sorting: " + e.getMessage());
//        }
//    }
//
//    // Swap method for Strings
//   private static void swap(String[] arr, int i, int j) {
//        String temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//
//         
//
//  public void add(NodeBook book) {
//    if (head == null) {
//        head = book;  // Set the first book as head if the list is empty
//    } else {
//        NodeBook current = head;
//        // Traverse to the last node in the list
//        while (current.getNext() != null) {
//            current = current.getNext();
//        }
//        // Set the next node of the last node to the new book
//        current.setNext(book);
//    }
//}
//  public NodeBook[] toArray() {
//    NodeBook[] booksArray = new NodeBook[size];
//    NodeBook current = head;
//    int index = 0;
//
//    while (current != null) {
//        booksArray[index] = current;
//        current = current.next;
//        index++;
//    }
//
//    return booksArray;
//}
//  //
//  public Object[][] sortByGenre() {
//    // Convert to array
//    NodeBook[] booksArray = toArray();
//
//    // Sort the array using quicksort
//   // quickSort(booksArray, 0, booksArray.length - 1);
//
//    // Update the LinkedList (optional, if you want to keep it sorted)
//    head = null;
//    size = 0;
//    for (NodeBook book : booksArray) {
//        addBook(book.getTitle(), book.getAuthor(), book.getISBN(), book.getGenre(), book.getIsAvailable());
//    }
//
//    // Return sorted data for the table
//    Object[][] sortedBooks = new Object[booksArray.length][5];
//    for (int i = 0; i < booksArray.length; i++) {
//        sortedBooks[i][0] = booksArray[i].getTitle();
//        sortedBooks[i][1] = booksArray[i].getAuthor();
//        sortedBooks[i][2] = booksArray[i].getISBN();
//        sortedBooks[i][3] = booksArray[i].getGenre();
//        sortedBooks[i][4] = booksArray[i].getIsAvailable();
//    }
//
//    return sortedBooks;
//}
//  
//  //Linear Search
// public NodeBook searchBookByISBN(int ISBN) {
//    NodeBook current = head;
//    while (current != null) {
//        if (current.getISBN() == ISBN) {
//            return current;  // Return the original NodeBook object
//        }
//        current = current.next;
//    }
//    return null;  // Book not found
//}
////    public static void main(String[] args) {
////        LinkedList linkedlist = new LinkedList();
//    }
 























// public void deleteAtBeginning(int ISBN){
//        
////    public void removeBook(int ISBN) {
//        if (head == null) {
//            return; // List is empty
//        }
//        head = head.next;
//    }
////
////        // Special case: the book to remove is the head
////        if (head.getISBN() == ISBN) {
////            head = head.next;
////            size--;
////            return;
////        }
////
////        // Search for the book in the list
////        NodeBook current = head;
////        while (current.next != null && current.next.getISBN() != ISBN) {
////            current = current.next;
////        }
////
////        // If the book is found, remove it
////        if (current.next != null) {
////            current.next = current.next.next;
////            size--;
////        }
////    }
