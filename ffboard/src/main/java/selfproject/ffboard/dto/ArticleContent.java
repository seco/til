package selfproject.ffboard.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleContent {
    private Long articleId;
    private String content;

    public ArticleContent() {

    }
}
