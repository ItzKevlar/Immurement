package itzkevlar.immurement.item;

import itzkevlar.immurement.Immurement;
import itzkevlar.immurement.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Immurement.MOD_ID, "immurement_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.GUMBLO))
                    .displayName(Text.translatable("itemgroup.immurement.immurement_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GUMBLO);
                        entries.add(ModBlocks.SOUP);
                    }).build());

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Immurement.MOD_ID, "immurement_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HANDHELDGUMBLO))
                    .displayName(Text.translatable("itemgroup.immurement.immurement_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HANDHELDGUMBLO);
                        entries.add(ModItems.EVIL_MCEVIL);
                    }).build());


    public static void registerItemGroups() {
        Immurement.LOGGER.info("Registering Item Groups for " + Immurement.MOD_ID);
    }
}
