package com.store.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:查找某种类型的文件。 
 * @Package com.store.folder
 * @ClassName: com.store.folder.FindFiles  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年9月8日 下午10:26:25
 */
public class FindFiles {

	public static List<File> getFileList(String strPath) {
		List<File> filelist=new ArrayList<File>(0);
        File dir = new File(strPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    getFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
                } else if (fileName.endsWith("rmvb")) { // 判断文件名是否以.rmvb结尾
                    String strFileName = files[i].getAbsolutePath();
                    System.out.println(strFileName);
                    filelist.add(files[i]);
                } else {
                    continue;
                }
            }
        }
        return filelist;
    }
	
	
	public static void main(String[] args) {
		String path="G:\\";
		List<File> filelist=getFileList(path);
		for (File file : filelist) {
			System.out.println(file);
		}
	}
}
