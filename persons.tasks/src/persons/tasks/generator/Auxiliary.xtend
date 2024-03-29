package persons.tasks.generator

import java.util.ArrayList
import java.util.List
import persons.tasks.taskDSL.Action
import persons.tasks.taskDSL.Person
import persons.tasks.taskDSL.Planning
import persons.tasks.taskDSL.Task

class Auxiliary {
	
	def static List<Action> getActions(Planning root) {
		
		var List<Action> actionList = new ArrayList<Action>()
		for (Task t: root.tasks) {
			actionList.add(t.action);
		}
		return actionList;
	}
	
	def static Planning getPersonPlanning(Person person) {
		return person.eContainer() as Planning
	}
	
	// Более короткая запись с помощью фич Xtend
	def static List<Action> getActions2(Planning root) {
		return root.tasks.map[t|t.action];
	}
}