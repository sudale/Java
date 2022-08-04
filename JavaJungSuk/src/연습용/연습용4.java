package 연습용;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 연습용4 {
	public static boolean isValidCarNumber(String carNum) {

		boolean returnValue = false;

		try {
			String regex = "^\\d{2}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\x20]\\d{4}/*$";

			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(carNum);
			if (m.matches()) {
				returnValue = true;
			} else {
				
				
			}

			return returnValue;

		} catch (Exception e) {
			return false;
		}
	}

}
