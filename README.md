# AlgorithmCode

该仓库收集一些算法的答案，目标是整理一套系统的算法参考答案以供其他学习者参考

我也在慢慢的学算法并且在坚持刷题，我会不定期的上传新的题目，希望大家共同努力！

在线编程网站：

- [LeetCode](https://leetcode-cn.com/problemset/all/)
- [牛客网-剑指offer](https://www.nowcoder.com/ta/coding-interviews?page=1)

### 目录

- [排序算法](#排序算法)
- [LeetCode](#LeetCode)
- [剑指offer](#剑指offer)

### 排序算法

| 算法 | 稳定 | 时间复杂度 | 空间复杂度 | 备注 |
| :---: | :---: |:---: | :---: | :---: |
| 选择排序 | no | N<sup>2</sup> | 1 | |
| 冒泡排序 | yes |  N<sup>2</sup> | 1 | |
| 插入排序 | yes |  N \~ N<sup>2</sup> | 1 | 时间复杂度和初始顺序有关 |
| 希尔排序 | no |  N 的若干倍乘于递增序列的长度 | 1 | |
| 快速排序 | no | NlogN | logN | |
| 三向切分快速排序 | no |  N \~ NlogN | logN | 适用于有大量重复主键|
| 归并排序 | yes |  NlogN | N | |
| 堆排序 | no |  NlogN | 1 | | |

快速排序是最快的通用排序算法，它的内循环的指令很少，而且它还能利用缓存，因为它总是顺序地访问数据。它的运行时间近似为 \~cNlogN，这里的 c 比其他线性对数级别的排序算法都要小。使用三向切分快速排序，实际应用中可能出现的某些分布的输入能够达到线性级别，而其它排序算法仍然需要线性对数时间。

- [选择排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/Selection.java)
- [插入排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/Insertion.java)
- [冒泡排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/Buddle.java)
- [冒泡排序改进版](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/Buddle2.java)
- [希尔排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/Shell.java)
- [自顶向下归并排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/UpToDownMergeSort.java)
- [自底向上归并排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/DownToUpMergeSort.java)
- [快速排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/QuickSort.java)
- [三向切分快速排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/ThreeWayQuickSort.java)
- [堆的基本操作](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/Heap.java)
- [堆排序](https://github.com/zfman/AlgorithmCode/blob/master/src/sort/HeapSort.java)

### LeetCode

**1-50**

- [2.两数相加](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution2.java)
- [7.反转整数](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution7.java)
- [9.回文数](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution9.java)
- [13.罗马数字转整数](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution13.java)
- [27.移除元素](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution27.java)
- [28.实现strStr()](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution28.java)
- [32.最长有效括号](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution32.java)
- [35.搜索插入位置](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution35.java)
- [38.报数](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution50/Solution38.java)

**51-100**

- [53.最大子序和](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution53.java)
- [58.最后一个单词的长度](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution58.java)
- [62.不同路径](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution62.java)
- [63.不同路径 II](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution63.java)
- [64.最小路径和](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution64.java)
- [66.加一](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution66.java)
- [67.二进制求和](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution67.java)
- [69.x的平方根](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution69.java)
- [83.删除排序链表中的重复元素](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution83.java)
- [100.相同的树](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution100/Solution100.java)

**101-150**

- [112.路径总和](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution150/Solution112.java)
- [125.验证回文串](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution150/Solution125.java)

**151-200**

- [160.相交链表](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution200/Solution160.java)
- [167.两数之和 II - 输入有序数组](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution200/Solution167.java)
- [188.杨辉三角](https://github.com/zfman/AlgorithmCode/blob/master/src/leetcode/all/solution200/Solution188.java)

### 剑指offer

- [两个链表的第一个公共结点](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/FindFirstCommonNodeSolution.java)
- [链表中倒数第k个结点](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/FindKthToTailSolution.java)
- [树的子结构](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/HasSubtreeSolution.java)
- [合并两个排序的链表](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/MergeSolution.java)
- [二叉树的镜像](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/MirrorSolution.java)
- [矩形覆盖](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/RectCoverSolution.java)
- [调整数组顺序使奇数位于偶数前面](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/ReOrderArraySolution.java)
- [反转链表](https://github.com/zfman/AlgorithmCode/blob/master/src/offer/ReverseListSolution.java)

