package donghyun.test5;

import java.time.LocalDateTime;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String content;
    private int bookNumber;
    private LocalDateTime createTime;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String Author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public void setBookNumber(int bookNumber){
        this.bookNumber = bookNumber;
    }
    public int getBookNumber(){
        return bookNumber;
    }

    Book(String title, String author, String publisher, String content, int bookNumber, LocalDateTime createTime){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.content = content;
        this.bookNumber = bookNumber;
        this.createTime = createTime;
    }
}
