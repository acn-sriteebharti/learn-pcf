package pcf.demo.dao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="wt_members")
public class MembersDAO {
    @Id
    private Integer id;

    @Column(name="member_name")
    private String name;

    private String skill;

    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamDAO team = new TeamDAO();


}
