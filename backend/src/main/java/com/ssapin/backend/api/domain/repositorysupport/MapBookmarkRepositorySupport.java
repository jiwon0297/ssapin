package com.ssapin.backend.api.domain.repositorysupport;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssapin.backend.api.domain.entity.*;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MapBookmarkRepositorySupport extends QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public MapBookmarkRepositorySupport(JPAQueryFactory queryFactory) {
        super(MapBookmark.class);
        this.queryFactory = queryFactory;
    }

    public MapBookmark findByMapBookmark(Map map, User user) {
        return (MapBookmark) queryFactory.selectOne().from(QMapBookmark.mapBookmark)
                .where(QMapBookmark.mapBookmark.map.eq(map).and(
                        QMapBookmark.mapBookmark.user.eq(user)
                ))
                .fetch();
    }


}
