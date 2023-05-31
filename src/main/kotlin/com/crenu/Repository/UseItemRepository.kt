package com.crenu.Repository

import com.crenu.Entity.UseItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UseItemRepository : JpaRepository<UseItemEntity, Long>
