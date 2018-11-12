package examples.boot.sunnyboard.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sunny_board")
@Getter
@Setter
public class Board { // 영속성이.부여될.객체 이것을 엔티티라고한다 //엔티티는.반드시.식별자를.가지고있어야.한다.
    @Id //식별자
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 20)
    private Long id;
    // 20 not null
    @Column(nullable = false, length = 255)
    private String name;
    // 255 not null
    // @Lob // longtext
    @Column(nullable = false, columnDefinition = "TEXT")
    private String title;
    // text not null
    private String content;
    private int readCount;
    // now()
    @Column
    @CreationTimestamp
    private LocalDateTime regdate;

    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;

//    public Board() {
//        regdate = LocalDateTime.now(); //와스에있는 시간이저장.
//    }
}
