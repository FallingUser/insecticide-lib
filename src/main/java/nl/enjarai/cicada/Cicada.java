package nl.enjarai.cicada;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import nl.enjarai.cicada.api.util.ProperLogger;
import org.slf4j.Logger;

public final class Cicada implements ModInitializer {
    public static final String MOD_ID = "cicada";
    public static final Logger LOGGER = ProperLogger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
