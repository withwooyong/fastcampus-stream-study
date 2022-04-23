package chapter4.model;

import lombok.*;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@ToString
public class User {
    private final int id;
    private final String name;
}
