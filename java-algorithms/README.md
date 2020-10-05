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
复杂度是衡量代码运行效率的重要度量因素。

计算机通过一个个程序去执行计算任务，也就是对输入数据进行加工处理，并最终得到结果的过程。每个程序都是由代码构成的。可见，编写代码的核心就是要完成计算。但对于同一个计算任务，不同计算方法得到结果的过程复杂程度是不一样的，这对你实际的任务处理效率就有了非常大的影响。

衡量复杂度，会围绕以下两个维度进行：
1. 这段代码消耗的资源是**什么**
    - 代码执行过程中会消耗计算时间和计算空间，那需要衡量的就是时间复杂度和空间复杂度。
    - 举一个实际的例子：某个十字路口没有建立立交桥时，所有车辆通过红绿灯分批次行驶通过。当大量汽车同时过路口的时候，就会分别消耗大家的时间。但建了立交桥之后，所有车辆都可以同时通过了，因为立交桥的存在，等于是**消耗了空间资源，来换取了时间资源**。
2. 这段代码消耗的资源是**多少**
    - 不会关注这段代码对于资源消耗的绝对量，因为不管是时间还是空间，它们的消耗程度都与输入的数据量高度相关，输入数据少时消耗自然就少。
    - 为了更客观地衡量消耗程度，我们通常会关注时间或者空间消耗量与输入数据量之间的关系。

## 如何计算复杂度
**复杂度是一个关于输入数据量n的函数。**
假设你的代码复杂度是f(n)，那么就用个大写字母O和括号，把f(n)括起来就可以了，即O(f(n))。例如，O(n) 表示的是，复杂度与计算实例的个数n线性相关；O(logn)表示的是，复杂度与计算实例的个数n对数相关。

复杂度的计算方法遵循以下几个原则：
- **复杂度与具体的常系数无关**
    - 例如O(n)和O(2n)表示的是同样的复杂度。我们详细分析下，O(2n)等于O(n+n)，也等于O(n)+O(n)。也就是说，一段O(n)复杂度的代码只是先后执行两遍O(n)，其复杂度是一致的。

- **多项式级的复杂度相加的时候，选择高者作为结果**
    - 例如O(n²)+O(n)和O(n²)表示的是同样的复杂度。具体分析一下就是，O(n²)+O(n) = O(n²+n)。随着n越来越大，二阶多项式的变化率是要比一阶多项式更大的。因此，只需要通过更大变化率的二阶多项式来表征复杂度就可以了。

## 时间复杂度
时间复杂度与代码的结构有着非常紧密的关系

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

根据以上的内容，可以在加强实例：

**O(1) 也是表示一个特殊复杂度**，含义为某个任务通过有限可数的资源即可完成。此处有限可数的具体意义是，与**输入数据量n无关**

例如：
- 代码处理10条数据需要消耗5个单位时间资源，3个单位空间资源
- 处理1000条数据，还只是需要消耗5个单位时间资源，3个单位空间资源
- 从上述可知，消耗资源与输入的数据量无关，就是O(1)的复杂度

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
  
代码任务：对于输入的数组，输出与之逆序的数组，例如，输入a=[1,2,3,4,5]，输出b=[5,4,3,2,1]
- 方法一：初始化数组b，得到一个与a数组长度相等的全零数组。通过一个for循环，从左到右将a数组的元素，从右到左地赋值到b数组中，最后输出b得到的结果
    ```
    public static void reverseOne() {
            int[] a = {1, 2, 3, 4, 5};
            int[] b = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
    
            for (int i = 0; i < a.length; i++) {
                b[a.length - i - 1] = a[i];
            }
            System.out.println(Arrays.toString(b));
        }
    ```
    这段代码的**输入数据**是a，**数据量**就等于a的长度。代码中有两个for循环，作用分别是给b数组初始化和赋值，其次初始化和赋值，其执行次数都与输入数据量相等。因此，代码的时间复杂度就是O(n)+O(n)，也就是O(n)。
    
    空间方面主要体现在计算过程中，对于存储资源的消耗情况，代码中定义了一个新的数组b，它与输入数组a的长度相等。因此空间复杂度就是O(n)。
  
- 方法二：定义缓存变量tmp，通过一个for循环，从0遍历到a数组长度的一般，交换首位对应的元素，最后输出a数组，得到结果
  ```
  public static void reverseTwo() {
      int[] a = {1, 2, 3, 4, 5};
      int tmp;
      for (int i = 0; i < (a.length / 2); i++) {
          tmp = a[i];
          a[i] = a[a.length - i - 1];
          a[a.length - i - 1] = tmp;
      }
      System.out.println(Arrays.toString(a));
  }
  ```
  这段代码包含了一个for循环，执行的次数是数组长度的一半，时间复杂度变成了O(n/2)。根据复杂度与具体的常系数无关的性质，这段代码的时间复杂度也就是O(n)。
  
  空间方面，定义了一个tmp变量，它与数组长度无关。也就是说，输入5个元素的数组，需要一个tmp变量；输入50个元素的数组，依然只需要tmp变量。因此，空间复杂度与输入数组长度无关，即O(1)。

  由上面的例子可见，采用不同的编码方式，对时间和空间的消耗是有可能不一样的。
  
### 时间复杂度与代码结构的关系
从本质来看，**时间复杂度**与代码的结构有着非常紧密的关系；而**空间复杂度**与数据结构的设计有关。

- 实例1
    - 定义了一个数组a = [1, 4, 3]，查找数组a中的最大值，代码如下
    ```
    public static void searchMax() {
        // 1. 定义数组
        int[] a = {1, 4, 3};
        // 2. 假设数组第一个元素为最大的元素
        int max_val = a[0];
        // 3. 遍历数据
        for (int j : a) {
            // 4. 循环将数组的元素与已设置的元素，如果数组的元素比设置的元素大，则将数组元素赋值给假设最大的元素
            if (j > max_val) {
                max_val = j;
            }
        }
        System.out.println(max_val);
    }
    ```
    这个例子比较简单，实现方法就是，暂存当前最大值并把所有元素遍历一遍即可。因为代码的结构上需要一个for循环，对数组的所有元素处理一遍，所以时间复杂度为O(n)。
- 实例2
    - 定义了一个数组 a = [1, 3, 4, 3, 4, 1, 3]，并会在这个数组中查找出现次数最多的那个数字
    ```
      public static void countNum() {
          // 1. 定义数组
          int[] a = {1, 3, 4, 3, 4, 1, 3};
          // 2. 设置数组的首元素为进行比较元素
          int temp_val = a[0];
          // 3. 当前元素出现的次数
          int time_temp;
          // 4. 全局最大次数变量
          int time_max = 0;
          // 5. 对数组每个元素进行遍历
          for (int k : a) {
              // 每次循环，将元素的次数初始化为0
              time_temp = 0;
              // 6.循环元素，并记录每个元素出现的次数
              for (int i : a) {
                  if (k == i) {
                      time_temp += 1;
                  }
              }
              // 7. 将内部循环的元素出现次数记录后与全局最大次数变量进行比较
              if (time_temp > time_max) {
                  time_max = time_temp;
                  temp_val = k;
              }
          }
          System.out.println(temp_val);
      }
    ```
    采用了双层循环的方式计算：
        - 第一层循环，对数组中的每个元素进行遍历；
        - 第二次循环，对每个元素技术算出的次数，并通过当前元素次数tim_tmp和全局最大次数变量time_max的大小关系，持续保持出现次数最多的那个元素及其出现次数。
        - 由于是双层循环，这段代码时间方面的消耗就是n*n的复杂度，也就是O(n^2)

### 分析递归复杂度
Fib：0，1，1，2，3，5，8，13，21
- F(n) = F(n-1) + F(n-2)

递归方式
```
int fib(int n){
    if (n<=2) return n;
}
```

### 一些经验性的结论：
- 一个顺序结构的代码，时间复杂度是 O(1)。
- 二分查找，或者更通用地说是采用分而治之的二分策略，时间复杂度都是 O(logn)。
- 一个简单的 for 循环，时间复杂度是 O(n)。
- 两个顺序执行的 for 循环，时间复杂度是 O(n)+O(n)=O(2n)，其实也是 O(n)。
- 两个嵌套的 for 循环，时间复杂度是 O(n²)。

### Master Theorem

## 空间复杂度
空间复杂度与数据结构的设计有关。