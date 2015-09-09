package dto.mainInformation;

import java.time.LocalDateTime;

/**
 * Created by Honey on 07.09.2015.
 */
public class Post {
    private String post_id;
    private Contact author;
    private String content;
    private LocalDateTime date;

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public Contact getAuthor() {
        return author;
    }

    public void setAuthor(Contact author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
