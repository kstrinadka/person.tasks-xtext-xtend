package persons.tasks.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<Action> getActions(final Planning root) {
    List<Action> actionList = new ArrayList<Action>();
    EList<Task> _tasks = root.getTasks();
    for (final Task t : _tasks) {
      actionList.add(t.getAction());
    }
    return actionList;
  }

  public static Planning getPersonPlanning(final Person person) {
    EObject _eContainer = person.eContainer();
    return ((Planning) _eContainer);
  }

  public static List<Action> getActions2(final Planning root) {
    final Function1<Task, Action> _function = (Task t) -> {
      return t.getAction();
    };
    return ListExtensions.<Task, Action>map(root.getTasks(), _function);
  }
}
