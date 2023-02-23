public class varag {
    public int prod(int ...arr){
        int product=1;
        System.out.println("number of arguments:"+arr.length);
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
            System.out.println(arr[i]);
        }
        return product;
    }

    public static void main(String[] args) {
        varag v=new varag();
        int y=v.prod(7,2,5,3);
        System.out.println(y);
    }

    }

