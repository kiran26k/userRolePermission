package main.java.ing.utility;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSVUtility {

	private CSVUtility() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(CSVUtility.class);
	private static CSVParser csvReader;
	private static CSVPrinter csvPrinter;

	public static CSVParser read(String fileName) {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(fileName));
			csvReader = new CSVParser(reader,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
		} catch (IOException e) {
			LOGGER.error("read " + e);
		}
		return csvReader;
	}

	public static CSVPrinter write() {
		final String SAMPLE_CSV_FILE = "./user.csv";

		try {
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
			csvPrinter = new CSVPrinter(writer,
					CSVFormat.DEFAULT.withHeader("Id", "Name", "Designation", "Permission"));
		} catch (IOException e) {
			LOGGER.error("write " + e);
		}
		return csvPrinter;
	}

	public static void writeDataLineByLine(String filePath) {
		/*
		 * File file = new File(filePath); try { // create FileWriter object with file
		 * as parameter FileWriter outputfile = new FileWriter(file); CSVWriter writer =
		 * new CSVWriter(outputfile);
		 * 
		 * String[] header = { "Name", "Class", "Marks" }; writer.writeNext(header);
		 * 
		 * // add data to csv String[] data1 = { "Aman", "10", "620" };
		 * writer.writeNext(data1); String[] data2 = { "Suraj", "10", "630" };
		 * writer.writeNext(data2);
		 * 
		 * // closing writer connection writer.close(); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
