package sa.common.kafka.receiver;

import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import sa.common.model.Member;
import sa.common.repository.TeamViewRepository;

@Component
@Log4j2
public class UserUpdatedMessageHandler {

    @Autowired
    private TeamViewRepository teamViewRepository;
    private Gson gson = new Gson();

    @KafkaListener(topics = "${kafka.topic.userUpdated}")
    public void receive(ConsumerRecord<String, String> record) {
        log.info("received payload='{}'", record.toString());
        Member member = gson.fromJson(record.value(), Member.class);
        log.info(member.toString());
    }
}