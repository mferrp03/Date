package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}

	boolean isSameYear(Date another){
		if (this.year == another.getYear()){
			return true;
		}
		return false;
	}
	public int getMonth(){
		return this.month;
	}
	boolean isSameMonth(Date another){
		if (this.month == another.getMonth()){
			return true;
		}
		return false;
	}
	public int getDay(){
		return this.day;
	}
	boolean isSameDay(Date another){
		if (this.day == another.getDay()){
			return true;
		}
		return false;
	}
	boolean isSame(Date another){
		if((isSameDay(another)==true)&&(isSameMonth(another)==true)&&(isSameYear(another)==true) ){
			   return true;
			}
		return false;
	}
	public String getMonthName(){
		String name = new String();
		switch(this.month){
			case 1:
			name = "January";
			break;
			case 2:
			name = "February";
			break;
			case 3:
			name = "March";
			break;
			case 4:
			name = "April";
			break;
			case 5:
			name = "May";
			break;
			case 6:
			name = "June";
			break;
			case 7:
			name = "July";
			break;
			case 8:
			name = "August";
			break;
			case 9:
			name = "September";
			break;
			case 10:
			name = "October";
			break;
			case 11:
			name = "November";
			break;
			case 12:
			name = "December";
			break;
			}
		return name;
	}
	public boolean isDayOfMonthRight(){
		boolean correcto = false;
		switch(this.month){
			case 1:
				if(this.day<=31)
					correcto = true;
				break;
			case 3:
				if(this.day<=31)
					correcto = true;
				break;
			case 5:
				if(this.day<=31)
					correcto = true;
				break;
			case 7:
				if(this.day<=31)
					correcto = true;
				break;
			case 8:
				if(this.day<=31)
					correcto = true;
				break;
			case 10:
				if(this.day<=31)
					correcto = true;
				break;
			case 12:
				if(this.day<=31)
					correcto = true;
				break;
			case 2:
				if(this.day<=28)
					correcto = true;
				break;
			case 4:
				if(this.day<=30)
					correcto = true;
				break;
			case 6:
				if(this.day<=30)
					correcto = true;
				break;
			case 9:
				if(this.day<=30)
					correcto = true;
				break;
			case 11:
				if(this.day<=30)
					correcto = true;
				break;
		}
		return correcto;
	}
	public String seasonOfTheMonth(){
		String season = new String();
		switch(this.month){
			case 1:
			case 2:
			case 3:
				season = "winter";
				break;
			case 4:
			case 5:
			case 6:
				season = "spring";
				break;
			case 7:
			case 8:
			case 9:
				season = "summer";
				break;
			case 10:
			case 11:
			case 12:
				season = "fall";
				break;
			}
		return season;
	}
	public String monthsLeft(){

 	 StringBuilder months = new StringBuilder();

 	for(int i=this.month+1;i<=12;i++){
		Date monthsLeftDate = new Date(this.day,i,this.year);

    		months.append(monthsLeftDate.getMonthName() + "\t"); }

 	return months.toString();

}
	public String daysOfTheMonthLeft(){
	StringBuilder daysLeft = new StringBuilder();
	for(int i=this.day; i<=31;i++){
	Date daysLeftDate = new Date(i,this.month,this.year);

       		if(daysLeftDate.isDayOfMonthRight()==true){

        		daysLeft.append(daysLeftDate +"\t");
		
		}
	}
	
	return daysLeft.toString();
}
	public String monthsWithSameDays(){
	int i =31;
	StringBuilder sameSizeMonths = new StringBuilder();
	Date sameSizeMonthsDate = new Date(i,this.month,this.year);
	for(i = 31;(sameSizeMonthsDate.isDayOfMonthRight())==true;i--){
	Date sameSizeMonthsDate = new Date(i,this.month,this.year);
		if(sameSizeMonthsDate.isDayOfMonthRight()==true){
			for(int j = 1;j<=12;j++){
				Date sameSizeMonthDate = new Date(i,j,this.year);
				Date sameSizeControl = new Date(i+1,j,this.year);
				if(sameSizeMonthDate.isDayOfMonthRight()==true){
					if(sameSizeControl.isDayOfMonthRight()==false)
						sameSizeMonths.append(sameSizeMonthDate.getMonthName() + "\t");
					}
			}
		}
	}
	return sameSizeMonths.toString();
}
				
			
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
