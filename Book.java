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
    // 91 - modify object add a new private field with appropriate accessors, mutators and reporting
    private int borrowed;
    // 92 - modify object add a new private field with appropriate accessors, mutators and reporting
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourseText;
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

    public void borrow()
    {
        borrowed++;
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
    public int getBorrowed()
    {
        return borrowed;
    }
    public boolean isCourseText()
    {
        return courseText;
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
        String strBorrowed = borrowed == 1 ? borrowed + " time." : borrowed + " times.";
        System.out.println("Title: " + title + ", Author: " + author +
        ", Pages: " + pages + ", Ref: " + strRef +
        "\nThe book has been borrowed " + strBorrowed);
    }
}