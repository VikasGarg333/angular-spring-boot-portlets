package com.wordpress.kkaravitis.modules.authors.service;

import com.wordpress.kkaravitis.modules.authors.model.AuthorDTO;

import java.util.List;

/**
 * @author Konstantinos Karavitis
 **/
public interface AuthorService {
    public List<AuthorDTO> getAuthors();
}
