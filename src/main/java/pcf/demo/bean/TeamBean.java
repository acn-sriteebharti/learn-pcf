package pcf.demo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class TeamBean {

    private Integer id;
    private String teamName;
    private String teamRank;
    private Integer position;
    private String teamDesc;
    private String teamImage;
    private List<MemberBean> memberList;
}
