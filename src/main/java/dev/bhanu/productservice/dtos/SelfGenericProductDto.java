package dev.bhanu.productservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SelfGenericProductDto {
    UUID uuid;
    String title;
    String description;
    String image;
    String price;
    String category;
}
