package solid_sod_bad_example_extension.java;

public class BookService {

    public static final int ISBN_GENRATOR = 1;
    public static final int ISSN_GENERATOR = 2;
    private IsbnGenerator isbnGenerator;
    private IssnGenerator issnGenerator;

    public BookService() {
        isbnGenerator = new IsbnGenerator();
        issnGenerator = new IssnGenerator();
    }

    //1 - isbnGenrator
    //2 - issnGenrator
    public Book createBook(String title, int typeGenrator) {
        if (typeGenrator == ISBN_GENRATOR) {
            return new Book(title, isbnGenerator.generateIsbnNumber());
        } else {
            if (typeGenrator == ISSN_GENERATOR)
                return new Book(title, issnGenerator.generateIssnNumber());
        }
        return null;
    }

}

/*
Single responsibility - violated
    1. Create a book
    2. Chose type generator
Open Closed - open  for extension  and close for modification  -violated
    We modified the createBook  for a new feature
*/
