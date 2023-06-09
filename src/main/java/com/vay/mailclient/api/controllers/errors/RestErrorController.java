package com.vay.mailclient.api.controllers.errors;

import com.vay.mailclient.api.dto.ErrorDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Controller
public class RestErrorController implements ErrorController {
    public static final String PATH = "/error";

    ErrorAttributes errorAttributes;

    public String getErrorPath() {
        return PATH;
    }

//    @RequestMapping(PATH)
//    public ResponseEntity<ErrorDto> error(WebRequest webRequest) {
//        Map<String, Object> attribute = errorAttributes.getErrorAttributes(
//                webRequest,
//                ErrorAttributeOptions.of(ErrorAttributeOptions.Include.EXCEPTION, ErrorAttributeOptions.Include.MESSAGE)
//        );
//        HttpStatus httpStatus = HttpStatus.valueOf((Integer) attribute.get("status"));
//        return ResponseEntity
//                .status(httpStatus.value())
//                .body(
//
//                )
//    }
}
