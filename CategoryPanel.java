package com.lovenote.ui.panel;

import com.lovenote.ui.component.Component;
import net.minecraft.client.gui.DrawContext;

public class CategoryPanel {
    private final String name;
    private final Component[] components;

    public CategoryPanel(String name, Component... components) {
        this.name = name;
        this.components = components;
    }

    public void render(DrawContext context, int x, int y, int width, int height) {
        // Render panel background and components
    }
}
