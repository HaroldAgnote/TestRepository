import java.util.ArrayList;

/**
 * "File Description"
 *
 * @author Harold Agnote
 */
public class mergeSortTest
{
	public static void main(String[]args)
	{
		ArrayList <Integer> list = new ArrayList <>();
		
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(9);
		list.add(0);
		list.add(7);
		list.add(8);
		System.out.println(list);
		mergeSort(list);
		System.out.println(list);
	}
	
	public static void mergeSort( ArrayList<Integer> list ) {
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int center;
		if(list.size() > 1){
			center = list.size() / 2;
			for(int i = 0; i < center; i++){
				left.add( list.get( i ) );
			}
			for(int i = center; i < list.size(); i++){
				right.add( list.get( i ) );
			}
			mergeSort( left );
			mergeSort( right );
			merge( left, right, list );
		}
	}
	private static void merge( ArrayList<Integer> left,
							   ArrayList<Integer> right, ArrayList<Integer> list ) {
		int iLeft = 0;
		int iRight = 0;
		int iList = 0;
		while(iLeft < left.size() && iRight < right.size()) {
			if((left.get(iLeft).compareTo(
					right.get(iRight)))<0){
				list.set( iList, left.get( iLeft ) );
				iLeft++;
			}else{
				list.set( iList, right.get( iRight ) );
				iRight++;
			}
			iList++;
		}
		ArrayList<Integer> rest;
		int iRest;
		if ( iLeft >= left.size() ) {
			rest = right;
			iRest = iRight;
		} else {
			rest = left;
			iRest = iLeft;
		}
		for (int i = iRest; i < rest.size(); i++) {
			list.set( iList, rest.get( i ) );
			iList++;
		}
	}
}
