package com.example.xyzreader.ui;

public class Utils {
    private static final String ARTICLE_IMAGE_TRANSITION_NAME = "ARTICLE_IMAGE_POSITION";
    public static String getArticleTransitionName(int position){
        return new String(ARTICLE_IMAGE_TRANSITION_NAME+position);
    }
}
