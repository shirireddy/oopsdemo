
public class AddTime {
	int hours;
	int minutes;
	int seconds;
	AddTime(int h,int m,int s){
		hours=h;
		minutes=m;
		seconds=s;
	}
	void add(AddTime time2) {
		this.seconds+=time2.seconds;
		this.minutes+=time2.minutes;
		this.hours+=time2.hours;
		
		if(this.seconds>60) {
			this.minutes++;
			this.seconds=this.seconds-60;
		}
		if(this.minutes>60) {
			this.hours++;
			this.minutes=this.minutes-60;
		}
		 if(this.hours>12){
	            
	            this.hours=this.hours-12;
	     }
	}
	void display() {
		System.out.println("result after adding time is: "+this.hours+":"+this.minutes+":"+this.seconds);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTime time1=new AddTime(5,10,45);
		AddTime time2=new AddTime(6,40,45);
		time1.add(time2);
		time1.display();
	}

}
