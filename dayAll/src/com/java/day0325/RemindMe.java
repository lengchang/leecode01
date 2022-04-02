package com.java.day0325;

/**
 * Created by asns on 2022/3/26.
 */
public class RemindMe {
    /**
     * 这里出现过两个问题，第一个就是包的引入，解决方法是 alt+Enter同时使用
     * 这个应该是同时可以用来引入自己的和官方的
     *
     * 数组元素是char型，是一个0或者'\u0000' 而不是'0'，是ASCII 中的0
     * 'a' 97  'A'  65  去看截图  也就是说小大相差32
     *
     * 组元素是引用数据类型的时候，初始化值是 null 不是"null"
     * 意思是空值，没有赋值的意思，这个实际上我自己最开始测试的时候，下意识就是这样实现的
     *
     *
     * int[] tis= new int[2001];//这里的2001实际上是按照题目的要求，因为是从1开始，而数组是从0
     * tis[arr[i]]=1;//就是arr[i]中有具体数值的是1，没有具体数值的变成0  核心
     *
     *
     * for (int i=1;i<2001;i++)//为什么这里从1开始？，因为第一个元素的零是不被认可的，缺失是从1开始的
     * {if(tis[i]!=0){continue;//利用continue结束当层循环的功能}
     * else num++;
     * if (num==n)  i一直在稳定增减，但是num却没有，而是根据是否等于0在相加
     * {temp=i;//这里是要等于i 的不是等于n的，不是让等价于输入值，而是让等于移动到的位置
     * //实际上是记录的i的循环的位置，也就是数组下标对应位置的值
     * break;
     * }}
     * return temp;
     *
     *
     *
     *
     * return Math.max(left,right)+1
     *
     *
     *
     *node.left= createTreeNode(integers,index*2);
     * node.right= createTreeNode(integers,index*2+1);
     * return node;
     */


    /**
     * ArrayList<String> arrayList = new ArrayList<String>();
     //        int[] ints= new int[]{1,2,3,4,5,6};
     //        Collections.reverse(ints); 不行
     //而实际上的数据反转方法，对应的是List类型的数据
     Collections.reverse(arrayList);//这个也是直接调用，而没有new的，为什么  因为方法是static
     */

    /**
     *  boolean isEquals= Arrays.equals(arr1,arr2);//这种类可以直接调用，而不用新建吗
     /**
     * 基本数据类型不需要new而直接定义，而引用数据类型在定义实例时需要new实例对象。
     *
     * Arrays.sort(arr3);//这个底层使用快速排序实现的
     System.out.println(Arrays.toString(arr3));

     System.out.println(Arrays.binarySearch(arr4, 210));//这个是底层实现的二分查找
     int index = Arrays.binarySearch(arr4,-34);
     System.out.println(index);//这也是一种根据方法的返回定义来设计的写法
     System.out.println(Arrays.binarySearch(arr4, 15));//这是数组中没有的情况
     //只要返回的是一个负数，就是没找到的意思
     //index返回的数据是一个大于零的数字就是找到了
     String[] arr5 = new String[]{"AA","BB","CC"};
     System.out.println(arr5[1].toString());//String数组是自己可以携带toString 函数的
     */


    /**
     * List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
     * //数组转化为 集合
     */

    /**
     * int max =(g.length>s.length)?g.length:s.length;
     *边界值条件
     * 胃口小于饼干，饼干胃口后移
     * 胃口大于饼干，胃口后移重新比较
     *
     */

    /**
     *    int out2 = nums.length;
     for (int i=0;i<out1-1;i++){//这种写法会死循环，在4的位置，因为4之后的所有都是4了，所以会一直循环前置，而无法后裔
     //也就是循环结束的边界条件满足不了
     */

    /**
     *for (int i=0;i<prices.length-1;i++)
     {
     int j=i+1;
     while (j<prices.length&&prices[j]>prices[i])
     {
     j=j+1;
     }
     if(j!=prices.length) {
     prices[i] = prices[i] - prices[j];
     }
     }
     return prices;

      沉下心来，两次循环结束，就是对某一个之后所有进行比较，比较的结果中复合要求的写出
    */

    /**
     * //对于N叉数来说，他的定义是一层一层孩子定义出来的，实际上用的是  List<Node> children 来实现的，那么也就是说，可以获得
     //        //的思路是对这个list进行循环，而用get实现是在是太难以想象了，所以想法是 foreach循环，递归的开始都是一样，空则return ;
     //        //对于此处来说，实际上的遍历调用了一个void的函数，所以不能return0，只能return；
     //        //这里是java中return的一种用法，return 0 实际上还是返回了一个数，但是return;代表的是方法的结束，而不返回值
     //        for (Node ch : root.children) {//前是后的元素
     //            helper(ch, res);//这里是必须使用childen的原因，在执行到叶子结点的时候，这个叶子结点作为root没有空
     if (root==null)
     return;//直接结束方法，但是不给任何返回值
     for (Node no:root.children)
     {
     //          helper(list,root.children);//这里就错了，这里放入一个数组型的对象了，
     // 实际上输入的是foreach体系下的，已经被放入结点的那个
     helper(list,no);
     }
     //执行循环到目的结点之后，就进行数据的放入
     list.add(root.val);
     */

    /**
     * string.replace(".", "[.]")
     */

    /**
     *  int sum= 0;
     public int sumOfLeftLeaves(TreeNode root)
     {
     //int sum= 0;//但是要注意了，这个sum放在这个位置，每次执行这个方法，都需要重新的赋值，所以是不行的，得拿出去
     //我的想法是，这还是一个遍历算法，可以用递归来做，只是需要把遍历的那一句修改一下位置
     //做法是判断是否是左子树和判断是否为叶子结点放在一起，而递归的部分和这些部分分开
     //第一步找到所有左子树，放入一个数组中，之后数组求和

     TreeNode leftNode = root.left;//这一句保证了走的一定是左子树
     if (leftNode!=null&&leftNode.left==null&&leftNode.right==null)//这是判断句，而不是循环句
     保证是叶子结点，然后递归
     {
     sum = sum+leftNode.val;
     }
     sumOfLeftLeaves(root.left);
     sumOfLeftLeaves(root.right);//
     */

    /**
     * 两个for循环 charat比较
     */

    /**
     * 丑数  反复除以，只要是余数是0，就一直下去，三个while实现
     */

    /**
     * 未出现的数字
     * 将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字。
     */

    /**
     *  //内外两层循环，循环比较是，用一个index记录相等的次数，等于一的，也就是自己和自己相等的输出
     //所以从开头上，index就需要一次循环重新定义一次
     for (int i=0;i<nums.length;i++){
     int index= 0;
     for (int j = 0;j<nums.length;j++)
     {
     if (nums[i]==nums[j])
     {
     index+=1;
     }
     }
     if (index==1)
     {
     return nums[i];
     }
     }
     */

    /**
     * if (stack.pop()!='(')  这个是一边输出了，一边进行比较，难得这个函数的应用
     {
     return false;
     }
     */

    /**
     * pro=pro*list.get(i);//首先，我忘了初始化了，其次，相乘的起手值必须是1
     */

    /**
     *  for (int i:arr)////未知数组长度时，进行循环的首选
     {
     hashMap.put(i,hashMap.getOrDefault(i,0)+1);
     }
     //之后的要求是，多个幸运数中返回最大的，如果是没有幸运数，则返回-1，这里的技巧是先定义一个          //count=-1  在其下面，进行修改，最后输出这个数
     int count=-1;
     //entrySet() 方法可以与 for-each 循环一起使用，用来遍历迭代 HashMap 中每一个映射项
     for (Map.Entry<Integer,Integer> entry:hashMap.entrySet())
     {
     int key = entry.getKey();int value = entry.getValue();
     if (key==value)
     {
     count = Math.max(count,key);
     }
     }
     return count;
     */

    /**
     * int k=start;
     for (int i=1;i<n;i++)
     {
     k^=(start+2*i);  ^=的意思是异或运算
     }
     */

    /**
     * Arrays.copyOfRange(int[] nums, x, index);这个是把一个数组截断放入另一个数组中；这个也学到了
     //所以这里需要知道阶段的数据的长度
     */

    /**
     * if (Math.sqrt(num)*Math.sqrt(num)==num)
     return true;
     */
    /**
     * char ch = s.charAt(i);
     if (ch >= 65 && ch <= 90) {
     ch += 32;
     }
     sb.append(ch);
     */
}
