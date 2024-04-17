package persons.tasks.generator

import java.util.ArrayList
import java.util.List
import persons.tasks.taskDSL.Action
import persons.tasks.taskDSL.ExpressionConstantInt
import persons.tasks.taskDSL.IntExpression
import persons.tasks.taskDSL.MyArray
import persons.tasks.taskDSL.Person
import persons.tasks.taskDSL.Planning
import persons.tasks.taskDSL.Task

class ArraysHandler {


	
	def static List<MyArray> getArrays(Planning root) {
		return root.myarrays;
	}

	def static Integer getAllArraysSum(Planning root) {
		
		
		var List<MyArray> myArrays = new ArrayList<MyArray>()
		
		for (MyArray array: root.myarrays) {
			myArrays.add(array);
		}
		
		var Integer sum = 0		
		for (MyArray array: myArrays) {
			sum = sum + Integer.valueOf(getArraySum(array));
		}
		
		return sum;
	}


	def static Integer getArraySum(MyArray myArray) {
		
		var List<Integer> integers = getIntegerListFromArray(myArray)
		var Integer sum = 0		
		for (Integer value: integers) {
			sum = sum + value;
		}
		return sum;
	}
	
	
	def static List<Integer> getIntegerListFromArray(MyArray myArray) {
		var List<ExpressionConstantInt> arrayElements = myArray.getElements();
		var List<Integer> integers = new ArrayList<Integer>()
		
		for (ExpressionConstantInt expr: arrayElements) {
			var Integer value = Integer.valueOf(expr.value)
			integers.add(value)
		}
		
		return integers;
	}

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