有效学习书籍推荐:
 - 书名：Outliters
 - 中文版译名：《异类：不一样的成功启示录》
 - 作者：马尔科姆.格拉德威尔

# 数据结构
- 一维
    - 基础：数组array(string)、 链表linked、list
    - 高级：栈stack、队列queue、双端队列deque、集合set、映射map(hash or map)、etc.
- 二维
    - 基础：树tree、图graph
    - 高级：二叉搜索树binary search tree(read-black tree，AVL)、并查集disjoint set，字典树Trie，etc.
- 特殊
    - 位运算Bitwise、布隆过滤器BloomFilter
    - LRU Cache

![image-20200814161745813](https://gitee.com/JeanLv/study_image/raw/master///image-20200814161745813.png)

# 算法
- if-else, switch -> branch
- for, while loop -> Iteration
- 递归Recursion(Divide & Conquer, Backtrace)
- 搜索Search
    - 深度优先搜索 Depth first search
    - 广度优先搜索 Breadth first search
    - A*, etc
- 动态规划 Dynamic Programming
- 二分查找 Binary Search
- 贪心Greedy
- 数学Math，几何Geometry

![image-20200814161808885](https://gitee.com/JeanLv/study_image/raw/master///image-20200814161808885.png)

# 复杂度分析
## 时间复杂度
Big O notation
- O(1)：Constant Complexity 常数复杂度
- O(log n)：Logarithmic Complexity 对数复杂度
- O(n)：Linear Complexity 线性时间复杂对
- O(n^2)：N square Complexity 平方
- O(n^3)：N cubic Complexity 立方
- O(2^n)：Exponential Growth 指数
- O(n!)：Factorial 阶乘

注意：只看最高复杂度的运算

```
// O(1) 不管n是多少，print只执行一次
int n = 1000;
System.out.println("Hey-your input is:" + n);

// O(?) print执行三次，也可以说是O(3)，但都是常数级的，其实都是O(1)（注意：不要说什么O(2)、O(3)...只要是常数级的都是O(1)）
int n = 1000;
System.out.println("Hey-your input is:" + n);
System.out.println("Hmm...I'm doing more stuff with:" + n);
System.out.println("And more:" + n);

// O(N) n的线性关系
for(int i = 1; i <= n; i++) {
    System.out.println("Hey-I'm busy looking at:" + i);
}

// O(N^2) 如果n是100的话，循环嵌套100^2，如果是三次嵌套就是100^3
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n; j++) {
        System.out.println("Hey-I'm busy looking at:" + i + "and" + j);
    }
}

// O(log(n)) log(2n)
for(int i = 1; i < n; i = i * 2){
    System.out.println("Hey-I'm busy looking at:" + i);
}

// O(k^n) 递归的形式 指数级的
int fib(int n){
    if(n < 2){
        return n;
    }
    return fib(n-1) + fib(n-2);
}
```
时间复杂度的曲线


### 实例分析
计算 1+2+3+...+n
- 方法一：从1到n的循环累加，时间复杂度O(n)
  ```
    y=0
    for i=1 to n:
        y+1
  ```
- 方法二：求和公式sum=n(n+1)/2，时间复杂度O(1)
  ```
    y=n*(n+1)/2
  ```
### 分析递归复杂度
Fib：0，1，1，2，3，5，8，13，21
- F(n) = F(n-1) + F(n-2)

递归方式
```
int fib(int n){
    if (n<=2) return n;
}
```

### Master Theorem

## 空间复杂度

# 排序算法
# 数据结构基础
## 数据结构概述
- 存储数据的空间排列
- 查询数据的操作方式
- 数据结构核心：**有效占用空间、查询数据时间**
## 常见的数据结构
## 时间复杂度和空间复杂度