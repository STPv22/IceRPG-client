package net.ice.spell;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class Spell {

        public void spellLightning() {
		    if (!world.isRemote) {
			    world.spawnEntityInWorld(new EntityLightningBolt(world, playerLocation.X, playerLocation.Y, playerLocation.Z));
		    }
        }
}