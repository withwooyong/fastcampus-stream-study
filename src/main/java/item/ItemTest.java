package item;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemTest {

    @Getter
    @AllArgsConstructor
    static enum enumTest {
        NOTE_PAY("NOTE_PAY", "수기결제"),
        GENERAL_PAY("GENERAL_PAY", "일반결제"),
        SIMPLE_PAY("SIMPLE_PAY", "간편결제");
        final String code;
        final String value;
    }


    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(Item.builder().id(1L).itemNm("name1").price(1000).build());
        items.add(Item.builder().id(2L).itemNm("name2").price(2000).build());
        items.add(Item.builder().id(3L).itemNm("name3").price(3000).build());
        System.out.println(items);
        List<ItemDto> itemDtos = new ArrayList<>();
//        items.forEach(item -> itemDtos.add(Item.toDto(item)));
        List<Item> itemList = items.stream()
                .filter(item -> item.getItemNm().equals("name1"))
                .collect(Collectors.toList());
        System.out.println(itemList);

        Integer itemPrice = items.stream()
//                .filter(item -> item.getItemNm().equals("name1"))
                .mapToInt(Item::getPrice).sum();
        System.out.println(itemPrice);

        System.out.println(enumTest.GENERAL_PAY);
        System.out.println(enumTest.GENERAL_PAY.getCode());
        System.out.println(enumTest.GENERAL_PAY.getValue());
        if (String.valueOf(enumTest.GENERAL_PAY).equals(enumTest.GENERAL_PAY.getCode())) {
            System.out.println("true");
        }

        System.out.println("------------------");
//        final String pmCode;
//        final String oldCode;
//        final String oldValue;
//        final String newCode;
//        final String newValue;
//        CARD("11", "Card", "신용카드", "CARD", "신용카드"),
        System.out.println(YndCodePayTypeEnum.oCode("11"));
        System.out.println(YndCodePayTypeEnum.oValue("Card"));
        System.out.println(YndCodePayTypeEnum.nCode("11"));
        System.out.println(YndCodePayTypeEnum.nValue("CARD"));

//        List<ItemDto> itemDtos = new ArrayList<>();
//        itemDtos.add(ItemDto.builder().id(1L).itemNm("name1").price(1000).build());
//        itemDtos.add(ItemDto.builder().id(2L).itemNm("name2").price(2000).build());
//        itemDtos.add(ItemDto.builder().id(3L).itemNm("name3").price(3000).build());


//        Item item = Item.builder().id(1L).itemNm("name1").price(1000).build();
//        System.out.println(Item.toDto(item));

//        List<CartItem> cartItem = orderItemRequest.getProductItems().stream()
//                            .map(orderItemRequest1 -> CartItem.orderItemToCartItem(orderItemRequest1, userSeq))
//                            .collect(Collectors.toList());
//                    cartItems.addAll(cartItem);
//
//                    deliver = orderItemRequest.getProductItems().stream()
//                            .anyMatch(orderItemRequest1 -> orderItemRequest1.getPackageTypeCode().equals(PackageTypeEnum.REAL.getCode()));
    }
}
