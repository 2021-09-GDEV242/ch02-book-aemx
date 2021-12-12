/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Spencer Gunning
 * @version 2021.12.11
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    // 83 - create accessors for String fields
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }

    // 84 - create print utility methods for private fields
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }   
}