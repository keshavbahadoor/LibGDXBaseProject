package util;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

/**
 * Created by Keshav on 2/17/2015.
 */
public class ServiceFactory
{
    private static final String LOGSERVICE_NAME = "LogService";
    private static Logger logService;
    private static AssetManager assetManager;
    private static SpriteBatch spriteBatch;


    /**
     * Creates all required services
     */
    public static void initServices()
    {
        logService = new Logger(LOGSERVICE_NAME);
        logService.setLevel(Logger.DEBUG);
        assetManager = new AssetManager();
        spriteBatch = new SpriteBatch();
    }

    /**
     * Expose log service
     * @return
     */
    public static Logger getLogService()
    {
        if (logService == null)
        {
            logService = new Logger(LOGSERVICE_NAME);
            logService.setLevel(Logger.DEBUG);
        }
        return logService;
    }

    /**
     * Expose assetmanager
     * @return
     */
    public static AssetManager getAssetManager()
    {
        if (assetManager == null)
        {
            assetManager = new AssetManager();
        }
        return assetManager;
    }

    /**
     * Exposes sprite batch
     * @return
     */
    public static SpriteBatch getSpriteBatch()
    {
        if (spriteBatch == null)
        {
            spriteBatch = new SpriteBatch();
        }
        return spriteBatch;
    }

}
