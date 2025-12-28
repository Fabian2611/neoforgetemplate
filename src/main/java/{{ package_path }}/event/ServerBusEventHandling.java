package {{ package_name }}.event;

import {{ package_name }}.{{ main_class }};
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = {{ main_class }}.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerBusEventHandling {
    // Use for server side lifecycle events
    // Make sure to manually ensure server side only handling
}
