package com.ck.knowledge.dao;

import com.ck.knowledge.po.KnowledgePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeRepository extends JpaRepository<KnowledgePo,Long>, JpaSpecificationExecutor<KnowledgePo> {
}
