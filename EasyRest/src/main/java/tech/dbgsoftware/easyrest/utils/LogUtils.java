package tech.dbgsoftware.easyrest.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class LogUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogUtils.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public static String printGsonObject(final Object obj){
        String jsonResult = GSON.toJson(obj);
        LOGGER.info(jsonResult);
        return jsonResult;
    }

    public static void info(String string){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.info(string);
    }

    public static void info(Object obj){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.info(GSON.toJson(obj));
    }

    public static void debug(String string, Class aClass){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.debug("From " + aClass.getName() + ": " + string);
    }

    public static void debug(Object obj, Class aClass){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.debug("From " + aClass.getName() + ": " + GSON.toJson(obj));
    }

    public static void info(String string, Class aClass){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.info("From " + aClass.getName() + ": " + string);
    }

    public static void info(Object obj, Class aClass){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.info("From " + aClass.getName() + ": " + GSON.toJson(obj));
    }

    public static void error(String message, Object object){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.error(message, object);
    }

    public static void error(String message, Exception e){
        LOGGER.error(String.valueOf(new Date()));
        LOGGER.error(message, e);
    }
}
