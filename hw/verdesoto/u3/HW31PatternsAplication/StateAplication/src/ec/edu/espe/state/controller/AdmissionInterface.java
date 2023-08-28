package ec.edu.espe.state.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public interface AdmissionInterface {

    public static final double GPA = 3.0;

    public void receiveApplication();

    public void qualifyApplicantion(double g);

    public void admitStudent();

    public State getWaitingState();

    public State getEvaluatingState();

    public State getProcessingState();

    public void setState(State s);
}
