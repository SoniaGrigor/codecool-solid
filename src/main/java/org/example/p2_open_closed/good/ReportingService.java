package org.example.p2_open_closed.good;

public class ReportingService {
    public void generateReportBasedOnStrategy(Reporting reportingStrategy)
    {
        System.out.println("===================================");
        System.out.println("Generating report based on Strategy");
        System.out.println("===================================");

        reportingStrategy.generateReport();
        System.out.println();
    }
}
