package com.lovenote.ui.component;

import net.minecraft.client.gui.DrawContext;

public abstract class Component {
    public abstract void render(DrawContext context, int x, int y, int width, int height);
}