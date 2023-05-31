package com.crenu.Service

import com.crenu.Entity.GetConsumeItemEntity
import com.crenu.Repository.GetConsumeItemRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class GetConsumeItemService(private val getConsumeItemRepository: GetConsumeItemRepository) {
    @Transactional
    fun saveGetConsumeItem(getConsumeItemEntity: GetConsumeItemEntity) {
        getConsumeItemRepository.save(getConsumeItemEntity)
    }
}