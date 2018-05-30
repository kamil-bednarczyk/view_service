package sa.common.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class TeamView {
    @Id
    private String id;
    private String teamName;
    private List<Member> teamMates;
}