package ec.edu.espe.state.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class WaitingState implements State {

    AdmissionInterface admission;

    public WaitingState(AdmissionInterface a) {
        admission = a;
    }

    @Override
    public String receiveApplication() {
        admission.setState(admission.getEvaluatingState());
        return "Received an application.";
    }

    @Override
    public String qualifyApplicant(double g) {
        return "Must receive an application first.";
    }

    @Override
    public String admitStudent() {
        return "Must receive an application first.";
    }

}
