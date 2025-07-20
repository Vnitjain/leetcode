package my.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> seenFolders = new HashSet<>(Arrays.asList(folder));
        List<String> result = new ArrayList<>();

        for(String path: folder){
            result.add(path);
            for(int i=0;i<path.length();i++){
                if(path.charAt(i)=='/' && seenFolders.contains(path.substring(0,i)) ){
                    result.removeLast();
                    break;
                }
            }
        }
        return result;
    }
}
