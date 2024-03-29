package persons.tasks.generator;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Duration;
import persons.tasks.taskDSL.LunchAction;
import persons.tasks.taskDSL.MeetingAction;
import persons.tasks.taskDSL.PaperAction;
import persons.tasks.taskDSL.PaymentAction;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;
import persons.tasks.taskDSL.TimeUnit;

@SuppressWarnings("all")
public class TextGenerator {
  public static CharSequence toText(final Planning root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Info of the planning ");
    String _name = root.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append("All Persons:");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Person> _persons = root.getPersons();
      for(final Person p : _persons) {
        _builder.append("\t");
        String _name_1 = p.getName();
        _builder.append(_name_1);
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append("All actions of tasks:");
    _builder.newLineIfNotEmpty();
    {
      EList<Task> _tasks = root.getTasks();
      boolean _hasElements = false;
      for(final Task t : _tasks) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("====== \n");
        } else {
          _builder.appendImmediate(" &", "");
        }
        CharSequence _action2Text = TextGenerator.action2Text(t.getAction());
        _builder.append(_action2Text);
        CharSequence _infoAction = TextGenerator.infoAction(t);
        _builder.append(_infoAction);
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("=====");
      }
    }
    _builder.newLine();
    _builder.append("\n");
    _builder.append("Other way of listing all tasks:");
    _builder.newLineIfNotEmpty();
    {
      List<Action> _actions = Auxiliary.getActions(root);
      boolean _hasElements_1 = false;
      for(final Action a : _actions) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" , ", "");
        }
        CharSequence _action2Text_1 = TextGenerator.action2Text(a);
        _builder.append(_action2Text_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  protected static CharSequence _action2Text(final LunchAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Lunch at location ");
    String _location = action.getLocation();
    _builder.append(_location);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected static CharSequence _action2Text(final MeetingAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Meeting with topic ");
    String _topic = action.getTopic();
    _builder.append(_topic);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected static CharSequence _action2Text(final PaperAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Paper for journal ");
    String _report = action.getReport();
    _builder.append(_report);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected static CharSequence _action2Text(final PaymentAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Pay ");
    int _amount = action.getAmount();
    _builder.append(_amount);
    _builder.append(" euro");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence infoAction(final Task t) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Duration _duration = t.getDuration();
      boolean _tripleNotEquals = (_duration != null);
      if (_tripleNotEquals) {
        _builder.append(" with duration: ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        int _dl = t.getDuration().getDl();
        _builder.append(_dl, "\t");
        _builder.append(" ");
        CharSequence _text = TextGenerator.toText(t.getDuration().getUnit());
        _builder.append(_text, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public static CharSequence toText(final TimeUnit u) {
    if (u != null) {
      switch (u) {
        case MINUTE:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("m");
          return _builder;
        case HOUR:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("h");
          return _builder_1;
        case DAY:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("d");
          return _builder_2;
        case WEEK:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("w");
          return _builder_3;
        default:
          break;
      }
    }
    return null;
  }

  public static CharSequence action2Text(final Action action) {
    if (action instanceof LunchAction) {
      return _action2Text((LunchAction)action);
    } else if (action instanceof MeetingAction) {
      return _action2Text((MeetingAction)action);
    } else if (action instanceof PaperAction) {
      return _action2Text((PaperAction)action);
    } else if (action instanceof PaymentAction) {
      return _action2Text((PaymentAction)action);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action).toString());
    }
  }
}
