package org.sakaiproject.collaborativemaps.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.sakaiproject.collaborativemaps.api.model.CollaborativeMap;

public interface CollaborativeMapRepository extends CrudRepository<CollaborativeMap, Long> {
}
