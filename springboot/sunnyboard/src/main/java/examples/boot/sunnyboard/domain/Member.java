package examples.boot.sunnyboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sunny_member")
@Setter
@Getter
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
