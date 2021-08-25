package com.core.microservices.core.material.services;

import java.time.LocalDateTime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.core.microservices.core.material.persistence.MaterialEntity;

@Mapper(componentModel = "spring")
public interface MaterialMapper {

	// @Mapping(target = "id", ignore = true)
	// @Mapping(target = "clarity", ignore = true)
	// @Mapping(target="fileName", source="fileName")
	// @Mapping(target="fromId", source="toId")
	// @Mapping(target="approval", source="approval")
	// @Mapping(target="createTime", source="createTime")
	// @Mapping(target="webUrl", source="webUrl")
	MaterialEntity dtoToEntity(String fileName, int fromId, int toId, String approval, LocalDateTime createTime, String webUrl);

}
