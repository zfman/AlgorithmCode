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
- [码赛](#码赛)
- [笔试真题](#笔试真题)

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

- [选择排序](src/sort/Selection.java)
- [插入排序](src/sort/Insertion.java)
- [冒泡排序](src/sort/Buddle.java)
- [冒泡排序改进版](src/sort/Buddle2.java)
- [希尔排序](src/sort/Shell.java)
- [自顶向下归并排序](src/sort/UpToDownMergeSort.java)
- [自底向上归并排序](src/sort/DownToUpMergeSort.java)
- [快速排序](src/sort/QuickSort.java)
- [三向切分快速排序](src/sort/ThreeWayQuickSort.java)
- [堆的基本操作](src/sort/Heap.java)
- [堆排序](src/sort/HeapSort.java)

### LeetCode

**1-50**

- [2.两数相加](src/leetcode/all/solution1_50/Solution2.java)
- [7.反转整数](src/leetcode/all/solution1_50/Solution7.java)
- [9.回文数](src/leetcode/all/solution1_50/Solution9.java)
- [13.罗马数字转整数](src/leetcode/all/solution1_50/Solution13.java)
- [27.移除元素](src/leetcode/all/solution1_50/Solution27.java)
- [28.实现strStr()](src/leetcode/all/solution1_50/Solution28.java)
- [32.最长有效括号](src/leetcode/all/solution1_50/Solution32.java)
- [35.搜索插入位置](src/leetcode/all/solution1_50/Solution35.java)
- [38.报数](src/leetcode/all/solution1_50/Solution38.java)

**51-100**

- [53.最大子序和](src/leetcode/all/solution51_100/Solution53.java)
- [58.最后一个单词的长度](src/leetcode/all/solution51_100/Solution58.java)
- [62.不同路径](src/leetcode/all/solution51_100/Solution62.java)
- [63.不同路径 II](src/leetcode/all/solution51_100/Solution63.java)
- [64.最小路径和](src/leetcode/all/solution51_100/Solution64.java)
- [66.加一](src/leetcode/all/solution51_100/Solution66.java)
- [67.二进制求和](src/leetcode/all/solution51_100/Solution67.java)
- [69.x的平方根](src/leetcode/all/solution51_100/Solution69.java)
- [83.删除排序链表中的重复元素](src/leetcode/all/solution51_100/Solution83.java)
- [100.相同的树](src/leetcode/all/solution51_100/solution51_100.java)

**101-150**

- [110.二叉树的最小深度](src/leetcode/all/solution101_150/Solution111.java)
- [112.路径总和](src/leetcode/all/solution101_150/Solution112.java)
- [125.验证回文串](src/leetcode/all/solution101_150/Solution125.java)

**151-200**

- [160.相交链表](src/leetcode/all/solution151_200/Solution160.java)
- [167.两数之和 II - 输入有序数组](src/leetcode/all/solution151_200/Solution167.java)
- [188.杨辉三角](src/leetcode/all/solution151_200/Solution188.java)

**201-230**

- [226.翻转二叉树](src/leetcode/all/solution201_230/Solution226.java)

**301-350**

- [303.区域和检索 - 数组不可变](src/leetcode/all/solution301_350/Solution303.java)
- [304.二维区域和检索 - 矩阵不可变](src/leetcode/all/solution301_350/Solution304.java)

**351-400**

- [383.赎金信](src/leetcode/all/solution351_400/Solution383.java)
- [354.俄罗斯套娃信封问题](src/leetcode/all/solution351_400/Solution354.java)

**401-430**

- [404.左叶子之和](src/leetcode/all/solution401_430/Solution404.java)

**431-500**

- [437.路径总和 III](src/leetcode/all/solution431_500/Solution437.java)
- [442.数组中重复的数据](src/leetcode/all/solution431_500/Solution442.java)
- [448.找到所有数组中消失的数字](src/leetcode/all/solution431_500/Solution448.java)

**501-530**

- [543.二叉树的直径](src/leetcode/all/solution501_530/Solution543.java)
- [563.二叉树的坡度](src/leetcode/all/solution501_530/Solution563.java)
- [572.另一个树的子树](src/leetcode/all/solution501_530/Solution572.java)

**601-630**

- [606.根据二叉树创建字符串](src/leetcode/all/solution601_630/Solution606.java)

**631_700**

- [687.最长同值路径(递归)](src/leetcode/all/solution631_700/Solution687.java)
- [698.划分为k个相等的子集（递归）](src/leetcode/all/solution631_700/Solution698.java)

**731-800**

- [746.使用最小花费爬楼梯](src/leetcode/all/solution731_800/Solution746.java)
- [779.第K个语法符号](src/leetcode/all/solution731_800/Solution779.java)

### 剑指offer

- [两个链表的第一个公共结点](src/offer/FindFirstCommonNodeSolution.java)
- [链表中倒数第k个结点](src/offer/FindKthToTailSolution.java)
- [树的子结构](src/offer/HasSubtreeSolution.java)
- [合并两个排序的链表](src/offer/MergeSolution.java)
- [二叉树的镜像](src/offer/MirrorSolution.java)
- [矩形覆盖](src/offer/RectCoverSolution.java)
- [调整数组顺序使奇数位于偶数前面](src/offer/ReOrderArraySolution.java)
- [反转链表](src/offer/ReverseListSolution.java)

### 码赛

- [股神](src/masai/GuShen.java)

### 笔试真题

- [阿里2019秋招模拟题-内存回收](src/ali2019/Main.java)
- [阿里2019秋招在线测评-工时预估](src/ali2019/MaxWorkinghourGap.java)
- [阿里2019秋招笔试题1-火柴棍](src/ali2019/Main2.java)
- [阿里2019秋招笔试题2-送快递](src/ali2019/Main3.java)
- [腾讯2019笔试模拟题-纸牌游戏](src/tencent/Main1.java)
- [迅雷2019笔试模拟-求数列的和](src/other/XunleiTest1.java)
- [迅雷2019笔试模拟-水仙花数](src/other/XunleiTest2.java)
- [迅雷2019笔试模拟-数组中消失的数字](src/other/Xunlei1.java)
- [迅雷2019笔试模拟-最长无重复字符子串长度](src/other/Xunlei2.java)
- [京东2017秋招真题-集合](src/jd/Solution1.java)

