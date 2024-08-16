class NumString {
    public static void main(String[] args) {
        String s="a1b2c3d4e5";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                sum+=(c-'0');
            }
            if(c>='a' && c<='z'){
                System.out.print(c);
            }
        }
        System.out.println();
        System.out.println(sum);
        
    }
}


