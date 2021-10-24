package dev.gomes.filipe.study.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import dev.gomes.filipe.study.dto.ProductDTO;
import dev.gomes.filipe.study.model.Product;

@Mapper
public interface ProductMapper {
	
	//(componentModel = "spring")
	
	//@Mapping(target = "modelToDTO.id", source = "id")
	ProductDTO modelToDTO(Product product); 

	List<ProductDTO> toProductDTOs(List<Product> products);
	
	//@InheritInverseConfiguration
	Product dtoToModel(ProductDTO productDTO);
}
