import java.lang.Math;
import java.util.ArrayList;
public class BasicJava {
//print the min max avg of the array
	public ArrayList minMaxAvg(int[] array){
		double min = array[0];
		double max = array[0];
		double sum = array[0];
		double avg = 0.0;
		//chose doubles to have decimal values for the average
		for( int i = 1; i < array.length; i++ ){
			if(array[i] > max){
				max = array[i];
			}else if(array[i] < min){
				min = array[i];
			}
			sum = sum + array[i];
			
		}
		avg = sum / array.length;
		System.out.println("Min value is: " + min);
		System.out.println("Max value is: " + max);
		System.out.println("Avg value is: " + avg);
		//create array of values to pass back out
		ArrayList<Object> answer = new ArrayList();
		answer.add(min);
		answer.add(max);
		answer.add(avg);
	return answer;
	}
//swap negative values with the string "Dojo"
	public ArrayList swapDojo(int[] array){
		ArrayList<Object> swapList = new ArrayList();
		for( int i = 0; i < array.length; i++ ){
			if (array[i] < 0){
				System.out.println("Swapping" + array[i]);
				swapList.add("Dojo");

			}else{
				swapList.add(array[i]);
			}
			
		}
		System.out.println(swapList);
		return swapList;

	}
//square all the values in an array
	public ArrayList arraySquare (int[] array){
		ArrayList<Object> squareList = new ArrayList();
		for( int i = 0; i < array.length; i++ ){
			System.out.println("Squaring " + array[i]);
			int temp = array[i] * array[i];
			squareList.add(temp);

		}
		System.out.println(squareList);
		return squareList;
	}
//print the odd values between 1 and 255
	public int printOdd(){
		for( int i = 1; i < 256; i += 2){
			System.out.println(i);
		}
		return 1;
	}
//shift the array to the left
	public ArrayList arrayShift (int[] array){
		ArrayList<Object> shiftList = new ArrayList();
		for( int i = 1; i < array.length; i++ ){
				shiftList.add(array[i]);
			}
		shiftList.add(0);
		System.out.println(shiftList);
		return shiftList;
	}

}
