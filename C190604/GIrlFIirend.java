package C190604;

public class GIrlFIirend {
//    String name;
//    int age;
    //现有数组

    /**
     *  写两个方法,分别实现冒泡排序和选择排序,对array进行升序排序
     *  ① 选择排序: 方法名是xuanze, 接收一个int数组类型, 返回一个int数组类型
     *  ② 冒泡排序: 方法名是maopao, 接收一个int数组类型，返回一个int数组类型
     *  ③ 在main函数中，调用两个函数
     */
//
//    public void bubbleSort() {
//        System.out.println("排序钱的数组："+array);
//        for (int i = 0;i<array.length-1;i++){//外层控制循环的次数，循环*.len-1次
//            for(int j = 0;j<array.length-1-i;j++){//内层控制每一次循环的排序次数
//                if (array[j] > array[j+1]) {
//                    if (array[j]>array[j+1]){
//                        int age = array[i];
//                        array[j+1]=age;
//                    }
//                }
//            }
//
//        }
//        System.out.println(array);
//    }

    public static void main(String[] args) {
        //System.out.println(name);
//        GIrlFIirend girl = new GIrlFIirend();
//        System.out.println(girl.name);
//        System.out.println(girl.age);
//        System.out.println(girl.array);
        int[] array = {9, 8, 10, 23, 89, 76, 45, 7, 23, 41};
//        public void bubbleSort() {
           // System.out.println("排序钱的数组："+array);
            for (int i = 0;i<array.length-1;i++){//外层控制循环的次数，循环*.len-1次
                for(int j = 0;j<array.length-1-i;j++){//内层控制每一次循环的排序次数
                    if (array[j] > array[j+1]) {
                       // if (array[j]>array[j+1]){
                            int age = array[i];
                            array[j+1]=age;
                            age = array[i];
                            System.out.print(array[i] + ",");
                        }
                    }
                }

            }
        }



 //   }

