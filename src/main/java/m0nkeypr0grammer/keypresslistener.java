package m0nkeypr0grammer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class keypresslistener {
    // Define and initialize your key binding (replace "yourKeyDescription" with an appropriate description)
    private final KeyBinding keyBinding = new KeyBinding("yourKeyDescription", GLFW.GLFW_KEY_G, "Your Category");

    public keypresslistener() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                if (keyBinding.isPressed() && GLFW.glfwGetKey(client.getWindow().getHandle(), GLFW.GLFW_KEY_LEFT_ALT) == GLFW.GLFW_PRESS) {
                    // Open the GUI
                    openCollapsibleEMIGUI();
                }
            }
        });
    }

    private void openCollapsibleEMIGUI() {
        // Create and open the GUI
        // Implement your GUI opening logic here
    }
}
