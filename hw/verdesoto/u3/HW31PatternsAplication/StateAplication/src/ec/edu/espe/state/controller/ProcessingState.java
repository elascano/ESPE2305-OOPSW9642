package ec.edu.espe.state.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class ProcessingState implements State {

    AdmissionInterface admission;

    public ProcessingState(AdmissionInterface a) {
        admission = a;
    }

    @Override
    public String receiveApplication() {
        return "the application is finalized";
    }

    @Override
    public String qualifyApplicant(double g) {
        return "The applicarion is finalized";
    }
    

    @Override
    public String admitStudent() {
        admission.setState(admission.getWaitingState());
        return "The application is finalized and an admission letter is in the mail.";
    }

}
