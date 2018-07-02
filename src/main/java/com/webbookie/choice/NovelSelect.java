package com.webbookie.choice;

import java.util.ArrayList;
import java.util.List;


public class NovelSelect {

    public List getAvailableNovels(NovelType type){

        List novels = new ArrayList();

        if(type.equals(NovelType.HORROR)){
            novels.add("The Shining by Stephen King");
            novels.add("Lasher byAnne Rice");
            novels.add("Frankenstein by Mary Shelley");

        }else if(type.equals(NovelType.HISTORICAL)){
            novels.add("Drood by Dan Simons");
            novels.add("A Tale of Two Cities by Charles Dickens");

        }else if(type.equals(NovelType.FANTASY)){
            novels.add("Lord Of Rings by J.R.R.Torkein");
            novels.add("A Game Of Thrones by George R.R.Martin");
            novels.add("Harry Potter by J.K.Rowling");
        }else if(type.equals(NovelType.MYSTERY)){
            novels.add("The perfect Murder by Ruskin");
            novels.add("The girl with dragon tattoo Steig larson");

        }else if(type.equals(NovelType.THRILLER)){
            novels.add("Behind her eyes by Sarah Pinborough");
            novels.add("Into the darkest corner by Elizabeth Haynes");

        }else {
            novels.add("No Novel Available");
        }
        return novels;
    }
}
