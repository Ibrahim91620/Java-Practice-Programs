   class Gen<T>
  {
    T obj;
	Gen(T o){
	
	obj=o;
	
	}
	
	void showType(){
	
	System.out.println("Type of T is "+obj.getClass().getName());
	}
	
	class Generic{
	
	public static void main(String args[]){
	
	
	Gen<Integer> obj1=new Gen<Integer>(10);
	obj1.showType();
	Gen<String> obj2=new Gen<String>("MANUU");
	obj2.showType();
	
	
	}
	}
  }