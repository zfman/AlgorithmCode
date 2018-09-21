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

**1-100**

- [2.两数相加](src/leetcode/all/solution1_100/Solution2.java)
- [7.反转整数](src/leetcode/all/solution1_100/Solution7.java)
- [9.回文数](src/leetcode/all/solution1_100/Solution9.java)
- [13.罗马数字转整数](src/leetcode/all/solution1_100/Solution13.java)
- [27.移除元素](src/leetcode/all/solution1_100/Solution27.java)
- [28.实现strStr()](src/leetcode/all/solution1_100/Solution28.java)
- [32.最长有效括号](src/leetcode/all/solution1_100/Solution32.java)
- [35.搜索插入位置](src/leetcode/all/solution1_100/Solution35.java)
- [38.报数](src/leetcode/all/solution1_100/Solution38.java)
- [53.最大子序和](src/leetcode/all/solution1_100/Solution53.java)
- [58.最后一个单词的长度](src/leetcode/all/solution1_100/Solution58.java)
- [62.不同路径](src/leetcode/all/solution1_100/Solution62.java)
- [63.不同路径 II](src/leetcode/all/solution1_100/Solution63.java)
- [64.最小路径和](src/leetcode/all/solution1_100/Solution64.java)
- [66.加一](src/leetcode/all/solution1_100/Solution66.java)
- [67.二进制求和](src/leetcode/all/solution1_100/Solution67.java)
- [69.x的平方根](src/leetcode/all/solution1_100/Solution69.java)
- [83.删除排序链表中的重复元素](src/leetcode/all/solution1_100/Solution83.java)
- [100.相同的树](src/leetcode/all/solution1_100/Solution100.java)

**101-200**

- [110.二叉树的最小深度](src/leetcode/all/solution101_200/Solution111.java)
- [112.路径总和](src/leetcode/all/solution101_200/Solution112.java)
- [125.验证回文串](src/leetcode/all/solution101_200/Solution125.java)
- [160.相交链表](src/leetcode/all/solution101_200/Solution160.java)
- [167.两数之和 II - 输入有序数组](src/leetcode/all/solution101_200/Solution167.java)
- [188.杨辉三角](src/leetcode/all/solution101_200/Solution188.java)

**201-300**

- [226.翻转二叉树](src/leetcode/all/solution201_300/Solution226.java)
- [257.二叉树的所有路径](src/leetcode/all/solution201_300/Solution257.java)

**301-400**

- [303.区域和检索 - 数组不可变](src/leetcode/all/solution301_400/Solution303.java)
- [304.二维区域和检索 - 矩阵不可变](src/leetcode/all/solution301_400/Solution304.java)
- [383.赎金信](src/leetcode/all/solution301_400/Solution383.java)
- [354.俄罗斯套娃信封问题](src/leetcode/all/solution301_400/Solution354.java)

**401-500**

- [404.左叶子之和](src/leetcode/all/solution401_500/Solution404.java)
- [434. 字符串中的单词数](src/leetcode/all/solution401_500/Solution434.java)
- [437.路径总和 III](src/leetcode/all/solution401_500/Solution437.java)
- [442.数组中重复的数据](src/leetcode/all/solution401_500/Solution442.java)
- [443.压缩字符串](src/leetcode/all/solution401_500/Solution443.java)
- [448.找到所有数组中消失的数字](src/leetcode/all/solution401_500/Solution448.java)

**501_600**

- [520.检测大写字母](src/leetcode/all/solution501_600/Solution520.java)
- [541.反转字符串 II](src/leetcode/all/solution501_600/Solution541.java)
- [543.二叉树的直径](src/leetcode/all/solution501_600/Solution543.java)
- [551.学生出勤纪录 I](src/leetcode/all/solution501_600/Solution551.java)
- [557.反转字符串中的单词 III](src/leetcode/all/solution501_600/Solution557.java)
- [559.N叉树的最大深度](src/leetcode/all/solution501_600/Solution559.java)
- [563.二叉树的坡度](src/leetcode/all/solution501_600/Solution563.java)
- [572.另一个树的子树](src/leetcode/all/solution501_600/Solution572.java)
- [589.N叉树的前序遍历(未使用迭代算法)](src/leetcode/all/solution501_600/Solution589.java)
- [590.N叉树的后序遍历(未使用迭代算法)](src/leetcode/all/solution501_600/Solution590.java)

**601-700**

- [606.根据二叉树创建字符串](src/leetcode/all/solution601_700/Solution606.java)
- [653.两数之和 IV - 输入 BST](src/leetcode/all/solution601_700/Solution653.java)
- [684.冗余连接](src/leetcode/all/solution601_700/Solution684.java)
- [687.最长同值路径(递归)](src/leetcode/all/solution601_700/Solution687.java)
- [698.划分为k个相等的子集（递归）](src/leetcode/all/solution601_700/Solution698.java)

**701-800**

- [746.使用最小花费爬楼梯](src/leetcode/all/solution701_800/Solution746.java)
- [779.第K个语法符号](src/leetcode/all/solution701_800/Solution779.java)

**801_900**

- [859.亲密字符串](src/leetcode/all/solution801_900/Solution859.java)
- [872.叶子相似的树](src/leetcode/all/solution801_900/Solution872.java)

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
- [腾讯2019笔试-反转数列](src/tencent/Main2.java)
- [腾讯2019笔试-贪吃的小Q](src/tencent/Main3.java)
- [腾讯2019笔试-贪吃的小Q（别人的递归算法）](src/tencent/Main4.java)
- [腾讯2019笔试-和谐数](src/tencent/Main6.java)
- [迅雷2019笔试模拟-求数列的和](src/other/XunleiTest1.java)
- [迅雷2019笔试模拟-水仙花数](src/other/XunleiTest2.java)
- [迅雷2019笔试模拟-数组中消失的数字](src/other/Xunlei1.java)
- [迅雷2019笔试模拟-最长无重复字符子串长度](src/other/Xunlei2.java)
- [京东2017秋招真题-集合](src/jd/Solution1.java)
- [百词斩2019笔试题-时间相关](src/other/Baicizhan1.java)
- [百词斩2019笔试题-连续数字合并](src/other/Baicizhan2.java)
- [神策数据2019笔试题-日志输出](src/other/ShenCe.java)
- [神策数据2019笔试题-时间累加](src/other/ShenCe2.java)
- [神策数据2019笔试题-陀峰命名改为下划线命名](src/other/ShenCe1.java)

### 其他练习

- [图的输入和遍历](src/other/GraphTest.java)