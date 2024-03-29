package Tareas;

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements TaskObserver {
	private List<Task> tasks;

	public TaskManager() {
		this.tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		task.addObserver(this);
		tasks.add(task);
	}

	public void removeTask(Task task) {
		task.removeObserver(this);
		tasks.remove(task);
	}

	@Override
 	public void update(Task task) {
     	System.out.println("Se ha actualizado la fecha de vencimiento de la tarea: " + task.getTitle());
	}

 	public void displayTasks() {
 		for (Task task : tasks) {
 			System.out.println("Título: " + task.getTitle());
 			System.out.println("Descripción: " + task.getDescription());
 			System.out.println("Fecha de vencimiento: " + task.getDueDate());
 			System.out.println("-------------------");
 		}
 	}
}