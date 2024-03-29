package Tareas;

import java.time.LocalDate;

public class main {
	public static void Main(String[] args) {
		// Ejemplo: Implementación de la aplicación
		TaskManager taskManager = new TaskManager();

		LocalDate date = LocalDate.of(2022, 12, 31);
		Task task1 = new Task("Tarea 1", "Descripción de tarea 1", date);
		Task task2 = new Task("Tarea 2", "Descripción de tarea 2", date.plusDays(1));

		taskManager.addTask(task1);
		taskManager.addTask(task2);

		taskManager.displayTasks();

		task1.updateDueDate(date.plusDays(2));
	}
}


