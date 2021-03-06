动态规划分析：https://leetcode-cn.com/circle/article/lxC3ZB/

问题特征：
+   1、多阶段决策：意味着问题可以分解成子问题，子子问题，。。。，也就是说问题可以拆分成多个子问题进行求解
+   2、最优子结构：在自下而上的递推过程中，我们求得的每个子问题一定是全局最优解，既然它分解的子问题是全局最优解，那么依赖于它们解的原问题自然也是全局最优解。
+   3、自下而上：怎样才能自下而上的求出每个子问题的最优解呢，
    可以肯定子问题之间是有一定联系的，即迭代递推公式，也叫「状态转移方程」，要定义好这个状态转移方程， 我们就需要定义好每个子问题的状态（DP 状态），
    那为啥要自下而上地求解呢，因为如果采用像递归这样自顶向下的求解方式，子问题之间可能存在大量的重叠，大量地重叠子问题意味着大量地重复计算，这样时间复杂度很可能呈指数级上升（在下文中我们会看到多个这样重复的计算导致的指数级的时间复杂度），所以自下而上的求解方式可以消除重叠子问题。
要素：
-   最优子结构；
-   状态转移方程；
-   重叠子问题

判断是否问题属于动态规划解题思路
-   1、判断是否可用递归来解，可以的话进入步骤 2
-   2、分析在递归的过程中是否存在大量的重复子问题
-   3、采用备忘录的方式来存子问题的解以避免大量的重复计算（剪枝）
-   4、改用自底向上的方式来递推，即动态规划
+    ![avatar](http://note.youdao.com/noteshare?id=1ca56952f092b408c7cc0ef79f247eb2&sub=B38364F99CA040388E99423FF6DF1553)
