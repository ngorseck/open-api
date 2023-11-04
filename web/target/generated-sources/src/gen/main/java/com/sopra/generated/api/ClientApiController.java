package com.sopra.generated.api;

import com.sopra.generated.model.ClientDTO;
import com.sopra.generated.model.ClientResultListDTO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-04T02:13:04.009845800+01:00[Europe/Madrid]")
@Controller
@RequestMapping("${openapi.aPIDeTest.base-path:/service/api}")
public class ClientApiController implements ClientApi {

    private final ClientApiDelegate delegate;

    public ClientApiController(@Autowired(required = false) ClientApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ClientApiDelegate() {});
    }

    @Override
    public ClientApiDelegate getDelegate() {
        return delegate;
    }

}
