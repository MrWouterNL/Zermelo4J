package nl.mrwouter.zermelo4j.appointments;

import java.util.Comparator;

/**
 * Comparator used to make sure that all appointments are sorted from start to beginning.
 */
public class AppointmentComparator implements Comparator<Appointment> {

    @Override
    public int compare(Appointment app1, Appointment app2) {
        return Long.compare(app1.getStart(), app2.getStart());
    }
}
