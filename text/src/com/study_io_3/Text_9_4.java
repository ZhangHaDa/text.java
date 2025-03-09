package com.study_io_3;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Text_9_4 {
    public static void main(String[] args) throws IOException {
        File scr = new File("text\\aa.txt");
        File dest = new File("text\\aaa.txt");
        FileUtils.copyFile(scr,dest);
        //FileUtil

    }
}
