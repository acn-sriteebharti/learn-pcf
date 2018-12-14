package pcf.demo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MemberBean {

    private Integer id;
    private String name;
    private String skill;
    private String imageUrl;
    private TeamBean team;

}
