package jfree;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Call the method to generate the bar chart
        generateBarChart();

        // Call the method to generate the line chart
        generateLineChart();

        // Call the method to generate the pie chart
        generatePieChart();

        // Call the method to generate the scatter plot
        generateScatterPlot();
    }

    public static void generateBarChart() {
        // Define the absolute file path to your CSV
        String filePath = "/Users/sm/Desktop/Moi/DataVisualisation/src/main/resources/RBI_WeeklyReport.csv";

        // Create a dataset to store the data for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Read data from CSV and populate the dataset
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;
            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    // Skip the header line
                    headerSkipped = true;
                    continue;
                }
                // Split the line by comma to extract individual values
                String[] parts = line.split(",");
                // Extract relevant values from the CSV columns
                String reportDate = parts[0];
                double currencyInCirculation = Double.parseDouble(parts[1]);
                double otherDeposits = Double.parseDouble(parts[2]);
                double bankersDeposits = Double.parseDouble(parts[3]);
                // Add more data parsing as needed for other columns

                // Add data to the dataset with appropriate series names and category labels
                dataset.addValue(currencyInCirculation, "Currency in Circulation", reportDate);
                dataset.addValue(otherDeposits, "Other Deposits", reportDate);
                dataset.addValue(bankersDeposits, "Bankers' Deposits", reportDate);
                // Add more series as needed
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        // Create a bar chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "RBI Weekly Report", // Chart title
                "Report Date", // X-Axis Label
                "Amount", // Y-Axis Label
                dataset, // Dataset containing the data
                PlotOrientation.VERTICAL, // Chart orientation
                true, // Include legend
                true, // Include tooltips
                false // URLs?
        );

        // Create a chart panel to display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Set panel size

        // Create a JFrame to contain the chart panel
        JFrame frame = new JFrame("Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        frame.add(chartPanel); // Add chart panel to the frame
        frame.pack(); // Adjust frame size to fit components
        frame.setVisible(true); // Set frame visibility to true to display it
    }

    public static void generateLineChart() {
        // Define the absolute file path to your CSV
        String filePath = "/Users/sm/Desktop/Moi/DataVisualisation/src/main/resources/RBI_WeeklyReport.csv";

        // Create a dataset to store the data for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Read data from CSV and populate the dataset
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;
            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    // Skip the header line
                    headerSkipped = true;
                    continue;
                }
                // Split the line by comma to extract individual values
                String[] parts = line.split(",");
                // Extract relevant values from the CSV columns
                String reportDate = parts[0];
                double reserveMoney = Double.parseDouble(parts[4]);
                // Add data to the dataset with appropriate series names and category labels
                dataset.addValue(reserveMoney, "Reserve Money", reportDate);
                // Add more series as needed
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        // Create a line chart using the dataset
        JFreeChart chart = ChartFactory.createLineChart(
                "Trend of Reserve Money Components", // Chart title
                "Report Date", // X-Axis Label
                "Amount", // Y-Axis Label
                dataset, // Dataset containing the data
                PlotOrientation.VERTICAL, // Chart orientation
                true, // Include legend
                true, // Include tooltips
                false // URLs?
        );

        // Create a chart panel to display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Set panel size

        // Create a JFrame to contain the chart panel
        JFrame frame = new JFrame("Line Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        frame.add(chartPanel); // Add chart panel to the frame
        frame.pack(); // Adjust frame size to fit components
        frame.setVisible(true); // Set frame visibility to true to display it
    }

    public static void generatePieChart() {
        // Define the absolute file path to your CSV
        String filePath = "/Users/sm/Desktop/Moi/DataVisualisation/src/main/resources/RBI_WeeklyReport.csv";

        // Create a dataset to store the data for the pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();

        // Read data from CSV and populate the dataset
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;
            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    // Skip the header line
                    headerSkipped = true;
                    continue;
                }
                // Split the line by comma to extract individual values
                String[] parts = line.split(",");
                // Extract relevant values from the CSV columns
                double rbiClaimsOnGovernment = Double.parseDouble(parts[5]);
                double rbiClaimsOnBanksCommercial = Double.parseDouble(parts[7]);
                double rbiClaimsOnCentralGovt = Double.parseDouble(parts[6]);
                // Add data to the dataset
                dataset.setValue("RBI's Claims on Government", rbiClaimsOnGovernment);
                dataset.setValue("RBI's Claims on Banks & Commercial Sector", rbiClaimsOnBanksCommercial);
                dataset.setValue("RBI's Claims on Central Govt", rbiClaimsOnCentralGovt);
                // Add more categories and values as needed
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        // Create a pie chart using the dataset
        JFreeChart chart = ChartFactory.createPieChart(
                "Composition of RBI's Claims", // Chart title
                dataset, // Dataset containing the data
                true, // Include legend
                true, // Include tooltips
                false // Don't include URLs
        );

        // Create a chart panel to display the pie chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Set panel size

        // Create a JFrame to contain the chart panel
        JFrame frame = new JFrame("Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        frame.add(chartPanel); // Add chart panel to the frame
        frame.pack(); // Adjust frame size to fit components
        frame.setVisible(true); // Set frame visibility to true to display it
    }

    public static void generateScatterPlot() {
        // Define the absolute file path to your CSV
        String filePath = "/Users/sm/Desktop/Moi/DataVisualisation/src/main/resources/RBI_WeeklyReport.csv";

        // Create a dataset to store the data for the scatter plot
        XYSeries series = new XYSeries("Currency vs. Bankers' Deposits");

        // Read data from CSV and populate the dataset
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;
            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    // Skip the header line
                    headerSkipped = true;
                    continue;
                }
                // Split the line by comma to extract individual values
                String[] parts = line.split(",");
                // Extract relevant values from the CSV columns
                double currencyInCirculation = Double.parseDouble(parts[1]);
                double bankersDeposits = Double.parseDouble(parts[3]);
                // Add data to the dataset
                series.add(currencyInCirculation, bankersDeposits);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        // Add the series to the dataset collection
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Create a scatter plot using the dataset
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Currency vs. Bankers' Deposits", // Chart title
                "Currency in Circulation", // X-Axis Label
                "Bankers' Deposits", // Y-Axis Label
                dataset // Dataset containing the data
        );

        // Create a chart panel to display the scatter plot
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Set panel size

        // Create a JFrame to contain the chart panel
        JFrame frame = new JFrame("Scatter Plot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        frame.add(chartPanel); // Add chart panel to the frame
        frame.pack(); // Adjust frame size to fit components
        frame.setVisible(true); // Set frame visibility to true to display it
    }
}
