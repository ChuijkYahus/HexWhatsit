package io.github.jojotastic777.hexwhatsit.forge

import io.github.jojotastic777.hexwhatsit.HexwhatsitClient
import net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import thedarkcolour.kotlinforforge.forge.LOADING_CONTEXT

object ForgeHexwhatsitClient {
    fun init(event: FMLClientSetupEvent) {
        HexwhatsitClient.init()
        LOADING_CONTEXT.registerExtensionPoint(ConfigScreenFactory::class.java) {
            ConfigScreenFactory { _, parent -> HexwhatsitClient.getConfigScreen(parent) }
        }
    }
}
