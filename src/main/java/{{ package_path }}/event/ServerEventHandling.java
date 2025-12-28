package {{ package_name }}.event;

import {{ package_name }}.{{ main_class }};
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = {{ main_class }}.MOD_ID)
public class ServerEventHandling {
    // Use for server side runtime events
    // Make sure to manually ensure server side only handling
}