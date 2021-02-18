public class Person5 {

	private Job job; //composition has-a relationship-----if we delete person job is also gone
	
	public Person5() 
	{
		this.job=new Job();
		job.setSalary(1000L);
		job.setId(123);
		job.setRole("Manager");
	}
	public long dispSalary() 
	{
		return job.getSalary();
	}
	public void dispDetails() {
		
		System.out.println(job.getId()+" "+job.getRole()+" "+job.getSalary());
	}
}
