package mybehave.behaviortests;

public class Game {
	
	private int width,height;
	char[] test;
	public Game(int width,int height){
		this.width = width;
		this.height = height;
		test = new char[width*height];
		for(int i=0; i<width*height; i++)
			test[i] = '.';
	}
	
	public void toggleCellAt(int column, int row){
		if(test[width*column + row] == '.'){
			test[width*column + row] = 'x';
		} else {
			test[width*column + row] = '.';
		}
	}
	
	public void render(){
		for(int i=0; i<width*height; i++){
			if(i%height==0){
				System.out.println();
			}
			System.out.print(test[i]);
			
		}
	}
	
	public String toString(){
		String a = "";
		for(int i=0; i<width; i++){
			for(int j=0; j<height; j++){
				a+=test[j*height + i];
				if(j==height-1 && i<width-1){
					a+="\n";
				}
			}
					
		}
		return a.toUpperCase();
	}
}
