package com.jd1306.modcraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void  init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            //Load the Config file
            configuration.load();

           //Read in properties from the config file
            configValue = configuration.get("ForgeCraft", "configVaule", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {

            //Save the config file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);

    }

}
