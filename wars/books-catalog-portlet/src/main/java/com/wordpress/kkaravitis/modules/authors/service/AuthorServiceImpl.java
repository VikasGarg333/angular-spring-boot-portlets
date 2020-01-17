package com.wordpress.kkaravitis.modules.authors.service;

import com.wordpress.kkaravitis.modules.authors.model.AuthorDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Konstantinos Karavitis
 **/
@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

    @Override
    public List<AuthorDTO> getAuthors() {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setAuthorId("Author123");
        authorDTO.setAuthorName("Mark Jones");
        authorDTO.setAuthorRating("1");

        AuthorDTO authorDTO1 = new AuthorDTO();
        authorDTO.setAuthorId("Author223");
        authorDTO.setAuthorName("Vivekanand");
        authorDTO.setAuthorRating("5");

        AuthorDTO authorDTO2 = new AuthorDTO();
        authorDTO.setAuthorId("Author323");
        authorDTO.setAuthorName("Jonathon");
        authorDTO.setAuthorRating("5");
        return Arrays.asList(authorDTO, authorDTO1, authorDTO2);
    }
}
