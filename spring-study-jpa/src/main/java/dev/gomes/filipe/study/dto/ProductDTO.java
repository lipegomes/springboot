package dev.gomes.filipe.study.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDTO {

	@SuppressWarnings("unused")
	private String name;
	
	@SuppressWarnings("unused")
	private Long quantity;
	
	@SuppressWarnings("unused")
	private Long price;
}
