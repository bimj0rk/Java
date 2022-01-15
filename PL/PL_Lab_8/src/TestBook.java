public class TestBook {
    public static void main(String[] args){
        Author author1 = new Author("Author", "Author@upb.ro", 'm');
        Book book1 = new Book("Java for dummies", author1, 19.95, 1000);
        Book book2 = new Book("C for dummies", new Author("Teacher", "teacher@upb.ro", 'm'),
                29.95, 999);

        //a
        System.out.println(book1.toString());

        System.out.println(book2.toString());

        System.out.println();

        //b
        System.out.println(author1.getName());
        System.out.println(author1.getEmail());

        Author author2 = book2.getAuthor();
        System.out.println(author2.getName());
        System.out.println(author2.getEmail());

        System.out.println();

        //c
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getAuthorEmail());
        System.out.println(book1.getAuthorGender());

        System.out.println(book2.getAuthorName());
        System.out.println(book2.getAuthorEmail());
        System.out.println(book2.getAuthorGender());

        System.out.println();
    }
}
