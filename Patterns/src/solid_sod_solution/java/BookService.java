package solid_sod_solution.java;

public class BookService {

    private NumberGenerator numberGenerator;

    public BookService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Book createBook(String title) {
        return new Book(title, numberGenerator.generateNumber());
    }
}

/*
Single responsibility
    The only responsibility is to create books
Open Closed - open  for extension  and close for modification  -violated
    We didn't modify the BookService for a new feature (a new generator)
Dependency Inversion
    Clasa BookService are un rol clar si nu depinde de tipul de implementare a generatoruli.
*/
