package dev.yestoday.yestoday.core.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 775424072L;

    public static final QUser user = new QUser("user");

    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final ListPath<dev.yestoday.yestoday.core.follow.domain.Follow, dev.yestoday.yestoday.core.follow.domain.QFollow> followings = this.<dev.yestoday.yestoday.core.follow.domain.Follow, dev.yestoday.yestoday.core.follow.domain.QFollow>createList("followings", dev.yestoday.yestoday.core.follow.domain.Follow.class, dev.yestoday.yestoday.core.follow.domain.QFollow.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imageUrl = createString("imageUrl");

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final ListPath<dev.yestoday.yestoday.core.post.domain.Post, dev.yestoday.yestoday.core.post.domain.QPost> posts = this.<dev.yestoday.yestoday.core.post.domain.Post, dev.yestoday.yestoday.core.post.domain.QPost>createList("posts", dev.yestoday.yestoday.core.post.domain.Post.class, dev.yestoday.yestoday.core.post.domain.QPost.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}
