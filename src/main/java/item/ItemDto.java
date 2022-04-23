package item;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ItemDto {

    private Long id;
    private String itemNm;
    private Integer price;
}