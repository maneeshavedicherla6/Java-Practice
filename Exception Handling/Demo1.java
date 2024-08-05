class Demo1{
	public static void main(String[] args) {
		System.out.println("Main start.....");
		int a=10;
		int b=0;
		for(int i=1;i<=5;i++){
			if(i==5){
				if(b==0){
					b=5;
				}
				System.out.println(a/b);
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Main end.....");
	}
}