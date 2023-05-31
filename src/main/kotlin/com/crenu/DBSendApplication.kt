package com.crenu
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import com.crenu.Repository.*
import com.crenu.Service.*
import com.crenu.Utility.LogProcessor
import org.springframework.boot.CommandLineRunner
import java.io.File

@SpringBootApplication
class Application {

	@Bean
	fun getItemServ(getItemRepository: GetItemRepository) = GetItemService(getItemRepository)

	@Bean
	fun useItemServ(useItemRepository: UseItemRepository) = UseItemService(useItemRepository)

	@Bean
	fun getConsumeItemServ(getConsumeItemRepository: GetConsumeItemRepository) = GetConsumeItemService(getConsumeItemRepository)

	@Bean
	fun useConsumeItemServ(useConsumeItemRepository: UseConsumeItemRepository) = UseConsumeItemService(useConsumeItemRepository)

	@Bean
	fun buyWorldShopItemServ(buyWorldShopItemRepository: BuyWorldShopItemRepository) = BuyWorldShopItemService(buyWorldShopItemRepository)


	@Bean
	fun logProcessor(
		getItemService: GetItemService,
		useItemService: UseItemService,
		getConsumeItemService: GetConsumeItemService,
		useConsumeItemService: UseConsumeItemService,
		buyWorldShopItemService: BuyWorldShopItemService
	) = LogProcessor(getItemService, useItemService, getConsumeItemService, useConsumeItemService, buyWorldShopItemService)

}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
