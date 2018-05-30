package sa.common.model;

import model.enums.EventType;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Event {
    @Id
    private String id;
    private String ownerId;
    private LocalDate when;
    private EventType eventType;
}
