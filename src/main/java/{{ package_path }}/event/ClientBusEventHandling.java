package {{ package_name }}.event;

import {{ package_name }}.{{ main_class }};
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = {{ main_class }}.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientBusEventHandling {
    // Use for client side mod loading events
}
