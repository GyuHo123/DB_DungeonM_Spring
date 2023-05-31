package com.crenu.Service

import com.crenu.Repository.UseItemRepository
import com.crenu.Entity.UseItemEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UseItemService(private var useItemRepository: UseItemRepository){
    @Transactional
    fun saveUseItem(useItemEntity: UseItemEntity) {
        useItemRepository.save(useItemEntity)
    }
}
