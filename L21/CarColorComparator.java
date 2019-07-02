package L21;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car_GenericFxnDemo> {

	@Override
	public int compare(Car_GenericFxnDemo t, Car_GenericFxnDemo o) {
		return t.color.compareTo(o.color);
	}
	
}
