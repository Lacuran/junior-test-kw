package com.junior.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.junior.constants.Constants;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;


public final class FileUtils {

  private static JsonObject readFromJson(final String fileName) {
    try {
      final var jsonPath = getPath() + fileName + ".json";
      return JsonParser.parseReader(new FileReader(jsonPath)).getAsJsonObject();
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  private static String getPath() {
    return MessageFormat.format("{0}{1}src{1}main{1}resources{1}", System.getProperty("user.dir"), File.separator);
  }

  public static Integer getNumber() {
    return (readFromJson(Constants.FILE_NAME).get(Constants.MEMBER1).getAsInt()) - Constants.VALUE;
  }

  public static Integer getIndex() {
    return (readFromJson(Constants.FILE_NAME).get(Constants.MEMBER2).getAsInt()) + Constants.VALUE;
  }
}
