package Tareas;

//Task.java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {
	private String title;
	private String description;
	private LocalDate dueDate;
	private List<TaskObserver> observers;

	public Task(String title, String description, LocalDate dueDate) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		observers = new ArrayList<>();
	}

	public void addObserver(TaskObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(TaskObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (TaskObserver observer : observers) {
			observer.update(this);
		}
	}

	public void updateDueDate(LocalDate newDueDate) {
		this.dueDate = newDueDate;
		notifyObservers();
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}
}