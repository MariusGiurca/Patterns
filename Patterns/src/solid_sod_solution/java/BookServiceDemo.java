package solid_sod_solution.java;

public class BookServiceDemo {

    public static void main(String[] args) {

        BookService bookServiceIsbn = new BookService(new IsbnGenerator());
        Book book1 = bookServiceIsbn.createBook("name1");

        BookService bookServiceIssn =  new BookService(new IssnGenerator());
        Book book2 = bookServiceIssn.createBook("name2");

        System.out.println(book1);
        System.out.println(book2);

    }
}

/* Dependency Inversion
*  Alegerea dependintei pentru Bookservice este controloata din extrior.
*  Alegerea dependintei pentru Bookservice este controloata din extrior,  s-a inversat fata de primul  exemplu unde controlul  alegerii  dependintei se afla in  clasa Bookservice.
*  Utimizand interfete si schimband implementarea la runtime clasele sunt mai decuplate
*/