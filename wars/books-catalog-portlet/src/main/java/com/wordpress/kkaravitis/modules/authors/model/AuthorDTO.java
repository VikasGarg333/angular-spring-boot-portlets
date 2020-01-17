package com.wordpress.kkaravitis.modules.authors.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Konstantinos Karavitis
 **/
public class AuthorDTO implements Serializable {
    private String authorId;
    private String authorName;
    private String authorRating;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorRating() {
        return authorRating;
    }

    public void setAuthorRating(String authorRating) {
        this.authorRating = authorRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDTO authorDTO = (AuthorDTO) o;
        return authorId.equals(authorDTO.authorId) &&
                authorName.equals(authorDTO.authorName) &&
                authorRating.equals(authorDTO.authorRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, authorName, authorRating);
    }

    @Override
    public String toString() {
        return "AuthorDTO{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorRating='" + authorRating + '\'' +
                '}';
    }
}
