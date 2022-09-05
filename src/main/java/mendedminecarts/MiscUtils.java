package mendedminecarts;

import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class MiscUtils {
    public static Vec3d vec3d_withAxis(Vec3d vec3d, Direction.Axis axis, double value) {
        double d = axis == Direction.Axis.X ? value : vec3d.x;
        double e = axis == Direction.Axis.Y ? value : vec3d.y;
        double f = axis == Direction.Axis.Z ? value : vec3d.z;
        return new net.minecraft.util.math.Vec3d(d, e, f);
    }
}
