package pcf.demo.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="wt_teams")
public class TeamDAO {

    @Id
    private Integer id;

    @Column(name="team_name")
    private String teamName;

    @Column(name="rank_no")
    private String teamRank;

    @Column(name="position_no")
    private Integer position;

    @Column(name="team_desc")
    private String teamDesc;

    @Column(name="image")
    private String teamImage;
}
