package com.wordpress.kkaravitis.modules.authors.controller;

import com.wordpress.kkaravitis.modules.authors.model.AuthorDTO;
import com.wordpress.kkaravitis.modules.authors.service.AuthorService;
import com.wordpress.kkaravitis.modules.books.catalog.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Konstantinos Karavitis
 **/
@RestController
public class AuthorController {
    @Autowired
    AuthorService service;

    @GetMapping("/authors")
    public ResponseEntity<List<AuthorDTO>> getAuthors() throws ApplicationException {
        return new ResponseEntity<List<AuthorDTO>>(service.getAuthors(), HttpStatus.OK);
    }
}
