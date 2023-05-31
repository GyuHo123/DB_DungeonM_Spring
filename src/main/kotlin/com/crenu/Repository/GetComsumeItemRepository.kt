package com.crenu.Repository

import com.crenu.Entity.GetConsumeItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GetConsumeItemRepository : JpaRepository<GetConsumeItemEntity, Long>