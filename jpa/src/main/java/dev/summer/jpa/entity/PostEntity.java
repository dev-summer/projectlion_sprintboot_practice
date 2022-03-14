package dev.summer.jpa.entity;

//id int
//title varchar
//content varchar
//writer varchar
//board int

import javax.persistence.*;

@Entity //JPA에서 어떻게 작동해야 하는지
@Table(name = "post")
public class PostEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String writer;

//    @ManyToOne(
//            targetEntity = BoardEntity.class,
//            fetch = FetchType.LAZY
//    )
//    @JoinColumn(name = "board_id")
//    private BoardEntity boardEntity;

    public PostEntity() {
    }

    public PostEntity(Long id, String title, String content, String writer) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

//    public BoardEntity getBoardEntity() {
//        return boardEntity;
//    }
//
//    public void setBoardEntity(BoardEntity boardEntity) {
//        this.boardEntity = boardEntity;
//    }
}
