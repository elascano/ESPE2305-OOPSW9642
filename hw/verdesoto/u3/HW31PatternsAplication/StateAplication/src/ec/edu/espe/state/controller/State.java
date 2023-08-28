package ec.edu.espe.state.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public interface State {

    public String receiveApplication();

    public String qualifyApplicant(double g);

    public String admitStudent();
}
