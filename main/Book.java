public class Book {
    private long ISBN;
    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;

    public Book(long ISBN, String title, String author, int numberOfPages, Genre genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }


        public long getISBN() {
            return ISBN;
        }

        public void setISBN(long ISBN) {
            this.ISBN = ISBN;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getNumberPages() {
            return numberOfPages;
        }

        public void setNumberPages(int numberOfpages) {
            if (this.numberOfPages <= 0) this.numberOfPages = numberOfpages;
        }

        public Genre getGenre() {
            return genre;
        }

        public void setGenre(Genre genre) {
            this.genre = genre;
    }

}