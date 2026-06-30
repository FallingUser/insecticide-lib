package nl.enjarai.cicada;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import nl.enjarai.cicada.api.conversation.ConversationManager;
import nl.enjarai.cicada.api.util.CicadaEntrypoint;
import nl.enjarai.cicada.api.util.JsonSource;
import nl.enjarai.cicada.api.util.ProperLogger;
import nl.enjarai.cicada.api.util.YamlSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public final class Cicada implements ModInitializer, CicadaEntrypoint {
	public static final String MOD_ID = "cicada";
	public static final Logger LOGGER = ProperLogger.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
