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
    // 85 - modify object add a new private field with appropriate accessors
    private int pages;
    // 88 - modify object add a new private field with appropriate accessors
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // 90 - modify object add a new private field with appropriate accessors, mutators and reporting
    public void setRefNumber(String bookRefNumber)
    {
        if (bookRefNumber.length() >= 3) {
            refNumber = bookRefNumber;
        } else {
            System.out.println("ERROR: Please enter a reference number at least 3 characters long.");
        }
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
    public int getPages()
    {
        return pages;
    }
    public String getRefNumber()
    {
        return refNumber;
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

    // 87 - add a printDetails method that displays formatted output for all private fields
    // 89 - modify printDetails to add new content
    public void printDetails()
    {
        String strRef = refNumber.length() == 0 ? "ZZZ" : refNumber;
        System.out.println("Title: " + title + ", Author: " + author +
        ", Pages: " + pages + ", Ref: " + strRef);
    }
}