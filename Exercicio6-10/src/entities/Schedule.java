package entities;

public class Schedule {

	private int amountFriends;
	private int amountKnown;
	private String[] people;

	public Schedule(int amountFriends, int amountKnown) {
		this.amountFriends = amountFriends;
		this.amountKnown = amountKnown;

		people[0] = "Cristiano";
		people[1] = "Guilherme";
		people[2] = "Valdir";


		int random = 1 + (int) (Math.random() * 2);

		
		if (random == 1) {
			People p = (People) new Friend();
		}

		if (random == 2) {
			People c = (People) new Known();
		}
	}

	public String[] getPeople() {
		return people;
	}

	public void setPeople(String[] people) {
		this.people = people;
	}

	public int getAmountFriends() {
		return amountFriends;
	}

	public void setAmountFriends(int amountFriends) {
		this.amountFriends = amountFriends;
	}

	public int getAmountKnown() {
		return amountKnown;
	}

	public void setAmountKnown(int amountKnown) {
		this.amountKnown = amountKnown;
	}

	public void addInformation() {
	}

	public void printsBirthday() {
	}

	public void printEmail() {
	}
}
