public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Author", "Author@upb.ro", 'm');
        System.out.println(author.toString());
        author.setEmail("Author@fils.upb.ro");
        System.out.println(author.toString());
    }
}
