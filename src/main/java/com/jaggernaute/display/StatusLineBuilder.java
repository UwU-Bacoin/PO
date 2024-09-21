package com.jaggernaute.display;

public class StatusLineBuilder {
    public String lineBuilder(String label, String value) {
        StringBuilder builder = new StringBuilder();
        builder.append(label)
                .append(value)
                .append(System.lineSeparator());
        return builder.toString();
    }
}
