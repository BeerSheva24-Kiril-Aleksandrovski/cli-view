package telran.view;

import java.io.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.function.Predicate;

public class StandartInputOutput implements InputOutput{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintStream writer = System.out;
    @Override
    public String readString(String prompt) {
        writer.println(prompt);
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeString(String str) {
        writer.println(str);
    }

    @Override
    public Integer readInt(String prompt, String errorPrompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readInt'");
    }

    @Override
    public Long readLong(String prompt, String errorPrompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLong'");
    }

    @Override
    public Double readDouble(String prompt, String errorPrompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readDouble'");
    }

    @Override
    public Double readNumberRange(String prompt, String errorPrompt, double min, double max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readNumberRange'");
    }

    @Override
    public String readStringPredicate(String prompt, String errorPrompt, Predicate<String> predicate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStringPredicate'");
    }

    @Override
    public String readStringOptions(String prompt, String errorPrompt, HashSet<String> options) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStringOptions'");
    }

    @Override
    public LocalDate readIsoDate(String prompt, String errorPrompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readIsoDate'");
    }

    @Override
    public LocalDate readIsoDateRange(String prompt, String errorPrompt, LocalDate from, LocalDate to) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readIsoDateRange'");
    }
    
}
