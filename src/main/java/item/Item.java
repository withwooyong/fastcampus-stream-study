package item;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Item {

    private Long id;       //상품 코드
    private String itemNm; //상품명
    private int price; //가격

    public static Item toEntity(ItemDto dto) {
        return Item.builder()
                .id(dto.getId())
                .itemNm(dto.getItemNm())
                .price(dto.getPrice())
                .build();

    }

    public static ItemDto toDto(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .itemNm(item.getItemNm())
                .price(item.getPrice())
                .build();
    }
}