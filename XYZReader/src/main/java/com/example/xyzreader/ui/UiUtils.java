package com.example.xyzreader.ui;

/**
 * Created by Ishan on 06-11-2016.
 */

public class UiUtils {
    private static final String ARTICLE_IMAGE_TRANSITION_NAME = "ARTICLE_IMAGE_POSITION";
    public static String getArticleTransitionName(int position){
        return new String(ARTICLE_IMAGE_TRANSITION_NAME+position);
    }
}
