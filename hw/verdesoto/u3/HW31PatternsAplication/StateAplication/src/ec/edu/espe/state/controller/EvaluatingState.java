package ec.edu.espe.state.controller;

import static ec.edu.espe.state.controller.AdmissionInterface.GPA;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class EvaluatingState implements State {

    AdmissionInterface admission;

    public EvaluatingState(AdmissionInterface a){
        admission = a;
    }

    @Override
    public String receiveApplication() {
        return "Already received an application";
    }

    @Override
    public String qualifyApplicant(double g) {
        if(g >= GPA){
            admission.setState(admission.getProcessingState());
            return "The application is evaluated and will be finalized soon.";
        } else {
            admission.setState(admission.getWaitingState());
            return "The applicant is denied.";
        }
    }

    @Override
    public String admitStudent() {
        return "Must be evaluated first.";
    }

}
