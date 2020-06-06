package xyz.acrylicstyle.gold;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class GoldenArmor extends JavaPlugin {
    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach(player -> {
                    ItemStack helmet = player.getInventory().getHelmet();
                    ItemStack chestplate = player.getInventory().getChestplate();
                    ItemStack leggings = player.getInventory().getLeggings();
                    ItemStack boots = player.getInventory().getBoots();
                    if (helmet != null && helmet.getType() == Material.GOLDEN_HELMET) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 50, 4, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 0, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 50, 127, false, true));
                    }
                    if (chestplate != null && chestplate.getType() == Material.GOLDEN_CHESTPLATE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 400, 0, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 50, 127, false, true));
                    }
                    if (leggings != null && leggings.getType() == Material.GOLDEN_LEGGINGS) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 50, 1, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 50, 1, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 50, 127, false, true));
                    }
                    if (boots != null && boots.getType() == Material.GOLDEN_BOOTS) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 50, 2, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 50, 2, false, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 50, 127, false, true));
                    }
                });
            }
        }.runTaskTimer(this, 40, 40);
    }
}
