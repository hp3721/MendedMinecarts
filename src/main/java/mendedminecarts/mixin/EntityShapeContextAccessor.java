package mendedminecarts.mixin;

import net.minecraft.block.EntityShapeContext;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Optional;

@Mixin(EntityShapeContext.class)
public interface EntityShapeContextAccessor {

    @Accessor
    Optional<Entity> getEntity();
}
