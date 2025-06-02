package io.github.mastersguide.item;

import io.github.mastersguide.MastersGuide;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MastersGuide.MODID);

    public static final DeferredItem<Item> DUNGEONSTEEL = ITEMS.register("dungeonsteel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_DUNGEONSTEEL = ITEMS.register("raw_dungeonsteel",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
