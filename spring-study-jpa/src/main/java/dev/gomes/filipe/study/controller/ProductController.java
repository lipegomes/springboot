package dev.gomes.filipe.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.gomes.filipe.study.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import dev.gomes.filipe.study.dto.ProductDTO;
import dev.gomes.filipe.study.model.Product;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/supermarket/product")
public class ProductController {


	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Product> saveProduct(@RequestBody ProductDTO dto) {
		return new ResponseEntity<>(productService.save(dto), HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/list")
	@ResponseBody
	public ResponseEntity<List<Product>> listProducts() {
		List<Product> products = productService.list();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	@ResponseBody
	public ResponseEntity<Product> updateProduct(@RequestBody ProductDTO dto) {
		Product p = productService.update(dto);
		return new ResponseEntity<>(p, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	@ResponseBody
	public ResponseEntity<String> deleteProduct(@PathVariable Long idproduct) {
		productService.delete(idproduct);
		return new ResponseEntity<>("Product successfully deleted", HttpStatus.ACCEPTED);
	}

}
