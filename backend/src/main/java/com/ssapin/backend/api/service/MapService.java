package com.ssapin.backend.api.service;

import com.ssapin.backend.api.domain.dto.request.HashtagRequest;
import com.ssapin.backend.api.domain.dto.request.MapRequest;
import com.ssapin.backend.api.domain.dto.response.MapResponse;
import com.ssapin.backend.api.domain.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MapService {
    Long createMap(User user, MapRequest.MapRegister mapRegister);

    Long updateMap(MapRequest.MapEdit mapEdit);

    void deleteMap(long mapId);

    MapResponse detailMap(long mapId);

    Page<MapResponse> getMapList(long campusId, List<HashtagRequest> hashtagList, String keyword, Pageable pageable);

    List<MapResponse> getRankingList(long campusId);
}
