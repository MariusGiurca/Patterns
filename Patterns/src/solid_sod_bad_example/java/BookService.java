package solid_sod_bad_example.java;


public class BookService {

    private IsbnGenerator isbnGenerator;

    public BookService() {
        isbnGenerator = new IsbnGenerator();
    }

    public Book createBook(String title) {
        return new Book(title, isbnGenerator.generateIsbnNumber());
    }

}
