/**
 * NIW.java
 *
 * Numbers Into Words (NIW) : a function to display the result of your calculations, 
 * amount of a check, phone number or any other number in words (english).
 *
 *
 * Fethi El Hassasna © 2015 (@fethica)
 *
 * Released under the MIT License.
 *
 * ------------------------------------------------
 *  author:  Fethi El Hassasna
 *  version: 1.2
 *  url:     http://fethica.com/project.php?pid=13
 *  source:  https://github.com/fethica/NumbersIntoWords
 */

package com.fethica;

public class NIW {
	
	public static final int MAXLENGTH = 9; // To control the max input number length
	
	public static String toEnglish(int number) {

		int hundred, dozen, unit, remain, y;
		boolean ten = false;
		String words = "";
		remain = number;

		for(int i=1000000000; i>=1; i/=1000)
		{
			y = remain/i;
			if(y!=0)
			{
				hundred = y/100;
				dozen  = (y - hundred*100)/10;
				unit = y-(hundred*100)-(dozen*10);
				switch(hundred)
				{
				case 0:
					break;
				case 1:
					words+="One Hundred ";
					break;
				case 2:
					if((dozen == 0)&&(unit == 0)) words+="Two Hundred ";
					else words+="Two Hundred ";
					break;
				case 3:
					if((dozen == 0)&&(unit == 0)) words+="Three Hundred ";
					else words+="Three Hundred ";
					break;
				case 4:
					if((dozen == 0)&&(unit == 0)) words+="Four Hundred ";
					else words+="Four Hundred ";
					break;
				case 5:
					if((dozen == 0)&&(unit == 0)) words+="Five Hundred ";
					else words+="Five Hundred ";
					break;
				case 6:
					if((dozen == 0)&&(unit == 0)) words+="Six Hundred ";
					else words+="Six Hundred ";
					break;
				case 7:
					if((dozen == 0)&&(unit == 0)) words+="Seven Hundred ";
					else words+="Seven Hundred ";
					break;
				case 8:
					if((dozen == 0)&&(unit == 0)) words+="Eight Hundred ";
					else words+="Eight Hundred ";
					break;
				case 9:
					if((dozen == 0)&&(unit == 0)) words+="Nine Hundred ";
					else words+="Nine Hundred ";
				}// endSwitch(hundred)

				switch(dozen)
				{
				case 0:
					break;
				case 1:
					ten = true;
					break;
				case 2:
					words+="Twenty ";
					break;
				case 3:
					words+="Thirty ";
					break;
				case 4:
					words+="Forty ";
					break;
				case 5:
					words+="Fifty ";
					break;
				case 6:
					words+="Sixty ";
					break;
				case 7:

					words+="Seventy ";
					break;
				case 8:
					words+="Eighty ";
					break;
				case 9:

					words+="Ninety ";
				} // endSwitch(dozen)

				switch(unit)
				{
				case 0:
					if(ten) words+="Ten ";
					break;
				case 1:
					if(ten) words+="Eleven ";
					else    words+="One ";
					break;
				case 2:
					if(ten) words+="Twelve ";
					else    words+="Two ";
					break;
				case 3:
					if(ten) words+="Thirteen ";
					else    words+="Three ";
					break;
				case 4:
					if(ten) words+="Fourteen ";
					else    words+="Four ";
					break;
				case 5:
					if(ten) words+="Fifteen ";
					else    words+="Five ";
					break;
				case 6:
					if(ten) words+="Sixteen ";
					else    words+="Six ";
					break;
				case 7:
					if(ten) words+="Seventeen ";
					else    words+="Seven ";
					break;
				case 8:
					if(ten) words+="Eighteen ";
					else    words+="Eight ";
					break;
				case 9:
					if(ten) words+="Nineteen ";
					else    words+="Nine ";
				} // endSwitch(unit)

				switch (i)
				{
				case 1000000:
					if(y>1) words+="Million ";
					else words+="Million ";
					break;
				case 1000:
					words+="Thousand ";
				}
			} // end if(y!=0)
			remain -= y*i;
			ten = false;
		} // end for

		if(words.length()==0) words+="Zero";

		return words;
	}//End toEnglish method

}
