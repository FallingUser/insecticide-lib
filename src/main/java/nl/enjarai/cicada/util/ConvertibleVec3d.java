package nl.enjarai.cicada.util;

import net.minecraft.world.phys.Vec3;
import org.apache.commons.lang3.NotImplementedException;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public interface ConvertibleVec3d {
    default Vector3d toVector3d() {
        throw new NotImplementedException("Mixin in cicada broke!! WHaT!?");
    }

    default Vec3 fromVector3d(Vector3dc vector) {
        throw new NotImplementedException("Mixin in cicada broke!! WHaT!?");
    }
}
