package m0nkeypr0grammer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class CollapsibleEMIMod implements ModInitializer {
    private static KeyBinding keyBinding;

    @Override
    public void onInitialize() {
        // Register the key binding
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.collapsibleemi.open_gui", 
            GLFW.GLFW_KEY_RIGHT, 
            "category.collapsibleemi"
        ));

        // Register a client tick event to check for the key press
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                openCollapsibleEMIGUI();
            }
        });
    }

    private void openCollapsibleEMIGUI() {
        // Implement the logic to open your GUI here
        System.out.println("Key pressed! Implement GUI opening logic here.");
    }
}
