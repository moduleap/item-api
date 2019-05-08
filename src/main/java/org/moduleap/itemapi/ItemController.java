package org.moduleap.itemapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface ItemController {
    @PostMapping("/item")
    ResponseEntity<?> createItem();
}
