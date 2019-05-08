package org.moduleap.itemapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ItemApiApplication implements ItemController {

	public static void main(String[] args) {
		SpringApplication.run(ItemApiApplication.class, args);
	}

	@Override
	public ResponseEntity<?> createItem(){
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}

}
