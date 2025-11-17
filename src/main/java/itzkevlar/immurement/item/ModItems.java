package itzkevlar.immurement.item;

import itzkevlar.immurement.Immurement;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EVIL_MCEVIL = registerItem("evilmcevil", new Item(new Item.Settings()));
    public static final Item HANDHELDGUMBLO = registerItem("handheldgumblo", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Immurement.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Immurement.LOGGER.info("Registering Mod Items for " + Immurement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register( entries -> {
            entries.add(EVIL_MCEVIL);
            entries.add(HANDHELDGUMBLO);
        });
    }
}
