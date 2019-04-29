package com.kgisl.qs1;
import java.util.Arrays;
public class DeepToStng {   
public static void main(String[]args) {
String[][] deepArrStng=new String[][] { {"john", "mary" }, {"alice", "bob" } };
System.out.println(Arrays.deepToString(deepArrStng));
int[][] deepArrStng1=new int[][]{{4,5},{8,45}};
System.out.println(Arrays.deepToString(deepArrStng1));
}

}
