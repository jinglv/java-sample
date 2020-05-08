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

// O(N) 如果n是100的话，就会执行100次
for(int i = 1; i <= n; i++) {
    System.out.println("Hey-I'm busy looking at:" + i);
}

// O(N^2) 如果n是100的话，循环嵌套100^2，如果是三次嵌套就是100^3
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n; j++) {
        System.out.println("Hey-I'm busy looking at:" + i + "and" + j);
    }
}

// O(log(n))
for(int i = 1; i < n; i = i * 2){
    System.out.println("Hey-I'm busy looking at:" + i);
}

// O(k^n) 递归的形式
int fib(int n){
    if(n < 2){
        return n;
    }
    return fib(n-1) + fib(n-2);
}
```
时间复杂度的曲线
## 空间复杂度

# 排序算法
# 数据结构基础
## 数据结构概述
- 存储数据的空间排列
- 查询数据的操作方式
- 数据结构核心：**有效占用空间、查询数据时间**
## 常见的数据结构
## 时间复杂度和空间复杂度