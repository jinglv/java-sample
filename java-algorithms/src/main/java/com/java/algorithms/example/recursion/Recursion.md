# 递归
递归在程序语言中简单的理解是： **方法自己调用自己**(二叉树的许多性质在定义上就满足递归)

递归其实和循环是非常像的，循环都可以改写成递归，递归未必能改写成循环，这是一个充分不必要的条件。

递归必须知道两个条件：
- 递归出口(终止递归的条件)
- 递归表达式(规律)

那么，有了循环，为什么还要用递归呢？？ 在某些情况下(费波纳切数列，汉诺塔)，使用递归会比循环简单很多很多

## 递归与回溯
递归和回溯的关系密不可分：
- 递归的基本性质就是函数调用，在处理问题的时候，递归往往是把一个大规模的问题不断地变小然后进行推导的过程。
- 回溯则是利用递归的性质，从问题的起始点出发，不断地进行尝试，回头一步甚至多步再做选择，直到最终抵达终点的过程。