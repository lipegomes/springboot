package dev.gomes.filipe.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.gomes.filipe.study.dto.ProductDTO;
import dev.gomes.filipe.study.mapper.ProductMapper;
import dev.gomes.filipe.study.model.Product;
import dev.gomes.filipe.study.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	private final ProductMapper mapper; 

	
	@Autowired
	public ProductService(ProductRepository productRepository, ProductMapper mapper) {
		this.productRepository = productRepository;
		this.mapper = mapper;
	}
	
	// CREATE
	public Product save(ProductDTO dto) {
		return productRepository.save(mapper.dtoToModel(dto));
	}

	// READ
	public List<Product> list() {
		return productRepository.findAll();
	}

	// UPDATE
	public Product update(ProductDTO dto) {
		return productRepository.saveAndFlush(mapper.dtoToModel(dto));
	}
	
	 // DELETE
	public void delete(Long idproduct) {
		productRepository.deleteById(idproduct);
	}
}
