package com.base.project.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.base.project.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg)
    {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 1024;
        config.height = 768;
		new LwjglApplication(new MainGame(), config);
	}
}
