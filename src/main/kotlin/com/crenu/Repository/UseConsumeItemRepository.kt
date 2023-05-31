package com.crenu.Repository

import com.crenu.Entity.UseConsumeItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UseConsumeItemRepository : JpaRepository<UseConsumeItemEntity, Long>
