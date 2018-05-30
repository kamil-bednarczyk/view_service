package sa.common.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Member {
    @Id
    private String id;
    private String username;
}
