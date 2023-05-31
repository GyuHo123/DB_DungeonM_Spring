package com.crenu.Repository

import com.crenu.Entity.GetItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GetItemRepository: JpaRepository<GetItemEntity, Long>
