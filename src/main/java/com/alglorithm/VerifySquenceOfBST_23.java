package com.alglorithm;

import org.junit.Test;

/**
 * CreatedBy cx
 * CreateTime 2018/5/2 21:33
 * Description 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int length = sequence.length;
        if (sequence==null||length==0){
            return false;
        }
        return judge(sequence,0,length-1);
    }

    public boolean judge(int []a,int start,int end){
        for (int i = start; i <= end; i++) {
            if (a[i]>a[end]){
                for (int j = i; j <end ; j++) {
                    if (a[j]<=a[end]){
                        return false;
                    }
                }
                return judge(a,start,i-1)&&judge(a,i,end-1);
            }
        }
        return true;
    }

@Test
    public void main() {
        int a[]={4,8,6,12,16,14,10};
        System.out.println(VerifySquenceOfBST(a));
    }
}
