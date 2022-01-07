package Creational.Builder.secondWay;

public class Book {

    private String name;
    private String author;
    private int yearOfPublication;
    private String editor;

    public Book(String name, String author, int yearOfPublication, String editor) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.editor = editor;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getEditor() {
        return editor;
    }

    public static BookBuilder builder(){
        return new BookBuilder();
    }


    public static class BookBuilder {
        private String name;
        private String author;
        private int yearOfPublication;
        private String editor;

        public BookBuilder name(String name){
            this.name = name;
            return this;
        }

        public BookBuilder author(String author){
            this.author = author;
            return this;
        }

        public BookBuilder yearOfPublication(int yearOfPublication){
            this.yearOfPublication = yearOfPublication;
            return this;
        }

        public BookBuilder editor(String editor){
            this.editor = editor;
            return this;
        }

        public Book build() {
            return new Book(name, author, yearOfPublication, editor);
        }

    }
}
