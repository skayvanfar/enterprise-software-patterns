package BehavioralPatterns.Memento;

import java.util.ArrayList;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class Caretaker {

    private ArrayList<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento m) { savedStates.add(m); }
    public Memento getMemento(int index) { return savedStates.get(index); }
}
