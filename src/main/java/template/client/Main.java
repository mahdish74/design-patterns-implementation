package template.client;

import template.design.Driver;
import template.design.Pilot;
import template.design.Worker;

public class Main {
    public static void main(String[] args) {
        Worker pilot = new Pilot();
        pilot.doJob();

        Worker driver = new Driver();
        driver.doJob();
    }
}
