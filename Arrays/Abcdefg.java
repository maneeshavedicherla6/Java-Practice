class Abcdefg {
    public static void main(String[] args) {
        String s="abcdefg";
        System.out.println(swap(s));
    }
    public static String swap(String s){
        char[] a=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(i==0||i%2==0){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            i++;
            j--;
        }
        return new String(a);
    }
}