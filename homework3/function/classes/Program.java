package homework3.function.classes;

import homework3.function.abstractClasses.ACheckDataProcessor;
import homework3.function.abstractClasses.AFileWriter;
import homework3.function.abstractClasses.AProgram;
import homework3.function.classes.parseData.CDataParseProcessor;
import homework3.function.classes.ui.CGetData;
import homework3.function.classes.workWithFile.CFindTheSameFileName;

import java.io.IOException;

public class Program extends AProgram {
    private final CGetData getData;
    private final CDataParseProcessor dataParseProcessor;

    private final ACheckDataProcessor dataProcessor;
    private final AFileWriter fileWriter;


    public Program(CGetData getData,
                     CDataParseProcessor dataParseProcessor,
                     ACheckDataProcessor dataProcessor,
                     AFileWriter fileWriter
    ) {
        this.getData = getData;
        this.dataParseProcessor = dataParseProcessor;
        this.dataProcessor = dataProcessor;
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() throws IOException {
        dataParseProcessor.parseData(getData.getData());
        dataProcessor.checkQuantity(dataParseProcessor.getDataArray());
        dataProcessor.checkFullName(dataParseProcessor.getFullName());
        dataProcessor.checkBirthday(dataParseProcessor.getBirthday());
        dataProcessor.checkSex(dataParseProcessor.getSex());
        System.out.println("\nIs everything OK");
        fileWriter.writeToFile(dataParseProcessor.getInfoToWrite());
    }
}
