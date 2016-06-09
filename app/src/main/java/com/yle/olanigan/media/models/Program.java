package com.yle.olanigan.media.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Engineering on 6/9/2016.
 */
public class Program {

    private static List<ProgramItem> programList = new ArrayList<ProgramItem>();

        public static void addProgram(ProgramItem item){
                programList.add(item);
        }

    public static ProgramItem getByTitle(String title){
        //ProgramItem emptyItem = new ProgramItem();

            for (ProgramItem item : programList){
                if(item.getTitle() == title){
                    return item;
                }
            }

        //Return empty Item if title not found
        return new ProgramItem();
    }

    public int getCount(){
        return programList.size();
    }
}
