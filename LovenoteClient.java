package com.lovenote;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class LovenoteClient extends Screen {
    public LovenoteClient() {
        super(Text.literal("Lovenote Newer"));
    }

    @Override
    protected void init() {
        // Initialize panels and components here
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // Render background and panels
        super.render(context, mouseX, mouseY, delta);
    }
}
