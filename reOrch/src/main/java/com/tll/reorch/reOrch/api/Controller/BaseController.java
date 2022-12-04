package com.tll.reorch.reOrch.api.Controller;

import com.tll.reorch.reOrch.api.dto.ErrorMessage;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.logging.Logger;

public class BaseController {
    // Common objects and methods required by all controllers are present here

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(BaseController.class);

    protected final ResponseEntity<ErrorMessage> badRequest(String errorMessage) {

        return new ResponseEntity<ErrorMessage>(new ErrorMessage(errorMessage), HttpStatus.BAD_REQUEST);
    }

    protected final <T> ResponseEntity<T> ok(T value) {

        return new ResponseEntity<T>(value, HttpStatus.OK);
    }

    protected final <T> ResponseEntity<T> created(T value) {

        return new ResponseEntity<T>(value, HttpStatus.CREATED);
    }

    protected final <T> ResponseEntity<T> partiallyCreated(T value) {

        return new ResponseEntity<T>(value, HttpStatus.MULTI_STATUS);
    }

    protected final <T> ResponseEntity<T> noContent(T value) {

        return new ResponseEntity<T>(value, HttpStatus.NO_CONTENT);
    }

    protected final <T> ResponseEntity<T> accepted(T value) {

        return new ResponseEntity<T>(value, HttpStatus.ACCEPTED);
    }

}