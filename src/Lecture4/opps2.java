package Lecture4;

class opps2 {
    public static void main(String[] args) {
//        opps h = new opps();
//        System.out.print(h);
        Object arr[] = new Object[5];
        arr[0] = 1;
        arr[1] = "Hello";
        arr[2] = true;
        arr[3] = 1.07;
        arr[4] = 'e';

        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
