package dev.yestoday.yestoday.core.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.yestoday.yestoday.core.post.domain.Post;
import dev.yestoday.yestoday.core.user.dto.UserDTO;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public class PostResponse {
    @JsonProperty
    private Long id;
    @JsonProperty

    private Long userId;
    @JsonProperty
    private Long todoId;
    @JsonProperty
    private String todoName;
    @JsonProperty
    private String content;
    @JsonProperty
    private String imageUrl;
    @JsonProperty
    private String imageType;
    @JsonProperty
    private Long likeNumbers;
    @JsonProperty
    private Long commentNumbers;
    @JsonProperty
    private LocalDateTime postDateTime;

    @JsonProperty
    private UserDTO user;

    public PostResponse(@NotNull Post post) {
        this.id = post.getId();
        this.userId = post.getUserId();
        this.todoName = post.getTodoName();
        this.content = post.getContent();
        this.imageUrl = post.getImageUrl();
        this.imageType = post.getImageType();
        this.likeNumbers = post.getLikeNumbers();
        this.commentNumbers = post.getCommentNumbers();
        this.postDateTime = post.getPostDateTime();
        this.todoId = post.getTodoId();
        this.user = new UserDTO(post.getUser());
    }
}
