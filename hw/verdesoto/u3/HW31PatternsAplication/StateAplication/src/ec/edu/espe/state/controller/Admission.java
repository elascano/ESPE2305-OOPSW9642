package ec.edu.espe.state.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Admission implements AdmissionInterface {

    static State waitingState;
    static State evaluatingState;
    static State processingState;
    static State state;

    public Admission() {
        waitingState = new WaitingState(this);
        evaluatingState = new EvaluatingState(this);
        processingState = new ProcessingState(this);
        state = waitingState;
    }

    @Override
    public void receiveApplication() {
        String message = state.receiveApplication();
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public void qualifyApplicantion(double g) {
        String message = state.qualifyApplicant(g);
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public void admitStudent() {
        String message = state.admitStudent();
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public State getWaitingState() {
        return waitingState;
    }

    @Override
    public State getEvaluatingState() {
        return evaluatingState;
    }

    @Override
    public State getProcessingState() {
        return processingState;
    }

    @Override
    public void setState(State s) {
        state = s;
    }

}
