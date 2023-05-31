package com.crenu.Service

import com.crenu.Entity.UseConsumeItemEntity
import com.crenu.Repository.UseConsumeItemRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UseConsumeItemService(private val useConsumeItemRepository: UseConsumeItemRepository) {
    @Transactional
    fun saveUseConsumeItem(useConsumeItemEntity: UseConsumeItemEntity) {
        useConsumeItemRepository.save(useConsumeItemEntity)
    }
}