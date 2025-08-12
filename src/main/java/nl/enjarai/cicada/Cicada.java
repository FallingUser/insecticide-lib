package nl.enjarai.cicada;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import nl.enjarai.cicada.api.util.ProperLogger;
import org.slf4j.Logger;

public final class Cicada implements ModInitializer {
    public static final String MOD_ID = "cicada";
    public static final Logger LOGGER = ProperLogger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
    }

    public static Identifier id(String path) {
        //? if >=1.21 {
        return Identifier.of(MOD_ID, path);
        //?} else
        /*return new Identifier(MOD_ID, path);*/
    }
}
