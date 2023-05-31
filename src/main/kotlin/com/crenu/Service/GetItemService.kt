package com.crenu.Service

import com.crenu.Entity.GetItemEntity
import com.crenu.Repository.GetItemRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class GetItemService(private val getItemRepository: GetItemRepository) {
    @Transactional
    fun saveGetItem(getItemEntity: GetItemEntity) {
        getItemRepository.save(getItemEntity)
    }
}
